package com.frogobox.dagger.java;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TrainingDagger
 * Copyright (C) 13/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.dagger.java
 */
public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private com.frogobox.dagger.java.Wheels wheels;

    @Inject
    public Car(Engine engine, com.frogobox.dagger.java.Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.d(TAG, "driving.....");
    }
}
