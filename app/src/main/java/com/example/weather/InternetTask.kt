package com.example.weather

import org.json.JSONObject
import java.net.URL

class InternetTask : Runnable {
    @Volatile var response : String = ""

    public fun getResponseString(): String {
        return response
    }

    override fun run() {
        println(URL("https://google.com").readText())
        println("******************************************************")
    }

}