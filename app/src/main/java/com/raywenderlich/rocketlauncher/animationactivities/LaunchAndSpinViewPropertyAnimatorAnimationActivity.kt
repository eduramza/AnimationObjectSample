package com.raywenderlich.rocketlauncher.animationactivities

//option: Launch and spin (ViewPropertyAnimator)
class LaunchAndSpinViewPropertyAnimatorAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        rocket.animate()
                .translationY(-screenHeight)
                .rotationBy(360f)
                .setDuration(BaseAnimationActivity.DEFAULT_ANIMATION_DURATION)
                .start()
    }
}
