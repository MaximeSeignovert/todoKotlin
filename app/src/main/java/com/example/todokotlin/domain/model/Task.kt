package com.example.todokotlin.domain.model

import java.util.Date

data class Task(
    val id: Int = 0,
    val title: String,
    val description: String,
    val createdDate: Date = Date()
) 