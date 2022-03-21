package binar.andlima.latihan

import android.annotation.SuppressLint
import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kedua.*

class Kedua : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)


        val dataperson = intent.getSerializableExtra("datanya") as Data

        val ganap = if (dataperson.umur % 2 == 0){
            "Genap"
        } else {
            "Ganjil"
        }

        text_penampung.text = "Nama : ${dataperson.nama}\n" +
                              "Umur : ${dataperson.umur}\n" +
                              "Alamat : ${dataperson.alamat}\n" +
                              "Hobi : ${dataperson.Hobi}\n" +
                              "Umur Anda : $ganap"
    }
}