package com.example.tienho_firstapp.testlibrary

import android.content.Context
import android.util.Log
import com.shashank.sony.fancytoastlib.FancyToast

class TestToast(val context: Context) {
    fun toast1(){
        Log.e("TestToast", "toast1")
        FancyToast.makeText(context,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.DEFAULT,true).show()
    }
    fun toast2(){
        FancyToast.makeText(context,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show()
    }
}