package com.example.katarzyna.katarzynalyszczarz

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_logged.*

class LoggedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        btn_logout.setOnClickListener {
            preference.setLogStatus(baseContext, false)
            val intent = Intent(baseContext, MainActivity::class.java)
            finish()
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        moveTaskToBack(true)
    }
}
