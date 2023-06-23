package com.example.screens.player.impl.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
internal fun Main() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp, 13.dp, 15.dp, 0.dp)
            .background(
                Color.White, shape = RoundedCornerShape(25.dp)
            )
            .border(0.9.dp, Color.Black, shape = RoundedCornerShape(25.dp))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.padding(15.dp, 7.dp, 0.dp, 7.dp)
            ) {
                Column(
                    modifier = Modifier
                        .size(112.dp)
                        .background(
                            Color.LightGray, shape = RoundedCornerShape(75.dp)
                        ),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.dota2_icon_placeholder),
                        contentDescription = "dota_icon",
                        Modifier.size(80.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp, 100.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(text = "NickName")
                    Text(text = "Chrome")
                }

                Column(
                    modifier = Modifier.padding(5.dp, 10.dp, 0.dp, 0.dp)
                ) {
                    Text(text = "Last Online")
                    Text(text = "Never")
                }
            }
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 10.dp, 15.dp, 0.dp)
        ) {
            Text(text = "PROFILE LINK")
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, 10.dp, 15.dp, 7.dp),

            ) {
            Text(text = "STEAM PROFILE LINK")
        }

    }
}

@Preview
@Composable
private fun Main_Preview() {
    Main()
}