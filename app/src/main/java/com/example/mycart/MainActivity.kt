package com.example.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycart.model.Cart
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cartList=ArrayList<Cart>()
        cartList.add(Cart("Fine Grain Sugar",20.00,"1Kg",R.drawable.sugar))
        cartList.add(Cart("Peanuts",20.00,"3Kg",R.drawable.peanut))
        cartList.add(Cart("Dawat Rice",80.00,"2Kg",R.drawable.rice))
        var cartadapter=cartAdapter(cartList)
        cartrecycleview.layoutManager=LinearLayoutManager(this)
        cartrecycleview.adapter=cartadapter
    }
}