package controler

import Adaptore.CategoryAdapter
import Adaptore.CategoryReciclelAdapter
import Utilities.EXTRA_CATEGORY
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.PopupWindow
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.mujtaba.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_details_inflat.*
import kotlinx.android.synthetic.main.popup_layout.*
import model.Category
import services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryReciclelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            adapter = CategoryReciclelAdapter(this, DataService.categories) { category ->
                val prodictIntent = Intent(this, ProductsActivity::class.java)
                prodictIntent.putExtra(EXTRA_CATEGORY, category.title)
                startActivity(prodictIntent)
            }



            categoryyListVeiw.adapter = adapter

            val layoutManger = LinearLayoutManager(this)
            categoryyListVeiw.layoutManager = layoutManger
            categoryyListVeiw.setHasFixedSize(true)




        }




    }

