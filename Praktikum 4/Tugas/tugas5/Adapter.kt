package com.example.tugas5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas5.R
import com.example.tugas5.Users
import kotlinx.android.synthetic.main.list.view.*

class Adapter (private val ds_users:ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list,parent, false))
    }

    override fun getItemCount(): Int = ds_users.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.myview.lbList.text = ds_users.get(position).name

        holder.myview.setOnClickListener{
            Toast.makeText(holder.myview.context,"Mobil " + ds_users.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

    class Holder(val myview: View) : RecyclerView.ViewHolder(myview)

}