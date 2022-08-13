package com.example.project_2_recyclerview_app.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.resturnt

class restaurantAdapter(
    private val dataset : List<resturnt>,
    private val context: Context
) : RecyclerView.Adapter<restaurantAdapter.resturntViewHolder>() {


    // Adapter helper class to arrange data in layout file
    class resturntViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }


    // 3 functions
    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): resturntViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return resturntViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: resturntViewHolder, position: Int) {
        // save the position of them (which item i'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.resturntStringId)
        holder.imageView.setImageResource(item.resturntImageId)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size


}