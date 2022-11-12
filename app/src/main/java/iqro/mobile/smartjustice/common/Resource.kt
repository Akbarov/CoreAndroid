package iqro.mobile.smartjustice.common

/**
 *Created by Zohidjon Akbarov
 */
sealed class Resource<T>(data: T?, message: String? = null) {
    data class Success<T>(val data: T?) : Resource<T>(data)
    data class Error<T>(val data: T? = null, val message: String?) : Resource<T>(data, message)
}
