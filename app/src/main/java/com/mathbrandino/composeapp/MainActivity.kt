package com.mathbrandino.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mathbrandino.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NewsStory()
                }
            }
        }
    }
}

@Composable
fun NewsStory() {
    val typography = MaterialTheme.typography
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = "imagem bonita",
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            "Davenport, California",
            style = typography.body2
        )
        Text(
            "December 2018",
            style = typography.body2
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}