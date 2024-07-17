package com.bartoszkorszun.zwaar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform