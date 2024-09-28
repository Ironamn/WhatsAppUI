package com.example.whatsappui.Calls

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.ui.theme.BackgroundColor
import com.example.whatsappui.ui.theme.FavColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CallingScreen(itemLists: List<ListItem>) {

    Scaffold(modifier = Modifier.background(color = Color.Black),
        containerColor = BackgroundColor,
        topBar = {
            CallingTopBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)

        ) {
            FavouritesIcon()

            Text(
                text = "Recent", color = Color.White, fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn {
                items(itemLists) { item ->
                    CallingHistory(items = item)
                }
            }


        }

    }
}

@Composable
fun CallingHistory(items: ListItem) {
    Box(modifier = Modifier.clickable { }) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = items.imageRes),
                contentDescription = "Nobita Shizuka",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(1f)
            ) {
                Text(
                    text = items.name,
                    color = Color.White
                )
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowOutward,
                        contentDescription = "",
                        tint = FavColor,
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(20.dp)
                            .rotate(180f)
                    )
                    Text(
                        text = "11 September, 9:08 am",
                        color = Color.White,
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            IconButton(
                onClick = { /*TODO*/ },
            ) {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = "Call Icon",
                    tint = Color.White,
                )
            }

        }

    }
}

@Preview
@Composable
private fun CallingScreenPreview() {
CallingScreen(itemLists = items)
}