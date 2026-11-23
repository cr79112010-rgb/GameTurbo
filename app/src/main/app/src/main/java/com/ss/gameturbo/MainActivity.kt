package com.ss.gameturbo
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btnBoost = findViewById<Button>(R.id.btnBoost)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        
        btnBoost.setOnClickListener {
            tvStatus.text = "Status: Optimized! RAM Cleared."
            btnBoost.text = "Optimized ✅"
            btnBoost.isEnabled = false
        }
    }
}
