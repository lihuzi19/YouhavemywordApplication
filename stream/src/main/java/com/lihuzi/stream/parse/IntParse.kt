package com.lihuzi.stream.parse

import com.lihuzi.stream.base.ParseBase

public class IntParse: ParseBase<Int> {
    override fun parse(bytes: ByteArray): Int {
        var target = 0
        var index = 0
        while (index<bytes.size){
            target+=(bytes[index].toInt() and 0xff).shl(8*index)
            index++
        }
        return target
    }

    override fun toByteArray(t: Int): ByteArray {
        var target = byteArrayOf(0,0,0,0)
        var index = 0
        while ((index < 4) && (index < 4)) {
            target[index] = (t.shr(8*index)and 0xff).toByte()
            index++
        }
        return target
    }


}
