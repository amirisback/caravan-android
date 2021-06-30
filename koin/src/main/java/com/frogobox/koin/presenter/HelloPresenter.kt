package com.frogobox.koin.presenter

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
class HelloPresenter(val repository: IHelloRepository) {

    fun sayHello() = "${repository.giveHello()} from $this"

}