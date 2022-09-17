package com.chslcompany.challengecomposealura

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.chslcompany.challengecomposealura.ui.theme.ChallengeComposeAluraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChallengeComposeAluraTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column {
        Row {
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = "profile pic"
            )
        }
        Text(text = "Carlos Henrique")
        Text(text = "pontoevirgula")
        Text(text = "Android Software Developer at BRQ")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChallengeComposeAluraTheme {
        ProfileScreen()
    }
}

