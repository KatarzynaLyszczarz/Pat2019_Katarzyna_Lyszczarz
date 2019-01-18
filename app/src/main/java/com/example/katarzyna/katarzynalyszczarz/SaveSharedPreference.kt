package com.example.katarzyna.katarzynalyszczarz

import android.content.Context
import android.support.v7.app.AppCompatActivity

val preference = SaveSharedPreference()

class SaveSharedPreference : AppCompatActivity (){

    private val prefLog = "log_status"
    private val defaultStatus = false

    fun setLogStatus(context: Context, log_status: Boolean) {
        val sharedPref = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(prefLog, log_status)
        editor.apply()
    }

    fun getLogStatus(context: Context): Boolean {
        val sharedPref = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(prefLog, defaultStatus)
    }
}
