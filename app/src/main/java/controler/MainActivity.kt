package controler

import Adaptore.CategoryAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.mujtaba.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*
import model.Category
import services.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryAdapter(this,DataService.categories)

        categoryyListVeiw.adapter=adapter


    }
}
