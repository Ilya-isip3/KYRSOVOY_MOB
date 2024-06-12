package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kyrsovoy.databinding.ActivityBasicsSyntaxBinding
import com.example.kyrsovoy.databinding.ActivityMainMenuBinding

class Basics_syntax : AppCompatActivity() {

    private lateinit var binding : ActivityBasicsSyntaxBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicsSyntaxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.VaDT.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            startActivity(intent)
        }
    }
}