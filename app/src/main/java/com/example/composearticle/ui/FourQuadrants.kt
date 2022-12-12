package com.example.composearticle.ui

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.composearticle.ui.ui.theme.ComposeArticleTheme

class FourQuadrants : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                        Screen()

                }
            }
        }
    }
}

@Composable
fun Screen(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CardInfo(Title = "Text composable",
                Description = "Displays text and follows Material Design guidelines.",
                bgColor = Color.Green,
                modifier = Modifier.weight(1f)
                )
            CardInfo(Title = "Image composable",
                Description = "Creates a composable that lays out and draws a given Painter class object.",
                bgColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            CardInfo(Title = "Row composable",
                Description = "A layout composable that places its children in a horizontal sequence.",
                bgColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            CardInfo(Title = "Column composable",
                Description = "A layout composable that places its children in a vertical sequence.",
                bgColor = Color.Gray,
                modifier = Modifier.weight(1f)
            )
        }


    }
}


@Composable
fun CardInfo(
    Title :String,
    Description : String,
    bgColor : Color,
    modifier : Modifier= Modifier
)
    {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(bgColor)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = Title,
                fontWeight = Bold,
                modifier = Modifier.padding(bottom = 16.dp)
                )
            Text(text = Description,
            textAlign = TextAlign.Justify)


        }

}

@Preview
@Composable
fun preview(){
    Screen()
}
