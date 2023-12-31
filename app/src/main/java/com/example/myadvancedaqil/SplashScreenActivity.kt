package com.example.myadvancedaqil

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val backgrounding : ImageView = findViewById(R.id.iv_Image)
        val slideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgrounding.startAnimation(slideAnimation)

        val textView : TextView = findViewById(R.id.tvIcon)
        val slideAnimation1 = AnimationUtils.loadAnimation(this,R.anim.slide)
        textView.startAnimation(slideAnimation1)


      Handler().postDelayed({
            startActivity(Intent(this,TabActivity::class.java))
            finish()
        }, 4000)
    }
}