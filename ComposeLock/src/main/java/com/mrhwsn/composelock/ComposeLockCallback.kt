package com.mrhwsn.composelock

interface ComposeLockCallback {
    fun onStart(dot: Dot)
    fun onDotConnected(dot: Dot)
    fun onResult(result:List<Dot>)
}