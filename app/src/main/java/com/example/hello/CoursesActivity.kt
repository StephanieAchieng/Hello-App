package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        btnbutton.setOnClickListener() {
            var Name = etName.text.toString()
            var password = etPassword.text
            Toast.makeText(baseContext, Name, Toast.LENGTH_LONG).show()
                }
            }

    }
}