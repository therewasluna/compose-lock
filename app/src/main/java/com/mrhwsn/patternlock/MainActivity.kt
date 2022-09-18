package com.mrhwsn.patternlock

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mrhwsn.composelock.ComposeLock
import com.mrhwsn.composelock.ComposeLockCallback
import com.mrhwsn.composelock.Dot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                ComposeLock(
                    modifier = Modifier
                        .fillMaxSize(),
                    dimension = 4,
                    100f,
                    Color.Black,
                    20f,
                    Color.Black,
                    30f,
                    callback = object :ComposeLockCallback{
                        override fun onStart(dot: Dot) {
                            Toast.makeText(this@MainActivity, "start on dot with id : ${dot.id}", Toast.LENGTH_SHORT).show()
                        }

                        override fun onDotConnected(dot: Dot) {
                            Toast.makeText(this@MainActivity, "dot connected with id : ${dot.id}", Toast.LENGTH_SHORT).show()
                        }

                        override fun onResult(result: List<Dot>) {
                            var connectedDots = ""
                            for (dot in result) connectedDots += "${dot.id }  "
                            Toast.makeText(this@MainActivity, "result : $connectedDots", Toast.LENGTH_SHORT).show()
                        }
                    }
                )
            }
        }
    }
}