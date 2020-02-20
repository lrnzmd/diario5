package com.example.diario5.lezioni.db

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.diario5.R
import kotlinx.android.synthetic.main.lezione.view.*
import org.w3c.dom.Text

class LezioniAdapter(var lezioni: ArrayList<Lezioni>) :
    ListAdapter<Lezioni, LezioniAdapter.LezioniViewHolder>(LezioniDiffCallback) {

    private val lezioniinfo = arrayListOf(lezioni)


    inner class LezioniViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val orario = itemview.findViewById<TextView>(R.id.asigned_time)
        val materia = itemview.findViewById<TextView>(R.id.asigned_materia)
    }


    override fun getItemCount(): Int {
        return lezioniinfo.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LezioniViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.lezione, parent, false)
        return LezioniViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: LezioniViewHolder, position: Int) {
        val item = lezioniinfo(position)
        holder.materia.text = item.asigned_materia.toString()
        holder.orario.text = item.asigned_orario.toString()

    }
}


class LezioniDiffCallback : DiffUtil.ItemCallback<Lezioni>() {
    override fun areItemsTheSame(oldItem: Lezioni, newItem: Lezioni): Boolean {
        return oldItem == newItem
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: Lezioni, newItem: Lezioni): Boolean {
        return oldItem == newItem
    }
}


