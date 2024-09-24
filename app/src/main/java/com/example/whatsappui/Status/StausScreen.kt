//package com.example.whatsappui.Status
//
//import android.annotation.SuppressLint
//import androidx.compose.animation.AnimatedVisibility
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.gestures.scrollable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowDown
//import androidx.compose.material.icons.filled.KeyboardArrowUp
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.whatsappui.R
//
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@Composable
//fun StatusScreen(itemLists: List<StatusData>) {
//    var isArrowDown by remember {
//        mutableStateOf(false)
//    }
//    var expanded by remember { mutableStateOf(true) }
//
//    Scaffold (
//
//    ){
//        Column {
//            StatusScreen()
//            LazyColumn(modifier = Modifier.padding(10.dp)) {
//                items(profilePhoto) {
//                    Column {
//                        Text(
//                            text = "Status",
//                            fontSize = 20.sp,
//                            color = Color.Black
//                        )
//                        Spacer(modifier = Modifier.padding(15.dp))
//                        Row(verticalAlignment = Alignment.CenterVertically) {
//                            Image(
//                                painter = painterResource(id = R.drawable.yinyang),
//                                contentDescription = null,
//                                modifier = Modifier
//                                    .clip(CircleShape)
//                                    .size(60.dp),
//                                contentScale = ContentScale.Crop
//                            )
//                            Column() {
//                                Text(
//                                    text = "My Status",
//                                    fontSize = 20.sp,
//                                    modifier = Modifier.padding(start = 10.dp)
//                                )
//                                Text(
//                                    text = "Tap to add status update", fontSize = 15.sp,
//                                    modifier = Modifier
//                                        .padding(start = 10.dp)
//                                )
//                            }
//                        }
//                        Spacer(
//                            modifier = Modifier.padding(start = 15.dp, top = 20.dp)
//                        )
//                        Box(modifier = Modifier.fillMaxSize()) {
//                            Column(
//                                modifier = Modifier
//                                    .fillMaxSize()
//                                    .clickable { }
//
//                            ) {
//                                Row(
//                                    modifier = Modifier.fillMaxSize(),
//                                    verticalAlignment = Alignment.CenterVertically,
//                                    horizontalArrangement = Arrangement.SpaceBetween
//                                ) {
//                                    Text(text = "Viewed updates", fontSize = 15.sp)
//                                    IconButton(onClick = {
//                                        isArrowDown = !isArrowDown
//
//                                    }
//                                    ) {
//                                        Icon(
//                                            imageVector =
//                                            if (isArrowDown)
//                                                Icons.Default.KeyboardArrowDown
//                                            else
//                                                Icons.Default.KeyboardArrowUp,
//                                            contentDescription = null,
//                                            modifier = Modifier.clickable {
//                                                expanded = !expanded
//                                            }
//
//                                        )
//
//                                    }
//                                }
//                                AnimatedVisibility(expanded) {
//                                    Column {
////                                    Text(text = "Hello")
//
//                                        LazyColumn {
//                                            items(itemLists){ item2 ->
//                                                StatusPreview(item = item2)
//
//                                            }
//                                        }
//
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//    }
//}
//
//
//
//@Preview
//@Composable
//private fun StatusPreview() {
//    StatusScreen(itemLists = statusData)
//}
