package com.example.androidcomposeassignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposeassignment1.ui.theme.AndroidComposeAssignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidComposeAssignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box() {
                        BannerImage()
                        Title()
                    }

                }
            }
        }
    }
}
@Composable
fun Title(title: String){
    Text(text = title,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp))
}
@Composable
fun BannerImage(){
    Image(
        painter = painterResource(id = R.drawable.img),
        contentDescription = null,
        alignment = Alignment.TopStart
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeAssignment1Theme {
        BannerImage()
    }
}