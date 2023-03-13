package com.geektech.testing

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("4", math?.    add("2", "2"))
    }

    @Test
    fun simpleSymbolTest(){
        assertEquals("Вы объязаны ввести числа", math?.add("xcvbghnjmkl", "3"))
    }

    @Test
    fun simpleWithPlusTest(){
        assertEquals("4", math?.add("+2", "2"))
    }

    @Test
    fun simpleWithEmptyTest(){
        assertEquals("Вы объязаны ввести числа", math?.add("2", ""))
    }

    @Test
    fun simpleWithNegativeTest(){
        assertEquals("0", math?.add("-2", "2"))
    }

    @Test
    fun simpleWithDoubleTest(){
        assertEquals("Введите целые числа", math?.add("2", "2.0"))
    }




    @Test
    fun simpleDivide(){
        assertEquals("4", math?.divide("8", "2"))
    }

    @Test
    fun simpleSymbolDivide(){
        assertEquals("Вы объязаны ввести числа", math?.divide("8", "2asdv"))
    }

    @Test
    fun simpleZeroDivide(){
        assertEquals("На ноль делить нельзя", math?.divide("8", "0"))
    }

    @Test
    fun simpleNotNullDivide(){
        assertEquals("-2", math?.divide("-4", "2"))
    }

    @Test
    fun simpleEmptyDivide(){
        assertEquals("Вы объязаны ввести числа", math?.divide("", "2"))
    }

    @Test
    fun simpleDoubleDivide(){
        assertEquals("Введите целые числа", math?.divide("4.0", "2"))
    }

    @Test
    fun simpleResultDoubleDivide(){

        assertEquals("8.0", math?.divide("16", "2",))
    }


    @After
        fun detach(){
        math = null
    }
}