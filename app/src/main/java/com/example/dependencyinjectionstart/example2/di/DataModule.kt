package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalBase(implLocalBase: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteData(remoteData: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}