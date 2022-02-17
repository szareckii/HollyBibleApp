package com.szareckii.hollybibleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.szareckii.hollybibleapp.core.BibleApp
import com.szareckii.hollybibleapp.presentation.BibleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = (application as BibleApp).mainViewModel

        val recyclerView = findViewById<RecyclerView>(R.id.recuclerView)

        val adapter = BibleAdapter()
        recyclerView.adapter = adapter

        viewModel.observe(this) {
            adapter.update(it)
        }
        viewModel.fetchBooks()
    }
}