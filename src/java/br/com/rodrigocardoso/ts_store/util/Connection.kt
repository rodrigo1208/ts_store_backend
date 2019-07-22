package br.com.rodrigocardoso.ts_store.util

import com.zaxxer.hikari.HikariDataSource
import org.jooq.Configuration
import org.jooq.SQLDialect
import org.jooq.impl.DefaultConfiguration
import java.net.URI

object Connection {
    private var uri: URI? = null
    private val url: String
    private val database: String
    private val host: String
    private val userName: String
    private val password: String
    private var driver: String = "org.postgresql.Driver"
    val configuration: Configuration

    init {
        val isHerokuConnection: Boolean = System.getenv("HEROKU_CON")?.toBoolean() ?: false
        if (!System.getenv("DRIVER").isNullOrEmpty()) driver = System.getenv("DRIVER")
        Class.forName(driver)

        if (isHerokuConnection) {
            uri = URI(System.getenv("DATABASE_URL"))
            val split = uri!!.userInfo.split(":")
            userName = split[0]
            if (split.size > 1)
                password = split[1]
            else
                password = ""

            database = uri!!.path
            host = uri!!.host
            url = getUrl(host, uri!!.port, database, "postgresql")
        } else {
            host = System.getenv("HOST")
            database = "/".plus(System.getenv("DATABASE"))
            userName = System.getenv("USER_NAME")
            password = System.getenv("PASSWORD")
            url = getUrl(host, 5432, database, "postgresql")
        }

        configuration = loadDataSource()
    }

    private fun loadDataSource(): Configuration {
        val dataSource = HikariDataSource()
        with(dataSource) {
            username = userName
            password = Connection.password
            jdbcUrl = url
            connectionTimeout = 30000
            idleTimeout = 60_000
            maxLifetime = 600_000
            leakDetectionThreshold = 15000
            maximumPoolSize = 3
            poolName = "ConnectionPool"
        }
        return DefaultConfiguration().set(dataSource).set(SQLDialect.POSTGRES_9_5)
    }

    private fun getUrl(host: String, port: Int?, database: String, databaseType: String): String {
        return String.format("jdbc:%s://%s:%d%s", databaseType, host, port, database)
    }
}