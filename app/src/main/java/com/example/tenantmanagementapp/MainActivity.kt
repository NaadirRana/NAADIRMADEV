package com.example.tenantmanagementapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tenantmanagementapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Handle SAVE button click using Data Binding
        binding.saveButton.setOnClickListener {
            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            // Instantiate Tenant and assign to binding variable for Data Binding display
            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant
        }
    }
}
