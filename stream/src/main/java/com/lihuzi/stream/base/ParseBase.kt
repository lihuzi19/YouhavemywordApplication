package com.lihuzi.stream.base

import com.lihuzi.stream.parse.IntParse

interface ParseBase<T>{
    fun parse(bytes:ByteArray):T
    fun toByteArray(t:T):ByteArray
}
