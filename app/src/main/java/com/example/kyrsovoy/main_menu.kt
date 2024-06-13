package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kyrsovoy.databinding.ActivityMainMenuBinding
import com.example.kyrsovoy.databinding.ActivityTheCompilerBinding

class main_menu : AppCompatActivity() {
    private lateinit var binding : ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compiler.setOnClickListener {
            val intent = Intent(this@main_menu, The_compiler::class.java)
            startActivity(intent)
        }

        binding.OS.setOnClickListener{
            val intent = Intent(this@main_menu, Basics_syntax::class.java)
            startActivity(intent)
        }

        binding.OOP.setOnClickListener {
            val intent = Intent(this@main_menu, OOPPage::class.java)
            startActivity(intent)
        }
    }
}