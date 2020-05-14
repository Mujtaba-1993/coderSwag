package Adaptore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mujtaba.coderswag.R
import model.Category

class CategoryReciclelAdapter(val context:Context, val categoris: List<Category>,val itemClick:(Category)->Unit):RecyclerView.Adapter<CategoryReciclelAdapter.Holder>() {

    inner class Holder(itemView: View,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
     val categoryImage= itemView.findViewById<ImageView>(R.id.categoryView)
        val categoryName= itemView.findViewById<TextView>(R.id.categoryName)
        fun bindcategory(category: Category, context: Context){
            val resoursid = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resoursid)
            categoryName?.text= category.title
            itemView.setOnClickListener { itemClick(category) }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view =LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categoris.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindcategory(categoris[position],context)
    }
}