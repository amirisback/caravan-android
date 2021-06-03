package com.frogobox.testing

import org.junit.Test

import org.junit.Assert.*
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

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
class UtilsTest {

    @Test
    fun toSimpleString() {
        val dateFormat: DateFormat = SimpleDateFormat("MM/dd/yyyy")
        var date: Date? = null
        try {
            date = dateFormat.parse("02/28/2018")
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        assertEquals("Wed, 28 Feb 2018", date?.let { com.frogobox.testing.Utils.toSimpleString(it) })
    }
}