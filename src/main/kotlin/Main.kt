import kotlinx.coroutines.*
import sun.rmi.runtime.Log

fun main(): Unit = runBlocking {
    runBlocking {
        println("Hello")
        delay(5000L)
    }

    coroutineScope {
        println("Start show")
    }
}

suspend fun showResult(token: Int) {
    println("Start show")
    println("$token")
}

suspend fun getToken(): Int {
    delay(2000L)
    return 10
}