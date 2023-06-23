package com.example.screens.main.impl

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.impl.R


@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Search()

        LazyColumn(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            items(count = 20){
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
                User()
            }
        }
    }
}

@Preview
@Composable
private fun Search() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .padding(30.dp, 10.dp, 0.dp, 10.dp)
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = { TODO() })
                .background(
                    Color.Red,
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(30.dp, 10.dp, 175.dp, 10.dp),
        ) {
            Text(text = "Search for players")
        }
    }
}

@Preview
@Composable
private fun User() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 7.dp)
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { TODO() })
            .padding(horizontal = 15.dp)
            .background(
                Color.LightGray,
                shape = RoundedCornerShape(25.dp)
            )
        ) {
            Image(painter = painterResource(id = R.drawable.monogram),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(10.dp, 5.dp, 0.dp, 5.dp)
                    .size(64.dp)
            )

            Column {
                Text(
                    text = "Header",
                    modifier = Modifier
                        .padding(20.dp, 13.dp, 0.dp, 5.dp)
                )
                Text(
                    text = "Subhead",
                    modifier = Modifier
                        .padding(20.dp, 0.dp, 0.dp, 0.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}