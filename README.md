<p align="center">
  <img src="/Preview/ComposeLockBanner.png" width="100%"  />
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
<p float="left">
  <img src="/Preview/preview1.gif" width="32%" />
  <img src="/Preview/preview2.gif" width="32%" />
  <img src="/Preview/preview3.gif" width="32%" />
</p>



## Fallow me on social media 💖
[![Site](https://img.shields.io/badge/website-000000?style=for-the-badge&logo=About.me&logoColor=white)](http://mrhwsn.glitch.me/)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white)](https://www.instagram.com/mrhwsn/)
[![Telegram](https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white)](https://t.me/mrhwsn)
[![TikTok](https://img.shields.io/badge/TikTok-%23000000.svg?style=for-the-badge&logo=TikTok&logoColor=white)](www.tiktok.com/@mrhwsn)


