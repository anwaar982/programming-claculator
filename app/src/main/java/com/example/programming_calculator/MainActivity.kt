
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
    }



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


}}
enum class NumberSystem {
    HEX, DECIMAL, OCTAL, BINARY
}







