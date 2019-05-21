package tech.toughput.simplekotlinformulacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LuasLingkaranActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_lingkaran)

        val hasil_lingkaran = findViewById<TextView>(R.id.hasilLingkaran)
        val hitung_lingkaran = findViewById<Button>(R.id.hitungLingkaran)

        hitung_lingkaran.setOnClickListener({

            val jarijari = findViewById<EditText>(R.id.jarijari)
            val jari2 = jarijari.text.toString()
            val jari = jari2.toDouble()

            val hasilL = jari * jari * Math.PI
            hasil_lingkaran.text = hasilL.toString()

        })
    }
}
