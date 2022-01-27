package com.elmiramammadova.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Save(view: View){
        val alert=AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
          Toast.makeText(this,"Saved!",Toast.LENGTH_LONG).show()
        })
        alert.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this,"Not Saved!",Toast.LENGTH_LONG).show()
        })
        alert.show()
    }
}