package com.example.pengaduanmasyarakat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pengaduanmasyarakat.databinding.ActivityLoginBinding
import com.example.pengaduanmasyarakat.databinding.ActivityRegisBinding

class LoginActivity : AppCompatActivity() {
    // 1. membuat var binding
    private lateinit var binding: ActivityLoginBinding
    var username = ""
    var password = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // 2. mengenalkan var ke layout inflater
        binding = ActivityLoginBinding.inflate(layoutInflater)
        // 3. mengenalkan binding dgn xml
        val view = binding.root
        // 4. set binding ke class activity
        setContentView(view)
        // cara memanggil dgn binding
        binding.btnMasuk.setOnClickListener {
            // user = nama, pass = 123456
            username = binding.inputID.text.toString()
            password = binding.inputPass.text.toString()
            // validasi sign in
            if (username.isEmpty()){
                val toast = Toast.makeText(this,"Username tidak boleh kosong", Toast.LENGTH_SHORT ).show()
            } else if (password.isEmpty()){
                Toast.makeText(this,"Password tidak boleh kosong", Toast.LENGTH_SHORT ).show()
            } else {
                if (username=="SMKSA" && password=="123456")
                {
                    val intent = Intent(this, DashboardActivity::class.java )
                        .putExtra("id", username)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "User / pass tidak ketemu", Toast.LENGTH_SHORT ).show()
                }
            }
        }

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisActivity::class.java)
            startActivity(intent)
        }

    }

}