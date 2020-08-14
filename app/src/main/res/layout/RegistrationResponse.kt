package com.example.Hello

import com.google.gson.annotations.SerializedName
import layout.Student

data class RegistrationResponse(
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)