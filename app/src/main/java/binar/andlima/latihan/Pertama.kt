package binar.andlima.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pertama.*

class Pertama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)

        proses.setOnClickListener {



            val pindah = Intent(this, Kedua::class.java)
            val dataperson = Data("waslim", 21, "karawang", "sepakbola")
            pindah.putExtra("datanya", dataperson)
            startActivity(pindah)
    }

    }
}
