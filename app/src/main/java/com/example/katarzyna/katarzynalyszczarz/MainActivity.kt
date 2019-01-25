package com.example.katarzyna.katarzynalyszczarz

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private val checkValidation = Validate()

    private var passwordText: EditText? = null
    private var emailText: EditText? = null
    private var submitButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        passwordText = findViewById(R.id.et_password)
        emailText = findViewById(R.id.et_email)
        submitButton = findViewById(R.id.btn_submit)

        submitButton?.setOnClickListener {
            login()
        }
    }

    private fun login() {
        if (checkValidation.isValidate(emailText, passwordText)) {
            loginSuccess()
            preference.setLogStatus(baseContext,true)
        }
    }

    private fun loginSuccess(){
        val intent = Intent(baseContext, LoggedActivity::class.java)
        finish()
        startActivity(intent)
    }
}
