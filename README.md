<p align="center">
  <img src="/Preview/ComposeLockBanner.png" />
</p>

# Compose Lock

compose lock is a pattern lock library based on jetpack compose framework


## Features

- custom dimension
- custom sensitivity
- custom colors
- custom animation duration
- supporting any size
## Installation

Add the JitPack repository to your build.gradle file

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add Compose Lock to the dependency
```gradle
dependencies {
    implementation 'com.github.mrhwsn:ComposeLock:1.0.0'
}
```
    
## Setup

use ComposeLock fuction in composeable scope

```kotlin
ComposeLock(
    modifier = Modifier.fillMaxWidth(),
    dimension = 4,
    sensitivity = 100f,
    dotsColor = Color.Black,
    dotsSize = 20f,
    linesColor = Color.Black,
    linesStroke = 30f,
    animationDuration = 200,
    animationDelay = 100,
    callback = object :ComposeLockCallback {
        override fun onStart(dot: Dot) {
            Toast.makeText(context, "start on dot with id : ${dot.id}", Toast.LENGTH_SHORT).show()
        }

        override fun onDotConnected(dot: Dot) {
            Toast.makeText(context, "dot connected with id : ${dot.id}", Toast.LENGTH_SHORT).show()
        }

        override fun onResult(result: List<Dot>) {
            var connectedDots = ""
            for (dot in result) connectedDots += "${dot.id }  "
            Toast.makeText(context, "result : $connectedDots", Toast.LENGTH_SHORT).show()
        }
    }
)
```


## Preview

