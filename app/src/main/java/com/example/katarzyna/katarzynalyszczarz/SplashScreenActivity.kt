package com.example.katarzyna.katarzynalyszczarz
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

    private val transitionHandler = Handler()

    val r = Runnable {
        try {
            val intent = Intent(baseContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        transitionHandler.postDelayed(r, 5000)
    }

    override fun onBackPressed() {
        transitionHandler.removeCallbacksAndMessages(null)
    }
}
