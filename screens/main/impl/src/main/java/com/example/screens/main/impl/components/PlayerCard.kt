package com.example.screens.main.impl.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.impl.R

@Composable
internal fun PlyaerCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp, 13.dp, 15.dp, 0.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(25.dp)
            )
            .border(1.dp, Color.Black, shape = RoundedCornerShape(25.dp))
    ) {
        Image(
            painter = painterResource(id = R.drawable.monogram),
            contentDescription = "player_icon",
            modifier = Modifier
                .padding(25.dp, 25.dp, 0.dp, 25.dp)
                .size(65.dp)
        )

        Column(
            modifier = Modifier
                .padding(25.dp, 30.dp, 0.dp, 0.dp)
        ) {
            Text(text = "Header")
            Text(text = "Subhead", modifier = Modifier.padding(vertical = 10.dp))
        }
    }
}

@Preview
@Composable
private fun PlayerCard_Preview() {
    PlyaerCard()
}