package com.example.hello.API

import com.example.hello.models.CoursesResponse
import com.example.hello.models.RegistrationResponse
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


interface ApiInterface {
    @POST("register")

    fun registerStudent(@Body requestBody: RequestBody): Call<RegistrationResponse>

    @GET("courses")
    fun getCourses(@Header("Authorization") accessToken: String): Call<CoursesResponse>
}




