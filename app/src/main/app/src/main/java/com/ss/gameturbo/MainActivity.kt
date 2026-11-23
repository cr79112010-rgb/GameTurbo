package com.ss.gameturbo
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.parseColor("#121212"))

        val title = TextView(this)
        title.text = "Game Turbo Optimizer"
        title.textSize = 24f
        title.setTextColor(Color.WHITE)
        title.setPadding(0, 0, 0, 60)

        val btn = Button(this)
        btn.text = "Boost Device Now"
        btn.setBackgroundColor(Color.parseColor("#00FF00"))
        btn.setOnClickListener {
            btn.text = "Optimized ✅"
            btn.isEnabled = false
        }

        layout.addView(title)
        layout.addView(btn)
        setContentView(layout)
    }
}
