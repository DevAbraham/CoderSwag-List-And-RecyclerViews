package com.ruedapps.coderswag.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ruedapps.coderswag.Adapters.CategoryAdapter
import com.ruedapps.coderswag.Model.Category
import com.ruedapps.coderswag.R
import com.ruedapps.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this, DataService.categories)
        listViewCategories.adapter = adapter

    }


}