package com.geektech.testing

import androidx.core.text.isDigitsOnly

class Math {

    val integerChars =  '0'..'9'

    fun add(a:String, b:String): String {
        var result = ""

        if(a.isInteger() && b.isInteger()){
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else {
            result = "Вы объязаны ввести числа"
        }
        return result
    }

    fun divide(a:String, b:String): String {
        var result = ""

        if(a.isInteger() && b.isInteger() && b!="0"){
            result = (a.toDouble() / b.toDouble()).toString()

            if(result.toDouble().toInt().toDouble() == result.toDouble()){
                result = result.toDouble().toInt().toString()}

        } else if (a.contains(".") || b.contains(".")) {
            result = "Введите целые числа"
        } else if (b == "0") {
            result = "На ноль делить нельзя"
        }else {
            result = "Вы объязаны ввести числа"
        }
        return result
    }

//    fun String.isInteger() = this.all{it in integerChars}
    fun String.isInteger() = this.toIntOrNull()?.let { true }?:false
}