package com.example.kyrsovoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.kyrsovoy.databinding.ActivityTheCompilerBinding

class The_compiler : AppCompatActivity() {
    private lateinit var b : ActivityTheCompilerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityTheCompilerBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.webView.settings.javaScriptEnabled = true

        b.webView.webViewClient = WebViewClient()

        b.webView.loadUrl("https://dotnetfiddle.net/Mobile#code-editor")

        b.Tema.setOnClickListener {
            val intent = Intent(this@The_compiler, main_menu::class.java)
            startActivity(intent)
        }

    }
}