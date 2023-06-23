package com.example.screens.player.impl.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.screens.player.impl.R

@Composable
internal fun MostPlayedHero() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp, 13.dp, 15.dp, 0.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(15.dp)
            )
            .border(1.dp, Color.Black, shape = RoundedCornerShape(15.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 20.dp, 0.dp, 20.dp)
        ) {
            Text(text = "Most played hero")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.dota2_icon_placeholder),
                contentDescription = "hero",
                Modifier
                    .padding(0.dp, 50.dp, 0.dp, 50.dp)
                    .size(100.dp)
                    .clickable(onClick = { TODO() })
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 20.dp, 0.dp, 20.dp)
        ) {
            Text(text = "Hero name")
            Text(text = "Abbadon", modifier = Modifier.padding(vertical = 5.dp))
        }
    }
}

@Preview
@Composable
private fun MostPlayedHero_Preview() {
    MostPlayedHero()
}