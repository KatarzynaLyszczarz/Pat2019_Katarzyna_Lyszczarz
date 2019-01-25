package com.example.katarzyna.katarzynalyszczarz

import android.util.Patterns
import android.widget.EditText
import java.util.regex.Pattern

class Validate {

    private val PASSWORD_PATTERN =
        Pattern.compile("^" + "(?=.*[0-9])" + "(?=.*[a-z])" +"(?=.*[A-Z])" + ".{8,}" +"$")

    fun isValidate(emailText: EditText?, passwordText: EditText?): Boolean{

        if (emailValidate(emailText) && passwordValidate(passwordText)){
        return true
        }
        return false
    }

    private fun emailValidate(emailText: EditText?): Boolean{

        val email = emailText?.text.toString()

        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailText?.error = "enter a valid email address"
            return false
        }
        return true
    }

    private fun passwordValidate(passwordText: EditText?): Boolean{

        val password = passwordText?.text.toString()

        if(password.isEmpty() || !PASSWORD_PATTERN.matcher(password).matches()){
            passwordText?.error = "enter a valid password(at least 8 characters, one upper and lower case, one number)"
            return false
        }
        return true
    }
}