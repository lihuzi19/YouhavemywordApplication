package com.lihuzi.stream.base

import com.lihuzi.stream.parse.IntParse

interface ParseBase<T>{
    fun parse(bytes:ByteArray):T
    fun toByteArray(t:T):ByteArray
}

fun main(args: Array<String>) {
    var parse = IntParse()
    System.out.println(parse.parse(parse.toByteArray(100)))
}