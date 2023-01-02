package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pengaduanmasyarakat.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.accountName.text = intent.getStringExtra("id")
        binding.tvTemuanAnda.setOnClickListener {
            startActivity(Intent(this@DashboardActivity, TemuanActivity::class.java))
        }
        binding.tvlaporan.setOnClickListener {
            startActivity(Intent(this@DashboardActivity, LaporPengaduan::class.java))
        }



    }
}