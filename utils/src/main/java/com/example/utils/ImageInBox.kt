package com.example.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ImageInBox(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String,
    contentPadding: PaddingValues
) {
    Box(modifier = modifier) {
        Image(
            modifier = Modifier
                .padding(contentPadding)
                .align(Alignment.Center),
            painter = painter,
            contentDescription = contentDescription
        )
    }
}


@Composable
@Preview
private fun ImageInBox_Preview() {
    ImageInBox(
        modifier = Modifier
            .clip(CircleShape)
            .size(30.dp)
            .background(color = MaterialTheme.colorScheme.onPrimaryContainer),
        painter = painterResource(id = R.drawable.dota_plus_icon),
        contentDescription = "",
        contentPadding = PaddingValues(5.dp)
    )
}