package tech.toughput.simplekotlinformulacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LuasSegitigaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_segitiga)

        val hasil_segitiga = findViewById<TextView>(R.id.hasilSegitiga)

        val hitung_segitiga = findViewById<Button>(R.id.hitungSegitiga)
        hitung_segitiga.setOnClickListener {

            val alas_segitiga = findViewById<EditText>(R.id.alasSegitiga)
            val alasSE = alas_segitiga.text.toString()
            val alasS = alasSE.toDouble()

            val tinggi_segitiga = findViewById<EditText>(R.id.tinggiSegitiga)
            val tinggiSE = tinggi_segitiga.text.toString()
            val tinggiS = tinggiSE.toDouble()

            val hasil = (tinggiS * alasS)
            hasil_segitiga.text = hasil.toString()

        }
    }
}
