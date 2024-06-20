package com.example.compose_article_codelab

import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_article_codelab.ui.theme.Compose_Article_codelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_Article_codelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BannerImage(
                        header = stringResource(R.string.jetpack_header),
                        jetpack = stringResource (R.string.jetpack_text),
                        para1 = stringResource(R.string.para1)
                        )
                }
            }
        }
    }
}


@Composable
fun Filltext(header: String, jetpack: String, para1: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
    )
    {

        Text (
            text = header,
            fontSize = 24.sp,
            lineHeight = 80.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                 .padding(16.dp)
        )
        Text (
            text = jetpack,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(8.dp)
        )
        Text (
            text = para1,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Composable
fun BannerImage (header: String, jetpack: String, para1: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {

        Image(
            painter = image,
            contentDescription = null,
            modifier.fillMaxWidth()
        )
        Filltext(
            header = header,
            jetpack = jetpack,
            para1 = para1,
            modifier = Modifier,

        )
    }
}


@Preview(showBackground = true)
@Composable
fun Compose_Article_preview() {
    Compose_Article_codelabTheme {
        BannerImage(
            header = stringResource(R.string.jetpack_header),
            jetpack = stringResource (R.string.jetpack_text),
            para1 = stringResource(R.string.para1)

        )
    }
}