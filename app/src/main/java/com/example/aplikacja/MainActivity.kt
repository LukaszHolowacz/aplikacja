package com.example.aplikacja

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        var liczbaPierwsza=0
        var liczbaDruga=0
        var wynik=0
        var dzialanie=0
        findViewById<TextView>(R.id.rownanie).text =""

        findViewById<Button>(R.id.clear).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = ""
        }
        findViewById<Button>(R.id.b0).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "0"
        }
        findViewById<Button>(R.id.b1).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "1"
        }
        findViewById<Button>(R.id.b2).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "2"
        }
        findViewById<Button>(R.id.b3).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "3"
        }
        findViewById<Button>(R.id.b4).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "4"
        }
        findViewById<Button>(R.id.b5).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "5"
        }
        findViewById<Button>(R.id.b6).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "6"
        }
        findViewById<Button>(R.id.b7).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "7"
        }
        findViewById<Button>(R.id.b8).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "8"
        }
        findViewById<Button>(R.id.b9).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text =
                findViewById<TextView>(R.id.rownanie).text.toString() + "9"
        }
        findViewById<Button>(R.id.dodaj).setOnClickListener {
            dzialanie = 1
            liczbaPierwsza = findViewById<TextView>(R.id.rownanie).text.toString().toInt()
            findViewById<TextView>(R.id.rownanie).text = ""
        }
        findViewById<Button>(R.id.odejmij).setOnClickListener {
            dzialanie = 2
            liczbaPierwsza = findViewById<TextView>(R.id.rownanie).text.toString().toInt()
            findViewById<TextView>(R.id.rownanie).text = ""
        }
        findViewById<Button>(R.id.pomnoz).setOnClickListener {
            dzialanie = 3
            liczbaPierwsza = findViewById<TextView>(R.id.rownanie).text.toString().toInt()
            findViewById<TextView>(R.id.rownanie).text = ""
        }
        findViewById<Button>(R.id.podziel).setOnClickListener {
            dzialanie = 4
            liczbaPierwsza = findViewById<TextView>(R.id.rownanie).text.toString().toInt()
            findViewById<TextView>(R.id.rownanie).text = ""
        }
        findViewById<Button>(R.id.wynik).setOnClickListener {
            liczbaDruga = findViewById<TextView>(R.id.rownanie).text.toString().toInt()
            if(dzialanie == 1){
                wynik = liczbaPierwsza + liczbaDruga
            }
            else if(dzialanie == 2){
                wynik = liczbaPierwsza - liczbaDruga
            }
            else if(dzialanie == 3){
                wynik = liczbaPierwsza * liczbaDruga
            }
            else if(dzialanie == 4){
                if(liczbaPierwsza == 0 && liczbaDruga == 0){
                    findViewById<TextView>(R.id.rownanie).text = "Nie dziel przez 0"
                }
                else if(liczbaPierwsza!=0 && liczbaDruga!=0){
                    wynik = liczbaPierwsza / liczbaDruga
                }

            }
            findViewById<TextView>(R.id.rownanie).text = wynik.toString()
        }
    }
}