package com.example.mytestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var add = false
        var sub = false
        var multi = false
        var div = false
        var perc = false
        var expo = false
        var elem = false

        var defaultPrecision = 2
        var Numer = ""
        var firstNumber: Double = 0.0
        var secondNumber: Double = 0.0

        fun addNumber(btn: Button) {
            Numer += btn.text
            tvResult.text = Numer
        }

        fun resetActions() {
            add = false
            sub = false
            multi = false
            div = false
            perc = false
            expo = false
            elem = false
        }

        btn1.setOnClickListener {
            addNumber(btn1)
        }
        btn2.setOnClickListener {
            addNumber(btn2)
        }
        btn3.setOnClickListener {
            addNumber(btn3)
        }
        btn4.setOnClickListener {
            addNumber(btn4)
        }
        btn5.setOnClickListener {
            addNumber(btn5)
        }
        btn6.setOnClickListener {
            addNumber(btn6)
        }
        btn7.setOnClickListener {
            addNumber(btn7)
        }
        btn8.setOnClickListener {
            addNumber(btn8)
        }
        btn9.setOnClickListener {
            addNumber(btn9)
        }
        btn0.setOnClickListener {
            addNumber(btn0)
        }

        btnReset.setOnClickListener {
            Numer = ""
            firstNumber = 0.0
            secondNumber = 0.0
            add = false
            sub = false
            multi = false
            div = false
            perc = false
            expo = false
            elem = false
            tvResult.text = Numer
            tvAction.text = ""
        }

        btnAdd.setOnClickListener {
            resetActions()
            add = true
            tvAction.text = btnAdd.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnSub.setOnClickListener {
            resetActions()
            sub = true
            tvAction.text = btnSub.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnMulti.setOnClickListener {
            resetActions()
            multi = true
            tvAction.text = btnMulti.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnDiv.setOnClickListener {
            resetActions()
            div = true
            tvAction.text = btnDiv.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnPerc.setOnClickListener {
            resetActions()
            perc = true
            tvAction.text = btnPerc.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnDot.setOnClickListener {
            Numer += btnDot.text
        }

        btnExpo.setOnClickListener {
            resetActions()
            expo = true
            tvAction.text = btnExpo.text
            firstNumber = Numer.toDouble()
            Numer = ""
        }

        btnElem.setOnClickListener {
            resetActions()
            elem = true
            tvAction.text = btnElem.text
            firstNumber = Numer.toDouble()
            firstNumber = sqrt(firstNumber)
            Numer = firstNumber.toString()
            tvResult.text = Numer
        }

        btnResult.setOnClickListener {

            if (add == true) {
                secondNumber = Numer.toDouble()
                firstNumber += secondNumber
                Numer = firstNumber.toString()
                tvResult.text = Numer
            } else if (sub == true) {
                secondNumber = Numer.toDouble()
                firstNumber -= secondNumber
                Numer = firstNumber.toString()
                tvResult.text = Numer
            } else if (multi == true) {
                secondNumber = Numer.toDouble()
                firstNumber *= secondNumber
                Numer = firstNumber.toString()
                tvResult.text = Numer
            } else if (div == true) {
                if(Numer == "0") {
                    tvResult.text = "Err"
                } else {
                    secondNumber = Numer.toDouble()
                    firstNumber /= secondNumber
                    Numer = firstNumber.toString()
                    tvResult.text = Numer
                }
            } else if (perc == true) {
                secondNumber = Numer.toDouble()
                firstNumber = firstNumber * secondNumber / 100
                Numer = firstNumber.toString()
                tvResult.text = Numer
            } else if (expo == true) {
                secondNumber = Numer.toDouble()
                firstNumber = firstNumber.pow(secondNumber)
                Numer = firstNumber.toString()
                tvResult.text = Numer
            }
        }
//          TO DEVELOP
//        fun setPrecision(num: Double) {
//
//        }

    }

}

