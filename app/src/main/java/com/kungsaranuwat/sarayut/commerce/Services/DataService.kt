package com.kungsaranuwat.sarayut.commerce.Services

import com.kungsaranuwat.sarayut.commerce.Models.Category
import com.kungsaranuwat.sarayut.commerce.Models.Product

object DataService {

    val categories = listOf(
            Category("1","Shirts","categoryshirtimage"),
            Category("2","Hoodies","categoryhoodieimage"),
            Category("3","Hats","categoryhatimage"),
            Category("4","Digital goods","categorydigitalgoodsimage")
    )

    val products = listOf(
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryshirtimage","$30","1"),
            Product("1","Product name","categoryhoodieimage","$30","2"),
            Product("1","Product name","categoryhoodieimage","$30","2"),
            Product("1","Product name","categoryhoodieimage","$30","2"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categoryhatimage","$30","3"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4"),
            Product("1","Product name","categorydigitalgoodsimage","$30","4")
    )

    fun getProductByCategory(cateId: String): List<Product> {
        return products.filter { product ->
            product.categoryId == cateId
        }
    }

}