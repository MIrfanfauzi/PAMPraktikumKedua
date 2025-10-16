package com.example.pampraktikumpertama

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(all=20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }

}

@Composable
fun TataletakRow(modifier: modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly)
}