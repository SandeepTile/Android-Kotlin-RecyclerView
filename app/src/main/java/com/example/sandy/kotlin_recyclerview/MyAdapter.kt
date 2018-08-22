package com.example.sandy.kotlin_recyclerview

import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import java.io.File

class MyAdapter :RecyclerView.Adapter<MyHolder>{
    var mActivity:MainActivity? = null
    var files:Array<File>?=null
    var file:File?=null
    constructor(mActivity:MainActivity) {
        this.mActivity = mActivity

        var path="storage/sdcard0/WhatsApp/Media/WhatsApp Images/"
        file= File(path)

        if(!file!!.exists()){

            path="storage/emulated/0/WhatsApp/Media/WhatsApp Images/"
            file= File(path)

        }

        files=file!!.listFiles()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        var inflater=LayoutInflater.from(mActivity)
        var view=inflater.inflate(R.layout.indiview,parent,false)

        return MyHolder(view)


    }

    override fun getItemCount(): Int {

        return files!!.size

    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        var f: File = files!!.get(position)

        var b = BitmapFactory.decodeFile(f.path)
        var bmp= ThumbnailUtils.extractThumbnail(b,50,50 )
        holder.cView!!.setImageBitmap(bmp)

        holder.name!!.text=f.name
        holder.size!!.text=f.length().toString()
        holder.del!!.setOnClickListener {

            Toast.makeText(mActivity,"Image Deleted",Toast.LENGTH_LONG).show()
            f.delete()

            files=file!!.listFiles()
            this@MyAdapter.notifyDataSetChanged()   //refresh listView


        }



    }
}