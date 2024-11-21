package edu.farmingdale.threadsexample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.farmingdale.threadsexample.ui.theme.ThreadsExampleTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThreadsExampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    FibonacciDemoWithBgThrd()
                }
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

// DoneToDo 1: Call `FibonacciDemoNoBgThrd` that calculates the Fibonacci number of a given number.
// DoneToDo 2: Create a composable function called `FibonacciDemoWithCoroutine` that calculates the
//  Fibonacci number of a given number using a coroutine.
// DoneToDo 3: Start the application using the CountDownActivity
// DoneToDo 4: Make the Text of the timer larger
// DoneToDo 5: Show a visual indicator of the timer going down to 0
// DoneToDo 6: Add a button to rest the timer
// ToDo 7: Play a sound when the timer reaches 0
// ToDo 8: During the last 10 seconds, make the text red and bold
