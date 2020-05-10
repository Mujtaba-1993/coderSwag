package controler

import Adaptore.CategoryAdapter
import Adaptore.CategoryReciclelAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.mujtaba.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*
import model.Category
import services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryReciclelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryReciclelAdapter(this, DataService.categories)
        categoryyListVeiw.adapter=adapter

        val layoutManger = LinearLayoutManager(this)
        categoryyListVeiw.layoutManager= layoutManger
        categoryyListVeiw.setHasFixedSize(true)


    }
}
