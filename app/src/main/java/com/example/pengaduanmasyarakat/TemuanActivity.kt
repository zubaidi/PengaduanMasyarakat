package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengaduanmasyarakat.databinding.ActivityTemuanBinding

class TemuanActivity : AppCompatActivity() {
    // recyclerview
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var bind: ActivityTemuanBinding
    var data = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temuan)
        bind = ActivityTemuanBinding.inflate(layoutInflater)
        setContentView(bind.root)
        // penambahan data
        /*
        var data = ArrayList<String>()
        for ( i in 1..50 ) {
            data.add("${ i }. Temuan Pengaduan")
        }
        bind.listData.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = AdapterTemuan(data)
        bind.listData.adapter = recyclerAdapter
        */
        this.insertData()
    }

    // func insert recyclerview
    private fun insertData() {
        bind.btnAdd.setOnClickListener {
            val nilai = bind.txtTanggapan.text.toString()
            data.add(nilai)
            bind.listData.layoutManager = LinearLayoutManager(this)
            recyclerAdapter = AdapterTemuan(data)

            bind.listData.adapter = recyclerAdapter
            recyclerAdapter.notifyDataSetChanged()
        }
    }
}