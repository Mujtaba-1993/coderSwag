package Adaptore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mujtaba.coderswag.R
import model.Prodect

class ProductAdapter(val context:Context, val products: List<Prodect>, val itemClick:(Prodect)-> Unit):RecyclerView.Adapter<ProductAdapter.ProductHolder>() {


    inner class ProductHolder(itemView: View, val itemClick: (Prodect) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.prodectImage)
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)




        fun bindProudect(prodect: Prodect, context: Context){
            val resurseid= context.resources.getIdentifier(prodect.image, "drawable", context.packageName)
            productImage?.setImageResource(resurseid)
            productName?.text= prodect.title
            productPrice?.text= prodect.price
            itemView.setOnClickListener { itemClick(prodect) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.prudect_list_item, parent,false)

        return ProductHolder(view,itemClick)

    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
       holder.bindProudect(products[position],context)
    }
}