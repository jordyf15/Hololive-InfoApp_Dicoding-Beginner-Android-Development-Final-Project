package com.jordivh.hololive_infoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListNicknameAdapter(private val listNickname: ArrayList<String>): RecyclerView.Adapter<ListNicknameAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNickname:TextView=itemView.findViewById(R.id.vtuber_nickname)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View= LayoutInflater.from(parent.context).inflate(R.layout.item_row_nickname,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nickname=listNickname[position]
        holder.tvNickname.text=nickname
    }

    override fun getItemCount(): Int {
            if(listNickname.size>4){
                return 4
            }else{
                return listNickname.size
            }
    }
}