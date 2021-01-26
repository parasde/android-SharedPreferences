package com.parasde.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 메모리 할당
        Preference.init(applicationContext)

        edit.setText(Preference.getInstance().get("SAMPLE", ""))

        save.setOnClickListener {
            Preference.getInstance().put("SAMPLE", edit.text.toString())
        }
    }
}