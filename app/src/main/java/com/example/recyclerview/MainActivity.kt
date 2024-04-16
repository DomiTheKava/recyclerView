package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.adapter.Myadapter
import com.example.recyclerview.models.model
//import java.util.ArrayList
//import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<model>
    lateinit var thisAdapter: Myadapter

    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // set up what it looks like
        recyclerView = findViewById(R.id.rv1)

        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)

        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)

//        recyclerView.layoutManager = gridLayoutManager
        recyclerView.layoutManager = staggered

        recyclerView.setHasFixedSize(true)

        // data
        arrayList = setUpData()

        thisAdapter = Myadapter(applicationContext, arrayList)

        recyclerView.adapter = thisAdapter

    }

    private fun setUpData(): ArrayList<model> {
        var items: ArrayList<model> = ArrayList()

        items.add(model(R.drawable.kang, "Kangaroo"))
        items.add(model(R.drawable.hippo, "Hippo"))
        items.add(model(R.drawable.parrot, "Parrot"))
        items.add(model(R.drawable.pigeon, "Pigeon"))
        items.add(model(R.drawable.rabbit, "Rabbit"))
        items.add(model(R.drawable.spider, "Spider"))
        items.add(model(R.drawable.turtle, "Turtle"))

        return items
    }
}
