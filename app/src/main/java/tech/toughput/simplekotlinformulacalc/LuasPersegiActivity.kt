package tech.toughput.simplekotlinformulacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LuasPersegiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_persegi)

        val hasil_persegi = findViewById<TextView>(R.id.hasilPersegi)

        val hitung_persegi = findViewById<Button>(R.id.hitungPersegi)
        hitung_persegi.setOnClickListener {

            val panjang_persegi = findViewById<EditText>(R.id.panjangPersegi)
            val panjangPE = panjang_persegi.text.toString()
            val panjangP = panjangPE.toDouble()

            val lebar_persegi = findViewById<EditText>(R.id.lebarPersegi)
            val lebarPE = lebar_persegi.text.toString()
            val lebarP = lebarPE.toDouble()

            val hasilP = (panjangP * lebarP)
            hasil_persegi.text = hasilP.toString()
        }
    }
}
