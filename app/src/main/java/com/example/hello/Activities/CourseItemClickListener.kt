package com.example.hello.Activities


import com.example.hello.models.Course

interface CourseItemClickListener {
    fun onItemClick(course: Course)
}