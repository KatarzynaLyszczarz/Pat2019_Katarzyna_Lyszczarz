package com.example.katarzyna.katarzynalyszczarz
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class SplashScreenActivity : AppCompatActivity() {

    override fun onBackPressed() {
        transitioner.interrupt() }

    private val transitioner = object : Thread(){
        override fun run() = try{
            Thread.sleep(5000)
            val intent = Intent(baseContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        } catch (e: Exception){
            e.printStackTrace()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        transitioner.start()
    }
}
