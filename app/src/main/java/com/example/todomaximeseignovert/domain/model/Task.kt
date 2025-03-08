package com.example.todomaximeseignovert.domain.model

import java.util.Date

data class Task(
    val id: Int = 0,
    val title: String,
    val description: String,
    val createdDate: Date = Date()
) 