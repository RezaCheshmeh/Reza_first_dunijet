package com.example.simpletextsaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import com.example.simpletextsaver.databinding.ActivityMainBinding
import com.example.simpletextsaver.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    lateinit var binding :ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtSpalsh.startAnimation(alphaAnimation())
        merge_scale_rotate()
    }

    private fun alphaAnimation():AlphaAnimation{//transparency
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 800
        anim.fillAfter = true
        anim.repeatMode = Animation.REVERSE
        return anim
    }private fun rotateAnimation():RotateAnimation{
        val anim = RotateAnimation(0f,360f,
            Animation.RELATIVE_TO_SELF,0.5F,
            Animation.RELATIVE_TO_SELF,0.5f)
//            anim.duration = 800
//            anim.fillAfter = true
        return anim
    }
    private fun scaleAnimation():ScaleAnimation{
        val anim = ScaleAnimation(
            0f, 1f, 0f, 1f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
//        anim.duration = 800
//        anim.fillAfter = true
        return anim
    }
    private fun merge_scale_rotate(){
        val animSet = AnimationSet(true)
        animSet.addAnimation(rotateAnimation())
        animSet.addAnimation(scaleAnimation())
        animSet.duration = 800
        animSet.fillAfter = true
        binding.imgSplash.startAnimation(animSet)
    }




}