package com.kungsaranuwat.sarayut.commerce.Controllers

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.kungsaranuwat.sarayut.commerce.R
import kotlinx.android.synthetic.main.activity_forgot_password.*


class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        categoryToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
        categoryToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        forgotPasswordConstraintLayout.setOnClickListener {
            hideKeyboard()
        }
    }

    private fun hideKeyboard() {
        val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
    }

    fun clickedConfirm(view: View) {
        hideKeyboard()

        val email = forgotEmailInput?.text.toString()

        if(email == ""){
            return Toast.makeText(this, "Please fill an email.", Toast.LENGTH_SHORT).show()
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return Toast.makeText(this, "Email is invalid.", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this, "Email sent successfully.", Toast.LENGTH_SHORT).show()
    }
}
