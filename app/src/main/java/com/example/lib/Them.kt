package com.example.lib

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi

class Them {
    companion object

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("ResourceAsColor")
    val colorRed: Color = Color.valueOf(R.color.purple_200)
}