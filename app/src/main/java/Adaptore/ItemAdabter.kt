package Adaptore

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mujtaba.coderswag.R
import model.Prodect

class ItemAdabter(val context: Context, val items: List<Prodect>,val itemClick:(Prodect)-> Unit):RecyclerView.Adapter<ItemAdabter.ItemHolder>() {
    inner class ItemHolder(itemView:View,val itemClick: (Prodect) -> Unit):RecyclerView.ViewHolder(itemView){
        val imageDis = itemView.findViewById<ImageView>(R.id.imageDis)
        val textDis = itemView.findViewById<TextView>(R.id.textDis)
        val textDis1 = itemView.findViewById<TextView>(R.id.textDis1)
        val textDis2 = itemView.findViewById<TextView>(R.id.textDis2)
        val btnClick = itemView.findViewById<Button>(R.id.btnClick)

        fun bindItem (context: Context, items: Prodect){
            val resurseId = context.resources.getIdentifier(items.image,"drawable",context.packageName)
            imageDis.setImageResource(resurseId)
            textDis.text=items.Dis
            textDis2.text=items.price
            textDis1.text=items.title
            btnClick.setOnClickListener {itemClick(items)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
  val view = LayoutInflater.from(context).inflate(R.layout.item_details_inflat,parent,false)
        return ItemHolder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        holder.bindItem(context,items[position])

    }
}