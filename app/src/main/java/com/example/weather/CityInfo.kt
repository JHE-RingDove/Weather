package com.example.weather

data class CityInfo (
    val name : String = "Name",
    val degrees : String = "00.0",
    val pic0 : String = "",
    val condition: String = "Cond",
    val forecast : String = "",
    val forecastArray : Array<forecast0>) {

    data class forecast0 (
        val min : String = "00.0",
        val max : String = "00.0",
        val condition: String = "Cond",
        val pic : String = ""
            )

}