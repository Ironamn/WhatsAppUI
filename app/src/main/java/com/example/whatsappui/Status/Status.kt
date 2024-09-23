package com.example.whatsappui.Status

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappui.Calls.CallingHistory1

//
//@Composable
//fun StatusPreview(item: StatusData) {
//    Box(
//        modifier = Modifier.padding(20.dp)
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Image(
//                painter = painterResource(id =item.image),
//                contentDescription = null,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape),
//                contentScale = ContentScale.Crop
//            )
//            Column(modifier = Modifier.padding(start = 15.dp)) {
//                Text(
//                    text = item.name,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(bottom = 8.dp)
//                )
//                Text(text = "5:23 PM")
//            }
//        }
//    }
//}
//@Composable
//fun CallingListHistory2(itemLists: List<StatusData>) {
//    LazyColumn {
//        items(itemLists){ item2 ->
//            StatusPreview(item = item2)
//        }
//    }
//}
//
//@Preview(showSystemUi = true)
//@Composable
//private fun StatusPreviewPreview() {
//    CallingListHistory2(itemLists = statusData)
//}