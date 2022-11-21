package com.chulpash.abonsam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chulpash.abonsam.data.database.AppDatabase
import com.chulpash.abonsam.data.database.ClientDbModel
import com.chulpash.abonsam.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val db = AppDatabase.getInstance(this)

        binding.btnInsertClient.setOnClickListener {
            val client=ClientDbModel(null,binding.editTextTextPersonName.text.toString())
            Thread{db.clientsInfoDao().insertClient(client)}.start()
        }

    }
}