package com.apolo.arteapp.util

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build

object NetworkUtil {
    fun isInternetAvailable(context: Context) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetwork != null
    } else {
        (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo != null &&
                (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo?.isAvailable == true
    }
}