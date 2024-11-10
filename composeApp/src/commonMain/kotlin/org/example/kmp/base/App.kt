package org.example.kmp


import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme

import androidx.compose.runtime.*

import com.workdev.taskmoveis.ui.navigation.Navigation

import org.jetbrains.compose.ui.tooling.preview.Preview



@ExperimentalMaterialApi
@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigation()
    }
}