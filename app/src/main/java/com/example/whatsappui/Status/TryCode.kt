package com.example.whatsappui.Status


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappui.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JetpackComposeApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Favourites") },
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
            )
        }
    ) { paddingValues ->
        // LazyColumn for scrolling both AddFavouriteSection and list items
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // Add Favourite Section as the first item
            item {
                AddFavouriteSection()
            }

            // Recent Text as a single item
            item {
                Text(
                    text = "Recent",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(16.dp)
                )
            }

            // List of Items
            val items = listOf(
                ListItem("Item 1", R.drawable.nobita),
                ListItem("Item 2", R.drawable.sunset),
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
                ListItem("Item 3", R.drawable.froozen),// Add more if needed
            )

            // List of items with scrolling
            items(items) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(item.imageRes),
                        contentDescription = null,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(16.dp))
                    Text(text = item.name, modifier = Modifier.weight(1f))
                    IconButton(onClick = { /* Do something */ }) {
                        Icon(Icons.Default.Favorite, contentDescription = null)
                    }
                }
            }
        }
    }
}

@Composable
fun AddFavouriteSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Favourite Icon in Circle
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Gray)
        ) {
            Icon(Icons.Default.Favorite, contentDescription = "Favourite", tint = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Add Favourite Text
        Text(
            text = "Add Favourite",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }
}

data class ListItem(val name: String, val imageRes: Int)


@Preview
@Composable
private fun JetpackComposeAppPreview() {
    JetpackComposeApp()
    
}