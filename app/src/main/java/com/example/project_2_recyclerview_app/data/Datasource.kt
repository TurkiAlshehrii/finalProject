package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.model.resturnt
import com.example.project_2_recyclerview_app.R

class Datasource{

    fun loadMune() : List<resturnt>{
        return listOf(
            resturnt(R.string.burger, R.drawable.burger),
            resturnt(R.string.fettuccine, R.drawable.fettuccine),
            resturnt(R.string.pasta, R.drawable.pasta),
            resturnt(R.string.margherita, R.drawable.margherita),
            resturnt(R.string.steak, R.drawable.steak),
            resturnt(R.string.pizza, R.drawable.pizza_pub),
        )
    }

}