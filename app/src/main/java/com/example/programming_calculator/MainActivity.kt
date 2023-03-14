
package com.example.programming_calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.programming_calculator.NumberSystem.*
import com.example.programming_calculator.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var numberSystem = DECIMAL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        disableHexButtons()
        enableTwoToNineButtons()
        binding.btn0.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "0"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)}
        binding.btnNum1.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "1"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput) }

        binding.btnNum2.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "2"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput) }

        binding.btnNum3.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "3"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)}

        binding.btnNum4.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "4"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)}

        binding.btnNum5.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "5"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)}

        binding.btnNum6.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "6"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)}

        binding.btnNum7.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "7"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput) }

        binding.btnNum8.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "8"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput) }

        binding.btnNum9.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "9"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnA.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "A"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnB.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "b"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnC.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "c"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnD.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "d"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnE.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "e"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }

        binding.btnF.setOnClickListener {
            var input = binding.editOperation.text.toString()
            if (input == "0") input = ""

            val textInput = input + "f"
            binding.editOperation.text = textInput

            convertToNumberSystems(textInput)
        }
        binding.btnEqual.setOnClickListener {

            val textInput = binding.editOperation.text.toString()

            if (textInput == "") binding.editOperation.text = ""
            else {
                val inputValue = convertNumberSystemToDecimal(textInput).toString()
                val result = convertDecimalToNumberSystem(inputValue)
                convertToNumberSystems(result)
            }
        }

        binding.btnClear.setOnClickListener {
            clearInput()
        }
        binding.btnHex.setOnClickListener {
            numberSystem = HEX
            binding.editOperation.text = binding.btnHexRes.text
            enableHexButtons()
            enableTwoToNineButtons()
        }

        binding.btnOctal.setOnClickListener {
            numberSystem = OCTAL
            binding.editOperation.text = binding.btnOctalRes.text
            disableHexButtons()
            enableTwoToNineButtons()
            disable89Buttons()
        }

        binding.btnDic.setOnClickListener {
            numberSystem = DECIMAL
            binding.editOperation.text = binding.btnDecRes.text
            disableHexButtons()
            enableTwoToNineButtons()
        }

        binding.btnBin.setOnClickListener {
            numberSystem = BINARY
            binding.editOperation.text = binding.btnBinRes.text
            disableHexButtons()
            disableTwoToNineButtons()
        }}



    private fun clearInput() {
        binding.editOperation.text = ""
        binding.btnHexRes.text = ""
        binding.btnDecRes.text = ""
        binding.btnOctalRes.text = ""
        binding.btnBinRes.text = ""
    }


    private fun convertToNumberSystems(textInput: String) {

        when (numberSystem) {
            HEX -> {
                val decimal = textInput.toInt(16)
                binding.btnHexRes.text = decimal.toUInt().toString(16)
                binding.btnDecRes.text = decimal.toString()
                binding.btnOctalRes.text = decimal.toUInt().toString(8)
                binding.btnBinRes.text = decimal.toUInt().toString(2)

            }
            DECIMAL -> {
                val decimal = textInput.toInt()
                binding.btnHexRes.text = decimal.toUInt().toString(16)
                binding.btnDecRes.text = decimal.toString()
                binding.btnOctalRes.text = decimal.toUInt().toString(8)
                binding.btnBinRes.text = decimal.toUInt().toString(2)
            }
            OCTAL -> {
                val decimal = textInput.toInt(8)
                binding.btnHexRes.text = decimal.toUInt().toString(16)
                binding.btnDecRes.text = decimal.toString()
                binding.btnOctalRes.text = decimal.toUInt().toString(8)
                binding.btnBinRes.text = decimal.toUInt().toString(2)

            }
            BINARY -> {
                val decimal = textInput.toInt(2)
                binding.btnHexRes.text = decimal.toUInt().toString(16)
                binding.btnDecRes.text = decimal.toString()
                binding.btnOctalRes.text = decimal.toUInt().toString(8)
                binding.btnBinRes.text = decimal.toUInt().toString(2)


            }


        }

    }
    private fun convertDecimalToNumberSystem(input: String): String {
        val decimalValue = input.toInt()
        return when (numberSystem) {
            DECIMAL -> decimalValue.toString()
            HEX -> Integer.toHexString(decimalValue)
            BINARY -> Integer.toBinaryString(decimalValue)
            OCTAL -> Integer.toOctalString(decimalValue)
        }

    }

    private fun convertNumberSystemToDecimal(textInput: String) = when (numberSystem) {
        HEX -> Integer.parseInt(textInput, 16)
        DECIMAL -> textInput.toInt()
        OCTAL -> Integer.parseInt(textInput, 8)
        BINARY -> Integer.parseInt(textInput, 2)


    }
    private fun disableHexButtons() {
        binding.btnA.isEnabled = false
        binding.btnB.isEnabled = false
        binding.btnC.isEnabled = false
        binding.btnD.isEnabled = false
        binding.btnE.isEnabled = false
        binding.btnF.isEnabled = false
    }

    private fun enableHexButtons() {
        binding.btnA.isEnabled = true
        binding.btnB.isEnabled = true
        binding.btnC.isEnabled = true
        binding.btnD.isEnabled = true
        binding.btnE.isEnabled = true
        binding.btnF.isEnabled = true
    }

    private fun disable89Buttons() {
        binding.btnNum8.isEnabled = false
        binding.btnNum9.isEnabled = false
    }

    private fun enableTwoToNineButtons() {
        binding.btnNum2.isEnabled = true
        binding.btnNum3.isEnabled = true
        binding.btnNum4.isEnabled = true
        binding.btnNum5.isEnabled = true
        binding.btnNum6.isEnabled = true
        binding.btnNum7.isEnabled = true
        binding.btnNum8.isEnabled = true
        binding.btnNum9.isEnabled = true
    }

    private fun disableTwoToNineButtons() {
        binding.btnNum2.isEnabled = false
        binding.btnNum3.isEnabled = false
        binding.btnNum4.isEnabled = false
        binding.btnNum5.isEnabled = false
        binding.btnNum6.isEnabled = false
        binding.btnNum7.isEnabled = false
        binding.btnNum8.isEnabled = false
        binding.btnNum9.isEnabled = false
    }
}

enum class NumberSystem {
    HEX, DECIMAL, OCTAL, BINARY
}






