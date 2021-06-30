package com.frogobox.koin.resource

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
class HelloRepository : IHelloRepository {
    override fun giveHello(): String {
        return "Hello Koin"
    }

}