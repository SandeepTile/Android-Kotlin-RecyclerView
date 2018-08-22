package com.example.sandy.kotlin_recyclerview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lManager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
        rview.layoutManager = lManager
        rview.adapter = MyAdapter(this@MainActivity)

        fab.setOnClickListener {


            var sBar=Snackbar.make(it,"Are You Sure want to Exit?",Snackbar.LENGTH_INDEFINITE)
            sBar.setAction("Yes",{

                System.exit(0)
            })

            sBar.setActionTextColor(Color.RED)
            sBar.show()


            /*   hide Snackbar  */

            rview.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    if (dy > 0)
                        sBar.dismiss()
                }
            })

        }
    }
}
