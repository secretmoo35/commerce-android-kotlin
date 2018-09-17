package com.kungsaranuwat.sarayut.commerce.Controllers

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.kungsaranuwat.sarayut.commerce.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        registerConstraintLayout.setOnClickListener {
            hideKeyboard()
        }
    }

    private fun hideKeyboard() {
        val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }

    fun clickedRegister(view: View) {
        hideKeyboard()

        val username = usernameInput?.text.toString()
        val password = passwordInput?.text.toString()
        val firstName = firstnameInput?.text.toString()
        val lastName = lastnameInput?.text.toString()
        val email = emailInput?.text.toString()
        val tel = telInput?.text.toString()

        when(""){
            username -> return Toast.makeText(this, "Please fill an username.", Toast.LENGTH_SHORT).show()
            password -> return Toast.makeText(this, "Please fill an password.", Toast.LENGTH_SHORT).show()
            firstName -> return Toast.makeText(this, "Please fill an first name.", Toast.LENGTH_SHORT).show()
            lastName -> return Toast.makeText(this, "Please fill an last name.", Toast.LENGTH_SHORT).show()
            email -> return Toast.makeText(this, "Please fill an email.", Toast.LENGTH_SHORT).show()
            tel -> return Toast.makeText(this, "Please fill an tel.", Toast.LENGTH_SHORT).show()
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return Toast.makeText(this, "Email is invalid.", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this, "Register completed.", Toast.LENGTH_SHORT).show()
    }

    fun navigateLogin(view: View) {
        onBackPressed()
    }
}
