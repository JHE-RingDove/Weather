package com.example.weather

import android.content.Context
import android.content.SharedPreferences
import androidx.test.core.app.ApplicationProvider


 open class SaveData {
    private val prefName = "CityList"
    private var privateMode = 0
    private var pref : SharedPreferences = ApplicationProvider.getApplicationContext<Context>().getSharedPreferences(prefName, privateMode)
    private var editor: SharedPreferences.Editor = pref.edit()

    public fun save(string : String) {
        editor.putString(prefName, string)
    }

    public fun get() : Array<String> {
        var cityList : String = pref.getString(prefName, "Oryol") as String
        return cityList.split(",").toTypedArray()

    }

    public fun delete() {
        editor.clear()
        editor.commit() // commit changes
    }
}