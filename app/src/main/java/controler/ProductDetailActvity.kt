package controler

import Adaptore.ItemAdabter
import Utilities.EXTRA_CATEGORY
import Utilities.EXTRA_ITEM
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.mujtaba.coderswag.R
import kotlinx.android.synthetic.main.activity_product_detail_actvity.*
import services.DataItem


class ProductDetailActvity : AppCompatActivity() {
    lateinit var adapter: ItemAdabter

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail_actvity)

        adapter = ItemAdabter(this, DataItem.items){Prodect->
            val click = Intent(applicationContext, Popupactivity::class.java)
             click.putExtra(EXTRA_CATEGORY,Prodect.Dis)
            startActivity(click)
        }

        val layoutManger = LinearLayoutManager(this)
        itemRecyclerView.layoutManager = layoutManger
        itemRecyclerView.adapter = adapter

        ////////////

         }







                 }




















