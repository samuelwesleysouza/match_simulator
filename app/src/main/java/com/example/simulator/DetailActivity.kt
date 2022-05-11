package com.example.simulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var biding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(biding.root)
        setSupportActionBar(biding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}