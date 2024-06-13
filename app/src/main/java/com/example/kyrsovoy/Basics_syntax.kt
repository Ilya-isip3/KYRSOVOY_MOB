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

        binding.OS.setOnClickListener {
            val intent = Intent(this@Basics_syntax, main_menu::class.java)
            startActivity(intent)
        }

        binding.VaDT.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 1)
            startActivity(intent)
        }

        binding.IOD.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 2)
            startActivity(intent)
        }
        binding.OaV.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 3)
            startActivity(intent)
        }

        binding.IfSwitch.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 4)
            startActivity(intent)
        }
        binding.For.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 5)
            startActivity(intent)
        }
        binding.Mass.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 6)
            startActivity(intent)
        }
        binding.Funct.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 7)
            startActivity(intent)
        }
        binding.IaAC.setOnClickListener{
            val intent = Intent(this@Basics_syntax, Teoriya::class.java)
            intent.putExtra("mykey", 8)
            startActivity(intent)
        }
    }
}