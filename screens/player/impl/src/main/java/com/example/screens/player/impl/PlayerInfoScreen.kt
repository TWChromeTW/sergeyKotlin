package com.example.screens.player.impl

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlayerInfoScreen(){
    Column {
        Image(painter = painterResource(id = R.drawable.dota2_icon_placeholder), contentDescription = "sdvd")
    }
}



@Preview
@Composable
fun PlayerInfoScreen_Preview(){

}