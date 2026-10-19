package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Profile()
            }
        }
    }
}




@Preview(showBackground = true)

@Composable
fun Profile() {
    Box (modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "back", modifier = Modifier.align(
                Alignment.TopStart).padding( all=30.dp).size(40.dp))
        Image(
            painter = painterResource(id = R.drawable.note),
            contentDescription = "note", modifier = Modifier.align(
                Alignment.TopEnd).padding( all=30.dp).size(40.dp))
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id= R.drawable.avt),
            contentDescription = "avt", modifier = Modifier.size(230.dp).clip(CircleShape))
        Text("LE HA VY", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Text("052205016955")
    }
}