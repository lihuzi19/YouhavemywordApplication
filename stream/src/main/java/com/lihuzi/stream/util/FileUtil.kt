package com.lihuzi.stream.util

import java.io.File
import java.io.FileWriter

class FileUtil {

    companion object {
        fun getFileWrite(name: String, path: String): FileWriter {
            return FileWriter(File(path,name))
        }
    }

}