package com.ruedapps.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.ruedapps.coderswag.Model.Category
import com.ruedapps.coderswag.R
import org.w3c.dom.Text

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val holder : ViewHolder
        val categoryView : View
        if (convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder = ViewHolder()
            holder.categoryImageView = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryText)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        val resourceId =  context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImageView?.setImageResource(resourceId)
        println(resourceId)
        holder.categoryName?.text = category.title

        return categoryView
    }
    private class ViewHolder {
        var categoryImageView :ImageView? = null
        var categoryName : TextView? = null
    }

}