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

    var result: Int = 0

    fun sum(number: Number){
        result = number.x + number.y
    }

    fun minus(number: Number) {
        result = number.x - number.y
    }

    fun multiple(number: Number) {
        result = number.x * number.y
    }

    fun division(number: Number) {
        result = number.x / number.y
    }

}