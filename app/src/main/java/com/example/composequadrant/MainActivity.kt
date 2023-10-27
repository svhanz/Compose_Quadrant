package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			ComposeQuadrantTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colorScheme.background
				) {
					//Greeting("Android")
				}
			}
		}
	}
}

@Composable
fun CardPattern(title: String, descr: String, modifier: Modifier = Modifier) {
	Column (
		modifier = Modifier
			.padding(16.dp)
			.background(Color(0xFFEADDFF))
			.fillMaxWidth()
			.fillMaxHeight(),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center
	){
		Text(
			text = title,
			modifier = modifier.padding(bottom = 16.dp),
			fontWeight = FontWeight.Bold
		)
		Text(
			text = descr,
			modifier = Modifier,
			textAlign = TextAlign.Justify
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	ComposeQuadrantTheme {
		CardPattern(
			stringResource(R.string.text_composable),
			stringResource(R.string.displays_text)
		)
	}
}