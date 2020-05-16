package controler

import Adaptore.ProductAdapter
import Utilities.EXTRA_CATEGORY
import android.content.res.Configuration
import android.media.VolumeShaper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.mujtaba.coderswag.R
import kotlinx.android.synthetic.main.activity_products.*
import services.DataService

class ProductsActivity : AppCompatActivity() {
    //هنا عرفنا الادابتر
    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        // الكود التالي عباره عن امر بتسجيل المعلومات فEXTRA_CATEGORY
        val categoryType= intent.getStringExtra(EXTRA_CATEGORY)
        // الكود التالي نعطي الادابتر االمكان الي فيه معلوماتنا ونقوله يجيبها هنا
        adapter= ProductAdapter(this, DataService.getProdect(categoryType))



        //الكود التالي عباره عن ترتيب الصور ف الاندسكيب مود او اذا كان الجوال بالعرض

        var spanCount= 2
        val orintation= resources.configuration.orientation
        if (orintation==Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
         // الكود التالي هو عباره عن شرط اذا كانت الشاشه حجم كبير ف الصفوف تكون من 3
        val screenSize = resources.configuration.screenWidthDp
        if (screenSize>720){
            spanCount = 3
        }


        //layout manger هذا كود يرتب لنا الست وهو ضرووري نضيفه

        val layoutManger = GridLayoutManager(this, spanCount)
        productsListVeiw.layoutManager= layoutManger
        productsListVeiw.adapter=adapter

    }
}
