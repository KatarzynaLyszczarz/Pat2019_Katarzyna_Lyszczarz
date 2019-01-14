package com.example.katarzyna.katarzynalyszczarz

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private val PASSWORD_PATTERN =
        Pattern.compile("^" + "(?=.*[0-9])" + "(?=.*[a-z])" +"(?=.*[A-Z])" + ".{8,}" +"$")

    private var passwordText: EditText? = null
    private var emailText: EditText? = null
    private var submitButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        passwordText = findViewById(R.id.et_password)
        emailText = findViewById(R.id.et_email)
        submitButton = findViewById(R.id.btn_submit)
        submitButton!!.setOnClickListener {
            login()
        }
    }
    private fun login() {
        if (validate()) {
            Toast.makeText(baseContext, "ok", Toast.LENGTH_LONG).show()
        }
    }

    private fun validate(): Boolean{
        val email = emailText!!.text.toString()
        val password = passwordText!!.text.toString()

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailText!!.error = "enter a valid email address"
            return false
        }

        if(password.isEmpty() || !PASSWORD_PATTERN.matcher(password).matches()){
            passwordText!!.error = "enter a valid password(at least 8 characters, one upper and lower case, one number)"
            return false
        }

        return true
    }
}
