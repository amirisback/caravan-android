package com.frogobox.viewmodel.calculator

import androidx.lifecycle.ViewModel
import com.frogobox.viewmodel.model.Number

/*
 * Created by faisalamir on 26/06/21
 * Playground
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
class CalculatorViewModel : ViewModel() {

    var result: String = ""

    fun sum(number: Number){
        result = (number.x + number.y).toString()
    }

    fun minus(number: Number) {
        result = (number.x - number.y).toString()
    }

    fun multiple(number: Number) {
        result = (number.x * number.y).toString()
    }

    fun division(number: Number) {
        if (number.y != 0) {
            result = (number.x / number.y).toString()
        } else {
            result = "can't divide by zero"
        }

    }

}