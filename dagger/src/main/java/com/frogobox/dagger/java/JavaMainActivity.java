package com.frogobox.dagger.java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.frogobox.dagger.R;

public class JavaMainActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);

        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        car.drive();

    }
}
