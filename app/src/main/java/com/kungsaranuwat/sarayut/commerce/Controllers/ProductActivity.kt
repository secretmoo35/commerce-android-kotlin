package com.kungsaranuwat.sarayut.commerce.Controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kungsaranuwat.sarayut.commerce.R
import com.kungsaranuwat.sarayut.commerce.Utilities.EXTRA_CATEGORY_SELECTED
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        productToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp)
        productToolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        loadData()
    }

    private fun loadData() {
        val categoryName = intent.getStringExtra(EXTRA_CATEGORY_SELECTED)
        productHeaderText.text = categoryName
    }
}
