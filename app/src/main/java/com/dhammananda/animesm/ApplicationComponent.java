package com.dhammananda.animesm;

import com.dhammananda.animesm.modules.ApplicationModule;
import com.dhammananda.animesm.modules.DatabaseModule;
import com.dhammananda.animesm.modules.RepositoryModule;
import com.dhammananda.animesm.ui.MainActivity;
import com.dhammananda.animesm.ui.LoginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, DatabaseModule.class, RepositoryModule.class})
public interface ApplicationComponent {

    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);

}
