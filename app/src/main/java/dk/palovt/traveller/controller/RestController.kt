package dk.palovt.traveller.controller

import android.os.Build
import java.io.BufferedReader
import java.net.HttpURLConnection
import java.net.URL

class RestController {

    object Constants {
        val BASE_URL: URL = URL("http://xmlopen.rejseplanen.dk/bin/rest.exe")
    }

    fun getMatchingLocations(userInput: String) {
        val url = URL(Constants.BASE_URL.path.plus("location?input=$userInput"))
        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    println(line)
                }
            }
        }
    }

}