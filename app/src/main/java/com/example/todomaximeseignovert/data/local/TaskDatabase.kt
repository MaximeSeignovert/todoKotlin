package com.example.todokotlin.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todokotlin.data.local.dao.TaskDao
import com.example.todokotlin.data.local.entity.TaskEntity
import com.example.todokotlin.data.local.converter.DateConverter

@Database(
    entities = [TaskEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
} 