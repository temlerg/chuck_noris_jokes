package com.example.chuck_noris_jokes.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chuck_noris_jokes.R
import com.example.chuck_noris_jokes.fragment.Main_fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, Main_fragment())
            .commit()

    }
}