package com.example.dayscalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Date Picker
    fun openDTP(view: View) {
        val cal = Calendar.getInstance()
        val calYY = cal.get(Calendar.YEAR)
        val calMM = cal.get(Calendar.MONTH)
        val calDD = cal.get(Calendar.DAY_OF_MONTH)
        val usrInput = findViewById<TextView>(R.id.editDate)

        DatePickerDialog(this, { pickDate, yy, mm, dd ->
            val date = "${dd.toString().padStart(2, '0')} " +
                    "${(mm + 1).toString().padStart(2, '0')} $yy"
            usrInput.setText(date)
        }, calYY, calMM, calDD).show()
    }

    fun calculateAge(view: View) {
        val dateInput = findViewById<TextView>(R.id.editDate)
        val nameInput = findViewById<TextView>(R.id.editName)
        val nameOutput = findViewById<TextView>(R.id.textName)
        val dateOutput = findViewById<TextView>(R.id.textDayAnswer)
        val dateFormat = SimpleDateFormat("dd MM yyyy", Locale.JAPAN)

        // Name
        nameOutput.visibility = View.VISIBLE
        val msg = "${nameInput.text}, YOU ARE"
        nameOutput.setText(msg)

        // Date Calculator
        val now = Date()
        val res = dateFormat.parse(dateInput.text.toString())
        val ans = ((now.time - res.time) / 86400000).toString()
        dateOutput.setText(ans)
    }
}