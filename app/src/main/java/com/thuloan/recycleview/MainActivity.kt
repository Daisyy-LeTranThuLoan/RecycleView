package com.thuloan.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val listSV = generateDummyList(500)
    private val adapter = SinhVienAdapter(listSV)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView.adapter = adapter
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
    }
    private fun generateDummyList(size: Int): ArrayList<SinhVien> {
        val list = ArrayList<SinhVien>()
        for (i in 0 until size) {

            val item = SinhVien("Loan $i", "Item $i", "Line 2", "19it $i")
            list += item
        }
        return list
    }
}