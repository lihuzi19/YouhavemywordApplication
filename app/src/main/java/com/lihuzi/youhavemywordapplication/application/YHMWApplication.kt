package com.lihuzi.youhavemywordapplication.application

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.content.Intent
import com.lihuzi.youhavemywordapplication.service.MessageService

class YHMWApplication : Application() {

    override fun onCreate() {
        super.onCreate()


        if (!getCurrentProcessName().contains(":service")) {
            var intent = Intent(this,MessageService().javaClass)
            startService(intent)
        }
    }

    fun getCurrentProcessName(): String {
        var pid = android.os.Process.myPid()
        var manager = applicationContext.getSystemService(Context.ACTIVITY_SERVICE)
        if (manager is ActivityManager) {
            for (process: ActivityManager.RunningAppProcessInfo in manager.runningAppProcesses) {
                if (pid == process.pid) {
                    return process.processName
                }
            }
        }
        return ""
    }
}