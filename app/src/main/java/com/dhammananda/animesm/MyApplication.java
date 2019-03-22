package com.dhammananda.animesm;

import android.app.Application;

import com.dhammananda.animesm.modules.ApplicationModule;
import com.dhammananda.animesm.modules.DatabaseModule;
import com.dhammananda.animesm.modules.RepositoryModule;

import timber.log.Timber;

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .databaseModule(new DatabaseModule())
                .repositoryModule(new RepositoryModule())
                .build();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
