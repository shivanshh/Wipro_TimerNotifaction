package com.wipronotifaction_timer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.wipronotifaction_timer.util.NotificationUtil
import com.wipronotifaction_timer.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
