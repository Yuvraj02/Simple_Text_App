package com.example.simpletextapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletextapp.ui.theme.SimpleTextAppTheme

class MainActivity :
    ComponentActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(
            savedInstanceState
        )
        setContent {
            SimpleTextAppTheme {
                // A surface container using the 'background' color from the theme
                GreetingText(
                    name = "World"
                )
            }
        }
    }
}

@Composable
fun GreetingText(
    name: String
) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
//            .fillMaxSize()
//            .clickable { }
//            .padding(start=24.dp)
            .fillMaxSize()
            .padding(24.dp)
            .clickable {  },
        //style = TextStyle(color = Color.Blue,fontWeight = FontWeight.Bold,fontSize = 18.sp)
    style = MaterialTheme.typography.h3,
        fontWeight = FontWeight.SemiBold
    )
}

//@Composable
//fun GreetingButton(){
//Button(
//    onClick = { /*TODO*/ }) {
//    GreetingText(
//        name = "Button"
//    )
//}
//}

@Preview(
    showBackground = true
)
@Composable
fun DefaultPreview() {
    SimpleTextAppTheme {
//        GreetingText("Android")
        GreetingText(
            name = "World"
        )
    }
}