package com.example.tasarimcalismasi

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

    Box {
        Box(modifier = Modifier
            .size(400.dp)
            .background(Color.Black))
        Column{
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Red))
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Green))
            Row {
                Box(modifier = Modifier
                    .size(100.dp)
                    .background(Color.Blue))
                Box(modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow))
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
        Sayfa()
    }
}