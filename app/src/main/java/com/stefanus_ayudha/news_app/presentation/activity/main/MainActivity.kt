package com.stefanus_ayudha.news_app.presentation.activity.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stefanus_ayudha.pokemonapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
        initData()
        initObserver()
        initAction()
    }

    private fun initUI() {
        setupBinding()
        setContentView(binding.root)
    }

    private fun initData() {

    }

    private fun initObserver() {

    }

    private fun initAction() {

    }

    /**
     * ## Section UI
     */
    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}