package com.example.msgshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.msgshareapp.Constants
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.list_item.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe Call ?.
        //Safe Call with let ?.let{}
        val bundle: Bundle? = intent.extras

        bundle?.let {
            val msg = bundle.getString(Constants.USER_MSG_KEY)

            Toast.makeText(this,msg , Toast.LENGTH_SHORT).show()
            txvUserMessage.text = msg

        }

    }
}