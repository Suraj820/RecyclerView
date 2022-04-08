package com.java.recyclerview.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.java.recyclerview.ui.ImageLoader
import com.java.recyclerview.R
import com.java.recyclerview.model.UiModel
//
// Created by Suraj on 02/04/22.
class EmployeesAdapter (
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
): RecyclerView.Adapter<EmployeeViewHolder>(){
    private  val employeeData = mutableListOf<UiModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(employeeData : List<UiModel>): Unit {
        this.employeeData.clear();
        this.employeeData.addAll(employeeData)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = layoutInflater.inflate(R.layout.item_employee,parent,false)
        return EmployeeViewHolder(view,imageLoader)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.bindData(employeeData[position])
    }

    override fun getItemCount() = employeeData.size


}