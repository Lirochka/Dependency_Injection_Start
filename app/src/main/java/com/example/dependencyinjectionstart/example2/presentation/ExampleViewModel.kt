package com.example.dependencyinjectionstart.example2.presentation

import android.util.Log
import com.example.dependencyinjectionstart.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this")
    }
}
