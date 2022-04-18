package com.utvecklare.labb2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.firestore.auth.User


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val username = findViewById <EditText>(R.id.editTextTextEmailAddress)
        val pasword = findViewById <EditText>(R.id.editTextPassword)
        val loginBtn = findViewById<Button>(R.id.button2)

        loginBtn.setOnClickListener {
            val email = username.text.toString()
            val password = pasword.text.toString()

            if (email.equals(User(email))){
                Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()
                val intent = Intent (this, MainActivity::class.java).apply {
                    putExtra("Email Address", email)
                    putExtra("Password", password)
                }
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "email is not valid", Toast.LENGTH_LONG).show()
            }
        }
    }
}