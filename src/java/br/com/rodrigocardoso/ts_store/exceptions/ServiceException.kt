package br.com.rodrigocardoso.ts_store.exceptions

import br.com.rodrigocardoso.ts_store.ResponseStatus
import java.lang.Exception

class ServiceException (val status: ResponseStatus, override val message: String) : Exception() { }