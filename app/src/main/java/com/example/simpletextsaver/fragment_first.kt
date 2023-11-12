package com.example.simpletextsaver

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import androidx.fragment.app.Fragment
import com.example.simpletextsaver.databinding.ActivitySplashBinding


class fragment_first : Fragment() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtSpalsh.startAnimation(merge_scale_rotate())
        binding.imgSplash.startAnimation(merge_scale_rotate())
//        findNavController()
//            .navigate(R.id.action_splash_to_register)
    }

    private fun alphaAnimation(): AlphaAnimation {//transparency
        val anim = AlphaAnimation(0f,1f)
        anim.duration = 800
        anim.fillAfter = true
        anim.repeatMode = Animation.REVERSE
        return anim
    }private fun rotateAnimation(): RotateAnimation {
        val anim = RotateAnimation(0f,360f,
            Animation.RELATIVE_TO_SELF,0.5F,
            Animation.RELATIVE_TO_SELF,0.5f)
//            anim.duration = 800
//            anim.fillAfter = true
        return anim
    }
    private fun scaleAnimation(): ScaleAnimation {
        val anim = ScaleAnimation(
            0f, 1f, 0f, 1f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )
//        anim.duration = 800
//        anim.fillAfter = true
        return anim
    }
    private fun merge_scale_rotate(): AnimationSet {
        val animSet = AnimationSet(true)
        animSet.addAnimation(rotateAnimation())
        animSet.addAnimation(scaleAnimation())
        animSet.duration = 800
        animSet.fillAfter = true
        return animSet
    }

}