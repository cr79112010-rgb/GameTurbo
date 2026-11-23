package com.ss.gameturbo
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
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
