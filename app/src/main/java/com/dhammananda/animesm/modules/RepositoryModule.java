package com.dhammananda.animesm.modules;

import com.dhammananda.animesm.models.Fanbase;
import com.dhammananda.animesm.models.Member;
import com.dhammananda.animesm.models.User;
import com.dhammananda.animesm.repositories.FanbaseRepository;
import com.dhammananda.animesm.repositories.MemberRepository;
import com.dhammananda.animesm.repositories.UserRepository;

import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {

    @Provides
    @Singleton
    UserRepository providesUserRepository(List<User> users) {
        return new UserRepository(users);
    }

    @Provides
    @Singleton
    FanbaseRepository providesFanbaseRepository(List<Fanbase> fanbases) {
        return new FanbaseRepository(fanbases);
    }

    @Provides
    @Singleton
    MemberRepository providesMemberRepository(List<Member> members) {
        return new MemberRepository(members);
    }

}
