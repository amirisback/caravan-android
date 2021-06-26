package com.frogobox.viewmodel.greeting

import androidx.lifecycle.ViewModel
import com.frogobox.viewmodel.utils.Constant
import com.frogobox.viewmodel.model.People

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
class GreetingViewModel : ViewModel() {

    var greetingPeople : String = ""

    fun greeting(people: People) {
        if (people.gender == Constant.GENDER_MAN) {
            greetingPeople = "Hello Mr. ${people.name}"
        } else if (people.gender == Constant.GENDER_WOMAN) {
            greetingPeople = "Hi Mrs. ${people.name}"
        }
    }

}