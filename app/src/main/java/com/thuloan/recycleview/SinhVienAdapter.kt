package com.thuloan.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.items_sinhvien.view.*

class SinhVienAdapter(private var svList: ArrayList<SinhVien>) : RecyclerView.Adapter<SinhVienAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_sinhvien, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return svList.size
    }

    override fun onBindViewHolder(holder: SinhVienAdapter.ViewHolder, position: Int) {

        val currentItem = svList[position]

        holder.tenSV = currentItem.ten
        holder.tuoiSV = currentItem.tuoi
        holder.lopSV = currentItem.lop
        holder.msSV = currentItem.MSSV
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tenSV = itemView.txtTen.text
        var tuoiSV = itemView.txtTuoi.text
        var lopSV = itemView.txtLop.text
        var msSV = itemView.txtMSSV.text
    }
}