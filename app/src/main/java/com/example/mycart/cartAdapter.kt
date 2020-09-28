package com.example.mycart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycart.model.Cart
import kotlinx.android.synthetic.main.cart_item_layout.view.*

class cartAdapter(var cartList: ArrayList<Cart>):RecyclerView.Adapter<cartAdapter.cartViewHolder>(){
    class cartViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        fun bind(cart:Cart){
            itemView.txtCart.text=cart.name
            itemView.txtPrice.text=cart.price.toString()
            itemView.txtKg.text=cart.weight
            itemView.imgCart.setImageResource(cart.img)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cartViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.cart_item_layout,parent,false)
        return cartViewHolder(view)
    }

    override fun onBindViewHolder(holder: cartViewHolder, position: Int) {
      holder.bind(cartList[position])
    }

    override fun getItemCount(): Int = cartList.size
}