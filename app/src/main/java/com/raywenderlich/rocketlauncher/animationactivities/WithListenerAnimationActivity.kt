package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.Toast

//option: Animation events
class WithListenerAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        val animator = ValueAnimator.ofFloat(0f, -screenHeight)

        animator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.translationY = value
            doge.translationY = value
        }

        animator.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {
                Toast.makeText(applicationContext, "Animation Start", Toast.LENGTH_SHORT).show()
            }

            override fun onAnimationEnd(p0: Animator?) {
                Toast.makeText(applicationContext, "Animation Ends", Toast.LENGTH_SHORT).show()
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {}

            override fun onAnimationRepeat(animation: Animator) {}
        })

        animator.duration = 5000L
        animator.start()

        /**
         * Chamando os listeners de animações a partir da propriedade da view
         */
        /*
        rocket.animate().setListener(object : Animator.AnimatorListener {
            // Your action
        })
        */
    }
}
