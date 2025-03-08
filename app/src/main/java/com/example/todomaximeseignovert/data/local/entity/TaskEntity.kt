package com.example.todokotlin.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todokotlin.domain.model.Task
import java.util.Date

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val createdDate: Date
) {
    fun toTask(): Task {
        return Task(
            id = id,
            title = title,
            description = description,
            createdDate = createdDate
        )
    }

    companion object {
        fun fromTask(task: Task): TaskEntity {
            return TaskEntity(
                id = task.id,
                title = task.title,
                description = task.description,
                createdDate = task.createdDate
            )
        }
    }
} 