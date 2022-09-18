package com.mrhwsn.composelock

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.ui.geometry.Offset

data class Dot (
    val id: Int,
    val offset: Offset,
    val size:Animatable<Float,AnimationVector1D>
)