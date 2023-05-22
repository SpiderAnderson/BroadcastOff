package com.example.broadcastoff

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log

class ScreenActionReceiver: BroadcastReceiver() {

    private var TAG = "ScreenActionReceiver"

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action

        if(Intent.ACTION_SCREEN_OFF == action){
            Log.d(TAG, "screen in off...")
        }
    }

    fun getOffFilter(): IntentFilter{
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_SCREEN_OFF)
        return filter
    }
}