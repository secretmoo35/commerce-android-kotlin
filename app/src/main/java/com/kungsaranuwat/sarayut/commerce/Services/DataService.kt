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
            Product("2","Product name","categoryshirtimage","$30","1"),
            Product("3","Product name","categoryshirtimage","$30","1"),
            Product("4","Product name","categoryshirtimage","$30","1"),
            Product("5","Product name","categoryshirtimage","$30","1"),
            Product("6","Product name","categoryshirtimage","$30","1"),
            Product("7","Product name","categoryshirtimage","$30","1"),
            Product("8","Product name","categoryshirtimage","$30","1"),
            Product("9","Product name","categoryshirtimage","$30","1"),
            Product("10","Product name","categoryhoodieimage","$30","2"),
            Product("11","Product name","categoryhoodieimage","$30","2"),
            Product("12","Product name","categoryhoodieimage","$30","2"),
            Product("13","Product name","categoryhatimage","$30","3"),
            Product("14","Product name","categoryhatimage","$30","3"),
            Product("15","Product name","categoryhatimage","$30","3"),
            Product("16","Product name","categoryhatimage","$30","3"),
            Product("17","Product name","categoryhatimage","$30","3"),
            Product("18","Product name","categoryhatimage","$30","3"),
            Product("19","Product name","categorydigitalgoodsimage","$30","4"),
            Product("20","Product name","categorydigitalgoodsimage","$30","4"),
            Product("21","Product name","categorydigitalgoodsimage","$30","4"),
            Product("22","Product name","categorydigitalgoodsimage","$30","4"),
            Product("23","Product name","categorydigitalgoodsimage","$30","4"),
            Product("24","Product name","categorydigitalgoodsimage","$30","4"),
            Product("25","Product name","categorydigitalgoodsimage","$30","4"),
            Product("26","Product name","categorydigitalgoodsimage","$30","4"),
            Product("27","Product name","categorydigitalgoodsimage","$30","4"),
            Product("28","Product name","categorydigitalgoodsimage","$30","4"),
            Product("29","Product name","categorydigitalgoodsimage","$30","4"),
            Product("30","Product name","categorydigitalgoodsimage","$30","4")
    )

    fun getProductByCategory(cateId: String): List<Product> {
        return products.filter { product ->
            product.categoryId == cateId
        }
    }

}