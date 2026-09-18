package com.samay.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.samay.app.navigation.SamayNavHost
import com.samay.app.ui.theme.SamayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SamayTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    // onboardingDone real vendrá de DataStore (P3). Por ahora false.
                    SamayNavHost(onboardingDone = false)
                }
            }
        }
    }
}