package com.kungsaranuwat.sarayut.commerce.Controllers

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.kungsaranuwat.sarayut.commerce.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        constraintLayout.setOnClickListener {
            hideKeyboard()
        }

        forgotPasswordTxt.setOnClickListener {
            val intent = Intent(this,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

    }

    private fun hideKeyboard() {
        val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }

    fun clickedLogin(view: View) {
        hideKeyboard()

        val username = usernameInput?.text.toString()
        val password = passwordInput?.text.toString()

        if(username == ""){
            return Toast.makeText(this, "Please fill an username.", Toast.LENGTH_SHORT).show()
        }else if(password == ""){
            return Toast.makeText(this, "Please fill an password.", Toast.LENGTH_SHORT).show()
        }
        Toast.makeText(this, "Login completed.", Toast.LENGTH_SHORT).show()

        val intent = Intent(this,CategoryActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

    fun navigateRegister(view: View) {
        val registerIntent = Intent(this, RegisterActivity::class.java)
        startActivity(registerIntent)
    }
}
