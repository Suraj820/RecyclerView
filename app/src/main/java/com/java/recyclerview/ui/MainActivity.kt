package com.java.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.java.recyclerview.GlideImageLoader
import com.java.recyclerview.R
import com.java.recyclerview.adapter.EmployeesAdapter
import com.java.recyclerview.model.EmployeeRole
import com.java.recyclerview.model.Gender
import com.java.recyclerview.model.UiModel

class MainActivity : AppCompatActivity() {
    private val employeesAdapter by lazy {
        EmployeesAdapter(
            layoutInflater,
            GlideImageLoader(this)
        )
    }
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.recycler_view) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = employeesAdapter
        recyclerView.layoutManager =
            LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL,
                false
            )


        employeesAdapter.setData(
            listOf(
                UiModel(
                    "Vaibhavi",
                    "Vaibhavi quickly through the organization",
                    EmployeeRole.Management,
                    Gender.Female,
                    "https://avatars.githubusercontent.com/u/84843568?v=4"
                ),
                UiModel(
                    "Suraj",
                    "A talented developer",
                    EmployeeRole.Technology,
                    Gender.Male,
                    "https://avatars.githubusercontent.com/u/54694312?v=4"
                ),
                UiModel(
                    "Aditi",
                    "Excellent at retention",
                    EmployeeRole.HumanResources,
                    Gender.Female,
                    "https://avatars.githubusercontent.com/u/89302011?v=4"
                )
            )
        )
    }
}