package controler

import Utilities.EXTRA_CATEGORY
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import com.mujtaba.coderswag.R

class Popupactivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popupactivity)
        intent.getStringExtra(EXTRA_CATEGORY)
        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)

       window.setLayout(1000,1000)




    }
}
