package com.example.screens.player.impl.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun Info() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White, shape = RoundedCornerShape(17.dp)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 15.dp, 25.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "MMR")
            Text(text = "2500")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 15.dp, 25.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Wins")
            Text(text = "886")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 15.dp, 25.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Losses")
            Text(text = "774")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 15.dp, 25.dp, 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Win rate %")
            Text(text = "66,87%")
        }
    }
}


@Preview
@Composable
private fun Info_Preview() {
    Info()
}