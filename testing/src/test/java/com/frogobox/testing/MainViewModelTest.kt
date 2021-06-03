package com.frogobox.testing

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.mock

/*
 * Created by faisalamir on 02/06/21
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
class MainViewModelTest {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var cuboidModel: CuboidModel

    private val dummyLength = 12.0
    private val dummyWidth = 7.0
    private val dummyHeight = 6.0

    private val dummyVolume = 504.0

    @Before
    fun before() {
        cuboidModel = mock(CuboidModel::class.java)
        mainViewModel = MainViewModel(cuboidModel)
    }


    @Test
    fun testVolume() {
        cuboidModel = CuboidModel()
        mainViewModel = MainViewModel(cuboidModel)
        mainViewModel.save(dummyWidth, dummyLength, dummyHeight)
        val volume = mainViewModel.getVolume()
        assertEquals(dummyVolume, volume, 0.0001)
    }

//    @Test
//    fun getCircumference() {
//    }
//
//    @Test
//    fun getSurfaceArea() {
//    }
//
//    @Test
//    fun getVolume() {
//    }
//
//    @Test
//    fun save() {
//    }
}