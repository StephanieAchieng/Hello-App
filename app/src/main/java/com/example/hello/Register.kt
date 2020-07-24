package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    btnRegister.setOnClickListener {
        var firstName= etFirstName.text.toString()
        var lastName=etLastName.text.toString()
        val email=etEmail.text.toString()
        //val phoneNumber=etPhoneNumber.text.toString()
        val password=etPassword.text.toString()
        val passwordConfirmation=etConfirmPassword.text.toString()
        Toast.makeText(baseContext, lastName,Toast.LENGTH_LONG).show()
    }
    }
}
