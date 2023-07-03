package com.example.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasarimcalismasi.ui.theme.TasarimCalismasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasarimCalismasiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = stringResource(id = R.string.textYazi), fontSize = 50.sp)
        Button(onClick = { }) {
            Text(text = stringResource(id = R.string.buttonYazi), fontSize = 24.sp)
        }
    }
}

@Composable
fun KirmiziKare() {
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Red))
}
@Composable
fun YesilKare() {
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Green))
}
@Composable
fun Yazi(icerik:String, yaziBoyutu:Int) {
    Text(text = icerik, fontSize = yaziBoyutu.sp)
}

@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
        Sayfa()
    }
}