package com.kungsaranuwat.sarayut.commerce.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import com.kungsaranuwat.sarayut.commerce.Models.Product
import com.kungsaranuwat.sarayut.commerce.R

class ProductRecycleAdapter(val context: Context, val products: List<Product>, private val itemClick: (Product) -> Unit) : RecyclerView.Adapter<ProductRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return  Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class Holder(itemView: View?, val itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val productImage = itemView?.findViewById<ImageView>(R.id.productListItemImage)
        private val productName = itemView?.findViewById<TextView>(R.id.productListItemName)
        private val productPrice = itemView?.findViewById<TextView>(R.id.productListItemPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable",context.packageName)

            productImage?.setImageResource(resourceId)
            productName?.text = product.name
            productPrice?.text = product.price

            itemView.setOnClickListener { itemClick(product) }
        }
    }

}