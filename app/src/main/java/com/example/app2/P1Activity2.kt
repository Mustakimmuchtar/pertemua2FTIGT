package com.example.app2

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app2.databinding.ActivityP12Binding

class P1Activity2 : AppCompatActivity() {
    private lateinit var binding: ActivityP12Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityP12Binding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}