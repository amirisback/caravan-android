package com.frogobox.testing

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
class CuboidModel {
    private var width = 0.0
    private var length = 0.0
    private var height = 0.0
    fun getVolume(): Double = width * length * height
    fun getSurfaceArea(): Double {
        val wl = width * length
        val wh = width * height
        val lh = length * height
        return 2 * (wl + wh + lh)
    }
    fun getCircumference(): Double = 4 * (width + length + height)
    fun save(width: Double, length: Double, height: Double) {
        this.width = width
        this.length = length
        this.height = height
    }
}