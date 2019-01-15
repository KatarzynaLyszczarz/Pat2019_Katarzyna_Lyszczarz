package com.example.katarzyna.katarzynalyszczarz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logged.*

class LoggedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)

        btn_logout.setOnClickListener {
            finish()
        }
    }

    override fun onBackPressed() {
        moveTaskToBack(true)
    }
}
