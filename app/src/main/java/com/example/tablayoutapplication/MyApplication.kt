package com.example.tablayoutapplication

import android.app.Application
import android.util.Log
import com.flurry.android.FlurryAgent


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        var FLURRY_APIKEY = "JQVT87W7TGN5W7SWY2FH";

//        FlurryAgent.Builder()
//            .withCaptureUncaughtExceptions(true)
//            .withIncludeBackgroundSessionsInMetrics(true)
//            .withLogLevel(Log.VERBOSE)
//            .withPerformanceMetrics(FlurryPerformance.All)
//            .build(this, FLURRY_API_KEY)



        FlurryAgent.setLogEnabled(true)
        FlurryAgent.setLogLevel(Log.INFO)
        FlurryAgent.setVersionName("1.0")
        FlurryAgent.init(this,FLURRY_APIKEY)
        Log.i("hi", "Initialized FLurry Agent");

    }
}