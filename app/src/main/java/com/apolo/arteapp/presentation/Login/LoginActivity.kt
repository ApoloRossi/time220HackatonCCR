package com.apolo.arteapp.presentation.Login

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.apolo.arteapp.R
import com.apolo.arteapp.presentation.home.HomeActivity

class LoginActivity : AppCompatActivity() {


    lateinit var loginButton : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            startActivity( Intent(this@LoginActivity.applicationContext, HomeActivity::class.java))
            finish()
        }
    }

}