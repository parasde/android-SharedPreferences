package com.parasde.sharedpreferences

import android.content.Context
import android.content.SharedPreferences

class Preference {
    companion object {
        private lateinit var instance: Preference
        private lateinit var pref: SharedPreferences
        private val PREFIX = "SAMPLE"

        // 메모리 할당
        fun init (applicationContext: Context) {
            instance = Preference()
            pref = applicationContext.getSharedPreferences(PREFIX, Context.MODE_PRIVATE)
        }

        // 인스턴스 요청
        fun getInstance(): Preference {
            return instance
        }
    }

    fun get(name: String, default: String): String {
        return pref.getString(name, default)!!
    }

    fun get(name: String, default: Int): Int {
        return pref.getInt(name, default)
    }

    fun get(name: String, default: Float): Float {
        return pref.getFloat(name, default)
    }


    fun get(name: String, default: Boolean): Boolean {
        return pref.getBoolean(name, default)
    }

    fun put(name: String, value: String) {
        with(pref.edit()) {
            putString(name, value)
            commit()
        }
    }

    fun put(name: String, value: Int) {
        with(pref.edit()) {
            putInt(name, value)
            commit()
        }
    }

    fun put(name: String, value: Float) {
        with(pref.edit()) {
            putFloat(name, value)
            commit()
        }
    }

    fun put(name: String, value: Boolean) {
        with(pref.edit()) {
            putBoolean(name, value)
            commit()
        }
    }
    
}