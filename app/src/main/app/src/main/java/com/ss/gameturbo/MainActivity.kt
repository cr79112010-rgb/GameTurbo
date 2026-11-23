package com.ss.gameturbo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import android.graphics.Color

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = android.widget.LinearLayout(this)
        layout.orientation = android.widget.LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.BLACK)

        val tv = TextView(this)
        tv.text = "التطبيق يعمل بنجاح! 🎉"
        tv.textSize = 24f
        tv.setTextColor(Color.GREEN)
        
        layout.addView(tv)
        setContentView(layout)
    }
}
