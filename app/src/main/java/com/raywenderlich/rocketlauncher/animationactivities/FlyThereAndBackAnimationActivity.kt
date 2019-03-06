package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator

//option: Fly there and back (Animation options)
class FlyThereAndBackAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)

        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        animator.repeatMode = ValueAnimator.REVERSE
        animator.repeatCount = 3

        animator.duration = 2000L
        animator.start()
    }
}
