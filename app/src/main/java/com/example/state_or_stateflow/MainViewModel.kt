package com.example.state_or_stateflow

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.random.Random

class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val color = savedStateHandle.getStateFlow("color" , 0xFFFFFFFF)

    var composeColor by mutableStateOf(0xFFFFFFFF)
        private set

    fun generateNewColor(){
        val color = Random.nextLong(0xFFFFFFFF)

        composeColor = color

        savedStateHandle["color"] = color
    }
}