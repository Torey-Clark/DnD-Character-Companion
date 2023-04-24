package com.aorzora_the_dev.dndcharactersheet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aorzora_the_dev.dndcharactersheet.ui.theme.DnDCharacterSheetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DnDCharacterSheetTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
    ) {
        val navButtonModifier = Modifier.fillMaxWidth(0.9f)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                onClick = {
                    TODO("open Characters view")
                },
                modifier = navButtonModifier.padding(top = 128.dp)
            ) {
                Text(
                    text = "Characters",
                    modifier = Modifier,
                )
            }

            Button(
                onClick = {
                    TODO("Open Campaigns view")
                },
                modifier = navButtonModifier
            ) {
                Text(
                    text = "Campaigns",
                )
            }

            Button(
                onClick = {
                    TODO("Open Weapons view")
                },
                modifier = navButtonModifier
            ) {
                Text(
                    text = "Weapons",
                )
            }

            Button(
                onClick = {
                    TODO("Open Races view")
                },
                modifier = navButtonModifier
            ) {
                Text(
                    text = "Races",
                )
            }

            Button(
                onClick = {
                    TODO("Open Quick Roll")
                },
                modifier = navButtonModifier.padding(top = 64.dp)
            ) {
                Text(
                    text = "Quick Roll",
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DnDCharacterSheetTheme {
        MainScreen()
    }
}