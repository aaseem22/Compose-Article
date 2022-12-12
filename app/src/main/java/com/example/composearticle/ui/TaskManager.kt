package com.example.composearticle.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.R
import com.example.composearticle.ui.ui.theme.ComposeArticleTheme

class TaskManager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    MainScreen()

                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    Column {
        Image()
        TaskCompletion(message = stringResource(R.string.task_1))
        TaskAppreciation(nice = "Nice Work !")
    }
}

@Composable
fun Image(){
    val image1= painterResource(R.drawable.ic_task_completed)
    Image(painter = image1,
        contentDescription =null,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}

@Composable
fun TaskCompletion(message: String){
    Text(text = message,
    fontSize = 24.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(top = 24.dp, bottom = 8.dp)
        )
}

@Composable
fun TaskAppreciation(nice: String){
    Text(text = nice,
        fontSize = 16.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeArticleTheme {
        MainScreen()

    }
}