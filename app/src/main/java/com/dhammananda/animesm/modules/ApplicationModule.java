package com.dhammananda.animesm.modules;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.dhammananda.animesm.BuildConfig;
import com.dhammananda.animesm.helper.ValidationHelper;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    @Named("isDebug")
    boolean providesIsDebug() {
        return BuildConfig.DEBUG;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedPreference(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    ValidationHelper providesValidationHelper() {
        return new ValidationHelper();
    }

}
