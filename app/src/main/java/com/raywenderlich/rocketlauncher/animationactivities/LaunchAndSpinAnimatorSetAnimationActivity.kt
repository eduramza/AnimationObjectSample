package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator

//option: Launch and spin (AnimatorSet)
class LaunchAndSpinAnimatorSetAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        val positionAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

        positionAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }

        val rotationAnimator = ObjectAnimator.ofFloat(rocket, "rotation", 0f, 180f)

        //configurando o cenário das animações
        val animatorSet = AnimatorSet()
        animatorSet.play(positionAnimator).with(rotationAnimator)

        animatorSet.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION
        animatorSet.start()

    }
}
