package com.example.recycleviewperpustakaan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewperpustakimport.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
            "Tidak Didefinisikan",
            "Bukan Fiksi",
            "Fiksi",
            "Drama",
            "Esai",
            "Novel",
            "Cerita Pendek",
            "Pidato",
            "Sastra",
            "Semua Bentuk Karya"
    )

    val halo = arrayOf(
        "7.050 Buku",
        "9.000 Buku",
        "5.500 Buku",
        "1.500 Buku",
        "2.500 Buku",
        "5.000 Buku",
        "500 Buku",
        "100 Buku",
        "300 Buku",
        "31.450 Buku"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size) {
            list.add(Users(listUsers.get(i), halo.get(i)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}