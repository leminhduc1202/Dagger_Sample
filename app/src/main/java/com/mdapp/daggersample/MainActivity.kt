package com.mdapp.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mdapp.daggersample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String1")
    lateinit var testString: String

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "Test String from MainActivity: $testString ")

        binding.tvString1.text = testString
    }
}