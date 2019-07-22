package br.com.rodrigocardoso.ts_store.util

import java.security.SecureRandom
import java.util.*
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec

class Password (password: CharArray) {
    private var password: CharArray
    val salt: ByteArray
    val generatedPassword: ByteArray

    init {
        this.salt = this.getNextSalt()
        this.password = password
        this.generatedPassword = hash(password, salt)
    }

    private fun getNextSalt(): ByteArray {
        val salt = ByteArray(16)
        random.nextBytes(salt)
        return salt
    }

    companion object Validate {
        private val random = SecureRandom()
        private const val interactions = 10000
        private const val keyLength = 250

        fun validate(password: CharArray, salt: ByteArray, compareHash: ByteArray): Boolean {
            val pwdHash = hash(password, salt)
            Arrays.fill(password, Character.MIN_VALUE)
            if (pwdHash.size != compareHash.size) return false
            for (i in 0 until pwdHash.size) {
                if (pwdHash[i] != compareHash[i]) return false
            }
            return true
        }

        private fun hash(password: CharArray, salt: ByteArray): ByteArray {
            val spec = PBEKeySpec(password, salt, interactions, keyLength)
            Arrays.fill(password, Character.MIN_VALUE)
            try {
                val skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1")
                return skf.generateSecret(spec).encoded
            } catch (e: Exception) {
                e.printStackTrace()
                throw AssertionError("Cant create Hash: " + e.message)
            } finally {
                spec.clearPassword()
            }
        }
    }
}