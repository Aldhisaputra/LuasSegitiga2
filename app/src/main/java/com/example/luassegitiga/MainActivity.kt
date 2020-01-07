package com.example.luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hitung?.setOnClickListener {
            var pedestal = pedestal?.text.toString()
            var height = height?.text.toString()

            if (pedestal == ""){
                Toast.makeText(this@MainActivity, "Panjang Alas  harus di isi", Toast.LENGTH_SHORT).show()
            } else if (height == ""){
                Toast.makeText(this@MainActivity, "Tinggi  harus di isi", Toast.LENGTH_SHORT).show()
            } else {
                var large = 0.5 * pedestal.toInt() * height.toInt()
                hasil?.setText("$large")
            }


        }
    }
}
