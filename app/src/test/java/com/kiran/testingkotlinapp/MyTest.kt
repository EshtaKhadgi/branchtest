package com.kiran.testingkotlinapp

import org.junit.Assert
import org.junit.Test

class MyTest {
    private lateinit var arithmetic: Arithmetic
    // addition test
    @Test
    fun testAddition(){
        val maileExpectGareko = 7
        arithmetic = Arithmetic()
        arithmetic.first = 3
        arithmetic.second = 2
        val actualResult = arithmetic.add()
        Assert.assertEquals(maileExpectGareko,actualResult)
    }
    @Test
    fun testSubtract(){
        val maileExpectGareko =1
        arithmetic = Arithmetic()
        arithmetic.first = 3
        arithmetic.second = 2
        val actualResult = arithmetic.subtract()
        Assert.assertEquals(maileExpectGareko,actualResult)
    }
}