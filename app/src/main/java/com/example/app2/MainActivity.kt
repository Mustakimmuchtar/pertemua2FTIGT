package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.app2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var SkorA = 0
    var SkorB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlusA.setOnClickListener {
            SkorA = SkorA + 1
            binding.skorA.text = SkorA.toString()
        } //tombol + Team A

        binding.btnPlusB.setOnClickListener {
            SkorB = SkorB + 1
            binding.skorB.text = SkorB.toString()
        } //tombol + A

        binding.btnMinA.setOnClickListener {
            if(SkorA > 0) {
                SkorA = SkorA - 1
                binding.skorA.text = SkorA.toString()
            }
        } // tombol - Team A

        binding.btnMinB.setOnClickListener {
            if (SkorB > 0) {
                SkorB = SkorB - 1
                binding.skorB.text = SkorB.toString()
            }
        } // tombol - Team B

    }
}