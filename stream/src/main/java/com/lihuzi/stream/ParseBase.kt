package com.lihuzi.stream

import java.util.*

interface ParseBase<T>{
    fun parse(t:T):ByteArray
}