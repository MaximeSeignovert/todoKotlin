package com.example.todomaximeseignovert.data.repository

import com.example.todomaximeseignovert.data.local.dao.TaskDao
import com.example.todomaximeseignovert.data.local.entity.TaskEntity
import com.example.todomaximeseignovert.domain.model.Task
import com.example.todomaximeseignovert.domain.repository.TaskRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class TaskRepositoryImpl @Inject constructor(
    private val taskDao: TaskDao
) : TaskRepository {

    override fun getAllTasks(): Flow<List<Task>> {
        return taskDao.getAllTasks().map { entities ->
            entities.map { it.toTask() }
        }
    }

    override suspend fun getTaskById(id: Int): Task? {
        return taskDao.getTaskById(id)?.toTask()
    }

    override suspend fun insertTask(task: Task) {
        taskDao.insertTask(TaskEntity.fromTask(task))
    }

    override suspend fun updateTask(task: Task) {
        taskDao.updateTask(TaskEntity.fromTask(task))
    }

    override suspend fun deleteTask(task: Task) {
        taskDao.deleteTask(TaskEntity.fromTask(task))
    }
} 