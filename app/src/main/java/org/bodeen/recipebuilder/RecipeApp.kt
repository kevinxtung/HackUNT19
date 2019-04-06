package org.bodeen.recipebuilder

import android.app.Application
import timber.log.Timber

class RecipeApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            // Release logging
        }
    }
}