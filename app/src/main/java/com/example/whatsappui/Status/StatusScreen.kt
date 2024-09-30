package com.example.whatsappui.Status

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.Chat
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.CameraAlt
import androidx.compose.material.icons.rounded.Commit
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.QrCodeScanner
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.R
import com.example.whatsappui.ui.theme.BackgroundColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusScreen2(onClick: () -> Unit = {}) {
    Scaffold(containerColor = BackgroundColor,
        topBar = {
            TopAppBar(title =
            { Text(text = "Calls", fontSize = 20.sp) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = BackgroundColor,
                    titleContentColor = Color.White
                ),
                actions = {
                    Button(
                        onClick = { /* TODO */ },
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent,

                            )
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.QrCodeScanner,
                            contentDescription = "QR Code Scanner", tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.PhotoCamera,
                            contentDescription = "Search", tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.Search,
                            contentDescription = "Search", tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }

                    Button(
                        onClick = { /*TODO*/ },
                        contentPadding = PaddingValues(0.dp),
                        colors = ButtonDefaults.buttonColors(
                            Color.Transparent
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Person,
                            contentDescription = "Menu", tint = Color.White,
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = { onClick() },
                modifier = Modifier.size(70.dp)
            ) {
                Column {
                    Icon(
                        imageVector = Icons.Rounded.CameraAlt,
                        contentDescription = "Camera",
                        modifier = Modifier.size(35.dp)
                    )


                }
            }

        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
//            Text(text = "Mogli Pagal hai", fontSize = 50.sp)

            StatusLazyColumn(itemLists = statusData)
        }

    }
}

@Composable
fun StatusPhoto(item: StatusData) {

    Box(
        modifier = Modifier.padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = item.image),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(start = 15.dp)) {
                Text(
                    text = item.name,
                    fontWeight = FontWeight.Bold, color = Color.White,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(text = "5:23 PM", color = Color.White)
            }
        }
    }
}

@Composable
fun StatusLazyColumn(itemLists: List<StatusData>) {

    LazyColumn(

    ) {
        item {
            StatusLogo()
        }
        items(itemLists) { item ->
            StatusPhoto(item = item)
        }
    }
}


@Composable
fun StatusLogo() {
    Text(
        text = "Status", color = Color.White,
        fontSize = 25.sp, fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(20.dp)
    )

    Row(
        modifier = Modifier.padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.yinyang),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(start = 10.dp)) {

            Text(
                text = "My status", fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold, color = Color.White
            )

            Text(
                text = "Tap to add status update", color = Color.White,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(10.dp)
            )
        }


    }

    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Viewed updates", color = Color.White, fontSize = 15.sp)

        Icon(
            imageVector = Icons.Default.KeyboardArrowUp,
            contentDescription = null, tint = Color.White
        )
    }

}


@Preview(showBackground = true)
@Composable
private fun StatusScreenPreview() {
    StatusScreen2()
}