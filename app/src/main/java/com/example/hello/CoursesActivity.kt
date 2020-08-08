package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.row_courses_item.*

data class Courses(val course_id: Int, val course_name: String, val course_code: Int, val instructor:String, val description:String)

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        rvCourses.LayoutManager = LinearLayoutManager(baseContext)
        val coursesRecyclerViewAdapter = CoursesRecyclerViewAdapter(coursesList = listOf(

            Courses(20,"Design",57,"Jane","Creativity"),
            Courses(90,"Kotlin",49,"Arie","Android Development"),
            Courses(65,"Python",35,"James","Databases"),
            Courses(84,"Html/Css",82,"Jeff","Web Development"),
            Courses(27,"Javascript",28,"Lean","React"),
            Courses(70,"Navigating",58,"Grey","Navigation"),
            Courses(56,"C++",40,"Roy","Electricals"),
            Courses(39,"Product Design",76,"Barre","Drafting"),
            Courses(69,"Entreprenuership",25,"Kelly Murungi","Finance"),
            Courses(50,"Hardware Electronics",33,"Barre Yasin","Arduino")


        ))
        rvCourses.adapter=CoursesRecyclerViewAdapter
    }
}