package com.example.sandy.kotlin_recyclerview

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class MyAdapter :RecyclerView.Adapter<MyHolder>{
    var mActivity:MainActivity? = null
    constructor(mActivity:MainActivity) {
        this.mActivity = mActivity
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}