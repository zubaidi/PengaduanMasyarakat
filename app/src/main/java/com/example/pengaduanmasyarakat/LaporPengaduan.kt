package com.example.pengaduanmasyarakat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengaduanmasyarakat.databinding.ActivityLaporPengaduanBinding

class LaporPengaduan : AppCompatActivity() {
    // recyclerview
    //private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var bind: ActivityLaporPengaduanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapor_pengaduan)
        bind = ActivityLaporPengaduanBinding.inflate(layoutInflater)
        setContentView(bind.root)
        // penambahan data
        var data = ArrayList<String>()
        for ( i in 1..50 ) {
            data.add("${ i }. Laporan Pengaduan")
        }
        bind.listlapor.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = AdapterTemuan(data)
        bind.listlapor.adapter = recyclerAdapter
    }
}