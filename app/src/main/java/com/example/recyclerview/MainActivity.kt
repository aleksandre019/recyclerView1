package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Home.HomeRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var homeRecyclerViewAdapter: HomeRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeRecyclerViewAdapter = createHomeRecyclerViewAdapter(getData())
        binding.homeRecyclerView.Adapter = homeRecyclerViewAdapter
        binding.homeRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun createHomeRecyclerViewAdapter(data: Any): HomeRecyclerViewAdapter {
        return HomeRecyclerViewAdapter(data)
    }

    private fun getData(): Any {
        TODO()
    }

    companion object {
        fun <ActivityMainBinding> inflate(): ActivityMainBinding {
            TODO()
        }
    }
}

private fun Nothing?.add(email: Email) {

}

private fun Any.inflate(layoutInflater: LayoutInflater): Any {

    private fun getData(): ArrayList<Email> {
        val listItem = ArrayList<Email>()
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
    listItem.add(Email("author1","subject1","content1 content1 content1 content1 content1 content1 content1 content1 content1 content1 "))
    listItem.add(Email("author2","subject2","content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 content2 "))
         return listItem

    }
