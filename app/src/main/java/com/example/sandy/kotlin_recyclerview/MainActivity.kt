package com.example.sandy.kotlin_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
        rview.layoutManager = lManager
        rview.adapter = MyAdapter(this@MainActivity)

        fab.setOnClickListener {

            System.exit(0)
        }
    }


}
