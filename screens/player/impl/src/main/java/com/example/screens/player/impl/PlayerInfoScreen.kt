package com.example.screens.player.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.screens.player.impl.components.AppBar
import com.example.screens.player.impl.components.Info
import com.example.screens.player.impl.components.Main
import com.example.screens.player.impl.components.MostPlayedHero

@Composable
fun PlayerInfoScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        item {
            AppBar()

            Main()

            Info()

            MostPlayedHero()
        }
    }
}


@Preview
@Composable
fun PlayerInfoScreen_Preview() {
    PlayerInfoScreen()
}