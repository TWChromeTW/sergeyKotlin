package com.example.screens.main.impl.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
internal fun ListPlayers() {
    listOf(
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
        PlyaerCard(),
    )
}

@Preview
@Composable
private fun ListPlayers_Preview() {
    ListPlayers()
}