package com.example.hello
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class row_courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_row_courses)
        data class Courses(
            var id: "Int"
        var name: String,
        var code: "Int",
        var instructor: String,
        var description: String
        )
    }