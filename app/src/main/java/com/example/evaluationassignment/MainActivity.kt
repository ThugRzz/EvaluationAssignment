package com.example.evaluationassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.evaluationassignment.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                    Column(
                        modifier = Modifier.background(Color.Black),
                        verticalArrangement = Arrangement.spacedBy(32.dp),
                    ){
                        Divider(
                            modifier = Modifier
                                .clickable(
                                    interactionSource = MutableInteractionSource(),
                                    role = Role.DropdownList,
                                    indication = null,
                                    onClick = {},
                                ).size(32.dp),
                            color = Color.Blue
                        )
                        Divider(
                            modifier = Modifier.size(32.dp),
                            color = Color.Blue
                        )
                        Divider(
                            modifier = Modifier.size(32.dp),
                            color = Color.Blue
                        )
                        Divider(
                            modifier = Modifier.size(32.dp),
                            color = Color.Blue
                        )
                    }
                 //   Greeting("Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}