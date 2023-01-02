package com.example.pengaduanmasyarakat


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterLaporan(val list: ArrayList<String>) :
    RecyclerView.Adapter<AdapterLaporan.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // 2
        var id = itemView.findViewById<TextView>(R.id.tvID)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // 1
        val v = LayoutInflater.from(parent.context).inflate(
            // xml, parent, binding true/false
            R.layout.activity_adapter_laporan, parent, false
        )
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // 4
        holder.id.text = list[position]
    }

    override fun getItemCount(): Int {
        // 3
        return list.size
    }
}