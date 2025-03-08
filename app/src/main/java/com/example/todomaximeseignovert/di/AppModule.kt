package com.example.todomaximeseignovert.di

import android.app.Application
import androidx.room.Room
import com.example.todomaximeseignovert.data.local.TaskDatabase
import com.example.todomaximeseignovert.data.repository.TaskRepositoryImpl
import com.example.todomaximeseignovert.domain.repository.TaskRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            "task_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTaskRepository(db: TaskDatabase): TaskRepository {
        return TaskRepositoryImpl(db.taskDao())
    }
} 