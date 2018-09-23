package com.kungsaranuwat.sarayut.commerce.Controllers

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.kungsaranuwat.sarayut.commerce.Adapters.ProductRecycleAdapter
import com.kungsaranuwat.sarayut.commerce.Models.Category
import com.kungsaranuwat.sarayut.commerce.R
import com.kungsaranuwat.sarayut.commerce.Services.DataService
import com.kungsaranuwat.sarayut.commerce.Services.DataService.products
import com.kungsaranuwat.sarayut.commerce.Utilities.EXTRA_CATEGORY_SELECTED
import kotlinx.android.synthetic.main.activity_product.*
import java.text.NumberFormat

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductRecycleAdapter

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
        val categorySelected = intent.getParcelableExtra<Category>(EXTRA_CATEGORY_SELECTED)
        val products = DataService.getProductByCategory(categorySelected.id)

        adapter = ProductRecycleAdapter(this, products) {product ->
            Toast.makeText(this, "Click ${product.id}", Toast.LENGTH_SHORT).show()
        }

        productHeaderText.text = categorySelected.name
        val formatter = NumberFormat.getNumberInstance()
        val myNumber = adapter.itemCount
        val formattedNumber = formatter.format(myNumber)
        producctCountText?.text = "Total: $formattedNumber"

        var spanCount = 2
        val orientationMode = resources.configuration.orientation
        if(orientationMode == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productRecyclerView.layoutManager = layoutManager
        productRecyclerView.adapter = adapter

    }
}
