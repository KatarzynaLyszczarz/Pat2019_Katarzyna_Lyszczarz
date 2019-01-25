package com.example.katarzyna.katarzynalyszczarz

import android.content.Context

class SaveSharedPreference {

    private val prefLog = "logStatus"
    private val defaultStatus = false

    fun setLogStatus(context: Context, logStatus: Boolean) {
        val sharedPref = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean(prefLog, logStatus)
        editor.apply()
    }

    fun getLogStatus(context: Context): Boolean {
        val sharedPref = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
        return sharedPref.getBoolean(prefLog, defaultStatus)
    }
}
