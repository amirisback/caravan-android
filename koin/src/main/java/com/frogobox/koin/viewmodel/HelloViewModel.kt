package com.frogobox.koin.viewmodel

import androidx.lifecycle.ViewModel
import com.frogobox.koin.resource.IHelloRepository

/*
 * Created by faisalamir on 30/06/21
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
class HelloViewModel(val repository: IHelloRepository) : ViewModel() {

    fun sayHello() = "${repository.giveHello()} from $this"

}