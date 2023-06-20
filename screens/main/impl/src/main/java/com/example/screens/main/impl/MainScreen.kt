package com.example.screens.main.impl

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MainScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
    ){
        Search()

        LazyColumn(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
        ){

        }
    }
}

@Preview
@Composable
private fun Search(){
    Row (modifier = Modifier
        .fillMaxWidth()
        .background(Color.Blue),
    ){
        Text(
            text = "Search for players",
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 20.dp)
                .background(Color.Red,
                    shape = RoundedCornerShape(10.dp)
                    ),
            fontSize = 20.sp,
        )
    }
}

@Preview
@Composable
private fun User(){

}

@Preview
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}