package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator

//option: Accelerate a rocket
class AccelerateRocketAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)
        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
        }

        valueAnimator.interpolator = AccelerateInterpolator(2.5f)
        valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        valueAnimator.start()
    }
}
