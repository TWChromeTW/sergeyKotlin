package com.example.screens.player.impl.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.screens.player.impl.R

@Composable
internal fun AppBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota2_icon_placeholder),
            contentDescription = "dota_icon",
            Modifier
                .padding(25.dp, 20.dp, 0.dp, 20.dp)
                .clickable(onClick = { TODO() })
        )

        Text(text = "Player info", modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp))
    }
}

@Preview
@Composable
private fun AppBar_Preview() {
    AppBar()
}