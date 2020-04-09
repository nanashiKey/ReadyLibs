package com.ngopidev.project.ngopihelpers

import android.content.Context
import android.content.Intent
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.text.NumberFormat
import java.util.*


/**
 *   created by Irfan Assidiq on 4/9/20
 *   email : assidiq.irfan@gmail.com
 **/
class NgopiHelpers {
    lateinit var ctx: Context
    constructor()
    constructor(ctx: Context){
        this.ctx = ctx
    }

    /**
     * untuk memunculkan short toast
     */
    fun showShortToast(msg : String){
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
    }

    /**
     * untuk memunculkan long toast
     */
    fun showLongToast(msg: String){
        Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show()
    }

    /**
     * untuk mengganti warna windows bar
     */
    fun setWindowsBar(saved : AppCompatActivity, color: Int){
        val windows = saved.window
        windows.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        windows.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        windows.setStatusBarColor(ContextCompat.getColor(ctx, color))
    }

    /**
     * untuk mengganti warna navigation bar
     */
    fun setNavBarBckg(saved: AppCompatActivity, color : Int){
        val windows = saved.window
        windows.navigationBarColor = saved.resources.getColor(color)
    }

    /**
     * mempersingkat sintaks dari Intent
     */
    fun <T : Any> goTo (gowhere : Class<T>){
        ctx.startActivity(Intent(ctx, gowhere))
    }

    /**
     * set currency jadi rupiah
     */
    fun setCurrency(harga : Long) : String?{
        val localecId = Locale("in", "ID")
        val formatRP = NumberFormat.getCurrencyInstance(localecId)
        return formatRP.format(harga)
    }

    /**
     * untuk memunculkan dialog sederhana
     */

}