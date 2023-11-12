package com.example.simpletextsaver

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import androidx.fragment.app.Fragment
import com.example.simpletextsaver.databinding.ActivitySplashBinding

class Splash : Fragment() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding  = ActivitySplashBinding.inflate(inflater,container,false)
        binding.txtSpalsh.startAnimation(alphaAnimation())
        merge_scale_rotate()
        binding.txtSpalsh.startAnimation(merge_scale_rotate())
        binding.imgSplash.startAnimation(merge_scale_rotate())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
//    lateinit var binding :ActivitySplashBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivitySplashBinding.inflate(layoutInflater)
//        setContentView(binding.root)
////        binding.txtSplash.startAnimation(alphaAnimation())
////        merge_scale_rotate()
//        binding.txtSpalsh.startAnimation(merge_scale_rotate())
//        binding.imgSplash.startAnimation(merge_scale_rotate())
//    }
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.activity_splash,container,false)
//        return view
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//    }

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
    private fun merge_scale_rotate():AnimationSet{
        val animSet = AnimationSet(true)
        animSet.addAnimation(rotateAnimation())
        animSet.addAnimation(scaleAnimation())
        animSet.duration = 800
        animSet.fillAfter = true
        return animSet
    }





}