package com.example.pke3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pke3.ui.theme.Pke3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pke3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BasicCompose(
                        modifier = Modifier.padding()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(
    modifier: Modifier = Modifier
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF2196F3), // Biru
                    Color(0xFF03DAC5)  // Hijau kebiruan
                )
            )
            )

    ){
        Text(
            text = "China vs Indonesia",
            style = TextStyle(
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                color = Color.LightGray,
            ),
        )
        Text(
            text = "2 - 1",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
        )
        Image(painter = painterResource(id = R.drawable.fifa),
            contentDescription = null,
            modifier  = Modifier
                .clip(RoundedCornerShape(10.dp))

        )// atau ""
        Text(
            text = " Nama",
            fontWeight = FontWeight.W800,
            fontSize = 20.sp,
        )
        Text(
            text = "Bimo Aditya Pangestu",

    }
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pke3Theme {
        Greeting("Android")
    }
}}