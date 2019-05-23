package tech.toughput.simplekotlinformulacalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LuasJajargenjangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas_jajargenjang)

        val hasil_jajargenjang = findViewById<TextView>(R.id.hasilJajargenjang)

        val hitung_jajargenjang = findViewById<Button>(R.id.hitungJajargenjang)
        hitung_jajargenjang.setOnClickListener({

            val alasJajargenjang = findViewById<EditText>(R.id.alasJajargenjang)
            val alasJA = alasJajargenjang.text.toString()
            val alasJ = alasJA.toDouble()

            val tinggiJajargenjang = findViewById<EditText>(R.id.tinggiJajargenjang)
            val tinggiJA = tinggiJajargenjang.text.toString()
            val tinggiJ = tinggiJA.toDouble()

            val hasilJajargenjang = tinggiJ * alasJ
            hasil_jajargenjang.text = hasilJajargenjang.toString()

        })

    }
}
