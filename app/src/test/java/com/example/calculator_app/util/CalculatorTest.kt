package com.example.calculator_app.util

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class CalculatorTest {
    private lateinit var mCalculator: Calculator

    @Before
    fun setUp() {
        mCalculator = Calculator()
    }
    //arrange
    var sumInputA:Double = 1.0
    var sumInputB:Double = 5.0
    var sumDelta:Double = 0.0
    var expected:Double = 6.0


    //assert and act



    @Test
    fun sum() {
        assertEquals(expected, mCalculator.sum(sumInputA, sumInputB),sumDelta)
    }

    //arrange
    var subInputA:Double = 10.0
    var subInputB:Double = 4.0
    var subDelta:Double = 0.0
    var sunExpected:Double = 6.0

    //assert and act


    @Test
    fun subtract() {
        assertEquals(sunExpected, mCalculator.subtract(subInputA, subInputB),subDelta)
    }

    //arrange
    var divInputA:Double = 10.0
    var divInputB:Double = 4.0
    var divDelta:Double = 0.0


    //assert and act


    @Test
    fun divide() {
        assertEquals(2.0, mCalculator.divide(10.0, 5.0),0.0)
    }

    @Test
    fun multiply() {
        assertEquals(20.0,mCalculator.multiply(2.0,10.0),0.0)
    }

    @Test fun divisible(){
        assertEquals(1.0,mCalculator.divisible(3.0,2.0),0.0)

    }

}


