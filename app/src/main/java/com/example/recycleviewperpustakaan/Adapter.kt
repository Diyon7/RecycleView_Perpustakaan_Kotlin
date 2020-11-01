package com.example.recycleviewperpustakimport

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewperpustakaan.R
import com.example.recycleviewperpustakaan.Users
import kotlinx.android.synthetic.main.list.view.*

class Adapter(private val list:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder> () {

//    private var context: Context?=null;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.lbList.text = list.get(position).name
        holder.view.ket.text = list.get(position).halo
        holder.itemView.cardList.setOnClickListener {
            Toast.makeText(holder.itemView.context,"Anda Klik Bentuk Karya " + list.get(position).name + " Dengan Total " + list.get(position).halo, Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}