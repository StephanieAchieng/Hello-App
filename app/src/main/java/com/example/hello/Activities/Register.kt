package com.example.hello.Activities

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hello.API.ApiClient
import com.example.hello.API.ApiInterface
import com.example.hello.R
import com.example.hello.models.RegistrationResponse
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.etPassword
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    btnRegister.setOnClickListener {
        var firstName= etFirstName.text.toString()
        var lastName=etLastName.text.toString()
        val email=etEmail.text.toString()
        val phoneNumber=etPhoneNumber.text.toString()
        val password=etPassword.text.toString()
        val passwordConfirmation=etConfirmPassword.text.toString()

        if(firstName.isBlank() || firstName.isEmpty()){
            etFirstName.error="First Name is required"
        }
        if(lastName.isBlank() || lastName.isEmpty()){
            etLastName.error="Last Name is required"
        }
        if(email.isBlank() || email.isEmpty()){
            etEmail.error="Email is required"
        }
        if(phoneNumber.isBlank() || phoneNumber.isEmpty()){
            etPhoneNumber.error="Phone Number is required"
        }
        if(password.isBlank() || password.isEmpty()){
            etPassword.error="Password is required"
        }
        if(passwordConfirmation.isBlank() || passwordConfirmation.isEmpty()){
            etPassword.error="Confirm your password"
        }
        progressBar.max=1000
        val currentProgress=600
        ObjectAnimator.ofInt(progressBar,"progress",currentProgress)
            .setDuration(20000)
            .start()


        var requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("first_name", firstName)
            .addFormDataPart("last_name", lastName)
            .addFormDataPart("email", email)
            .addFormDataPart("phone_number", phoneNumber)
            .addFormDataPart("password", password)
            .build()

        //registerUser(requestBody)
        Toast.makeText(baseContext, password, Toast.LENGTH_LONG).show()

        Toast.makeText(baseContext, lastName,Toast.LENGTH_LONG).show()
    }
        fun registerUser(requestBody: RequestBody) {
            var apiClient = ApiClient.buildService(ApiInterface::class.java)
            var registrationCall = apiClient.registerStudent(requestBody)
            registrationCall.enqueue(object : Callback<RegistrationResponse> {
                override fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
                    Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
                }

                override fun onResponse(
                    call: Call<RegistrationResponse>,
                    response: Response<RegistrationResponse>
                ) {
                    if (response.isSuccessful) {
                        Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG)
                            .show()
                        startActivity(Intent(baseContext, MainActivity::class.java))
                    } else {
                        Toast.makeText(
                            baseContext,
                            response.errorBody().toString(),
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }
                }
            })
        }
    }
}
