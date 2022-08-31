package com.example.weather

import android.os.AsyncTask
import java.net.URL

class ATask : AsyncTask<String?, String?, String>() {

    override fun doInBackground(vararg p0 : String?) : String {
//        return URL("https://google.com").readText()
        return URL(p0[0]).readText()
    }

}