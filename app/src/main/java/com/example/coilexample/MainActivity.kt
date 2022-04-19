package com.example.coilexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.request.CachePolicy
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.coilexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.load("https://w-dog.ru/wallpapers/2/95/532579308403728/nebo-bavarskie-alpy-gory-oblaka-pejzazh-palmy-pastbishhe.jpg") {
            placeholder(R.drawable.placeholder)
            error(R.drawable.ic_baseline_error_24)
            memoryCachePolicy(CachePolicy.ENABLED)
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(100f), CircleCropTransformation())
            //transformations(CircleCropTransformation())
            //transformations(GrayscaleTransformations())
            //transformations(BlurTransformations(applicationContext, 20f))
        }
    }
}