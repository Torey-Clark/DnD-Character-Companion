package com.aorzora_the_dev.dndcharactersheet.ui.characters

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CharacterScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            CharacterScreenTopBar()
        },
        floatingActionButton = {
            CreateCharacterFab()
        }
    ) {
        Column() {

        }
    }
}

@Composable
fun CharacterScreenTopBar(
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text("Characters")
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    TODO("Go to the previous page")
                }
            ) {
                Icon(Icons.Filled.ArrowBack, "Go back")
            }
        },
        actions = {
            IconButton(
                onClick = {
                    TODO("Open the character creation view")
                }
            ) {
                Icon(Icons.Filled.Add, "Create Character")
            }
        },
        modifier = modifier
    )
}

@Composable
fun CreateCharacterFab(
    modifier: Modifier = Modifier,
) {
    FloatingActionButton(
        onClick = {
            TODO("Open the character creation view")
        },
        modifier = Modifier
    ) {
        Icon(Icons.Filled.Add, "Create Character")
    }
}

@Composable
fun CharacterCard(
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.clickable(
            onClick = {
                TODO("Open Character details view")
            }
        )
    ) {
        val radius = 16.dp
        Image(ImageBitmap(32, 32), "John Doe")
        Column() {
            Row() {
                Text("John Doe")
                Text("Human")
                Text("20")
            }
            Row() {
                Text("Lvl 20 Archer")
            }
        }
    }
    Card() {

    }
}