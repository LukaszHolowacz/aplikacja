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

        findViewById<Button>(R.id.b0).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "0 "
        }
        findViewById<Button>(R.id.b1).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "1 "
        }
        findViewById<Button>(R.id.b2).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "2 "
        }
        findViewById<Button>(R.id.b3).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "3 "
        }
        findViewById<Button>(R.id.b4).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "4 "
        }
        findViewById<Button>(R.id.b5).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "5 "
        }
        findViewById<Button>(R.id.b6).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "6 "
        }
        findViewById<Button>(R.id.b7).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "7 "
        }
        findViewById<Button>(R.id.b8).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "8 "
        }
        findViewById<Button>(R.id.b9).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "9 "
        }
        findViewById<Button>(R.id.dodaj).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "+ "
        }
        findViewById<Button>(R.id.odejmij).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "- "
        }
        findViewById<Button>(R.id.podziel).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "÷ "
        }
        findViewById<Button>(R.id.podziel).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "x ";
        }
        findViewById<Button>(R.id.wynik).setOnClickListener {
            findViewById<TextView>(R.id.rownanie).text = "= "
        }
    }
}