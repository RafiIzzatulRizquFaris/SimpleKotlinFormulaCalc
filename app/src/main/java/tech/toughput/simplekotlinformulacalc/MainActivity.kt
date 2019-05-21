package tech.toughput.simplekotlinformulacalc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val segitiga = findViewById<Button>(R.id.luas_segitiga)
        segitiga.setOnClickListener({
            val pndhsgtg = Intent(this@MainActivity, LuasSegitigaActivity::class.java)
            startActivity(pndhsgtg)
        })

        val persegi = findViewById<Button>(R.id.luas_persegi)
        persegi.setOnClickListener({
            val pndhprsg = Intent(this@MainActivity, LuasPersegiActivity::class.java)
            startActivity(pndhprsg)
        })

        val jajargenjang = findViewById<Button>(R.id.luas_jajargenjang)
        jajargenjang.setOnClickListener({
            val pndhjjrgnjng = Intent(this@MainActivity, LuasJajargenjangActivity::class.java)
            startActivity(pndhjjrgnjng)
        })

        val lingkaran = findViewById<Button>(R.id.luas_lingkaran)
        lingkaran.setOnClickListener({
            val pndhlngkrn = Intent(this@MainActivity, LuasLingkaranActivity::class.java)
            startActivity(pndhlngkrn)
        })

    }
}
