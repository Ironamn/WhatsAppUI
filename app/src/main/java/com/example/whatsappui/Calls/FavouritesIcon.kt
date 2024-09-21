package com.example.whatsappui.Calls

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.ui.theme.FavColor

@Composable
fun FavouritesIcon() {
    Column(modifier = Modifier.padding(5.dp)

    ) {
        Text(text = "Favourites", fontSize = 20.sp, color = Color.White)

        Spacer(modifier = Modifier.padding(bottom = 3.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 8.dp, bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically

        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(FavColor)
                    .padding(),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorites",
                    modifier = Modifier
                        .size(22.dp)
                        .padding()
                )
            }

            Text(
                text = "Add favourite",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 15.dp)
            )
        }
    }
}

@Preview
@Composable
private fun FavouritesIconPreview() {
    FavouritesIcon()
}