package com.kungsaranuwat.sarayut.commerce.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kungsaranuwat.sarayut.commerce.Models.Category
import com.kungsaranuwat.sarayut.commerce.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, private val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryListItemImage)
        private val categoryName = itemView?.findViewById<TextView>(R.id.categoryListItemName)

        fun bindCategory(category: Category, context:Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable",context.packageName)

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.name

            itemView.setOnClickListener { itemClick(category) }
        }

    }

}