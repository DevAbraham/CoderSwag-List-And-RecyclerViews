package com.ruedapps.coderswag.Controler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ruedapps.coderswag.Adapters.CategoryRecyclerAdapter
import com.ruedapps.coderswag.R
import com.ruedapps.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        listViewCategories.adapter = adapter

        val layoutManager = LinearLayoutManager(this)

        listViewCategories.layoutManager = layoutManager
        listViewCategories.setHasFixedSize(true)

    }


}