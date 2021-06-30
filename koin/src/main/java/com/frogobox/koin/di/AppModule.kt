package com.frogobox.koin

import com.frogobox.koin.presenter.HelloPresenter
import com.frogobox.koin.resource.HelloRepository
import com.frogobox.koin.resource.IHelloRepository
import com.frogobox.koin.viewmodel.HelloViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

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
val appModule = module {

    // single instance of HelloRepository
    single<IHelloRepository> { HelloRepository() }

    // Simple Presenter Factory
    factory { HelloPresenter(get()) }
    viewModel { HelloViewModel(get()) }
}