package com.kungsaranuwat.sarayut.commerce.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.kungsaranuwat.sarayut.commerce.Adapters.CategoryRecycleAdapter
import com.kungsaranuwat.sarayut.commerce.R
import com.kungsaranuwat.sarayut.commerce.Services.DataService
import com.kungsaranuwat.sarayut.commerce.Utilities.EXTRA_CATEGORY_SELECTED
import kotlinx.android.synthetic.main.activity_category.*

class CategoryActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        loadData()
    }

    private fun loadData(){
        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY_SELECTED, category.name)
            startActivity(intent)
        }
        categoryRecyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.layoutManager = layoutManager
        categoryRecyclerView.setHasFixedSize(true)
    }
}
