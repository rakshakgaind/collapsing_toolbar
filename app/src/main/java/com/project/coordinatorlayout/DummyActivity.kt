package com.project.coordinatorlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.project.coordinatorlayout.adapter.ListAdapter

import com.project.coordinatorlayout.databinding.ActivityDummyBinding

class DummyActivity : AppCompatActivity() {
    lateinit var binding: ActivityDummyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDummyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

binding.container.recyclerView.adapter=ListAdapter()

        binding.fab.setOnClickListener{
            Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}