package com.example.weather

import java.util.*

class StringHelper {
    fun getCitiesfromString(string : String): Array<City> {
        var cityVector =  Vector<City>();
        val array = string.split(",").toTypedArray()
        for (i in array) {
            cityVector.addElement(City(i, "00"))
        }
        val cityArray : Array<City> = cityVector.toTypedArray()
        return cityArray
    }
}