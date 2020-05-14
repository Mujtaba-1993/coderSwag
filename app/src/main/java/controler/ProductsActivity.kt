package controler

import Utilities.EXTRA_CATEGORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mujtaba.coderswag.R

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val categoryType= intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
