package com.example.calculator_app.util

import android.widget.Toast
import androidx.core.content.contentValuesOf

class Calculator {

    fun sum(a: Double, b: Double): Double {
        return a + b

    }

    fun subtract(a: Double, b: Double): Double {

        return a - b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
          return 0.0
        } else {
            return a / b


        }





    }
    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divisible(a: Double, b: Double): Double {

        return a % b
    }
}