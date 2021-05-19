package com.jordivh.hololive_infoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListVtuberAdapter(private val listVtuber: ArrayList<Vtuber>) : RecyclerView.Adapter<ListVtuberAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var vtuberName: TextView = itemView.findViewById(R.id.vtuber_name)
        var vtuberDetail: TextView = itemView.findViewById(R.id.vtuber_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_vtuber, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val vtuber = listVtuber[position]
        Glide.with(holder.itemView.context)
                .load(vtuber.listPhoto)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)
        holder.vtuberName.text = vtuber.name
        holder.vtuberDetail.text = vtuber.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listVtuber[holder.adapterPosition]) }


    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Vtuber)
    }

    override fun getItemCount(): Int {
        return listVtuber.size
    }

}