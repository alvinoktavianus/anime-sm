package com.dhammananda.animesm.modules;

import com.dhammananda.animesm.enums.Genre;
import com.dhammananda.animesm.models.Fanbase;
import com.dhammananda.animesm.models.Member;
import com.dhammananda.animesm.models.User;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {

    @Provides
    @Singleton
    List<User> providesUsersDB() {
        return new ArrayList<>();
    }

    @Provides
    @Singleton
    List<Fanbase> providesFanbaseDB() {
        List<Fanbase> fanbases = new ArrayList<>();
        Fanbase fanbase = new Fanbase();

        fanbase.setAnimeId(1);
        fanbase.setName("Darling in the Franxx");
        fanbase.setSynopsis("In the distant future, humanity has been driven to near-extinction by giant beasts known as Klaxosaurs, forcing the surviving humans to take refuge in massive fortress cities called Plantations. Children raised here are trained to pilot giant mechas known as FranXX—the only weapons known to be effective against the Klaxosaurs—in boy-girl pairs. Bred for the sole purpose of piloting these machines, these children know nothing of the outside world and are only able to prove their existence by defending their race.");
        List<Genre> genres = new ArrayList<>();
        genres.add(Genre.FANTASY);
        fanbase.setGenres(genres);
        fanbase.setRating(7.59);
        fanbase.setLatitude(-2.108006);
        fanbase.setLongitude(106.1675777);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(2);
        fanbase.setName("Yahari Ore no Seishun Love Comedy wa Machigatteiru");
        fanbase.setSynopsis("Hachiman Hikigaya is an apathetic high school student with narcissistic and semi-nihilistic tendencies. He firmly believes that joyful youth is nothing but a farce, and everyone who says otherwise is just lying to themselves");
        genres = new ArrayList<>();
        genres.add(Genre.COMEDY);
        fanbase.setGenres(genres);
        fanbase.setRating(8.10);
        fanbase.setLatitude(-6.1753871);
        fanbase.setLongitude(106.8249641);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(2);
        fanbase.setName("Fullmetal Alchemist: Brotherhood");
        fanbase.setSynopsis("Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist");
        genres = new ArrayList<>();
        genres.add(Genre.ACTION);
        genres.add(Genre.COMEDY);
        fanbase.setGenres(genres);
        fanbase.setRating(7.81);
        fanbase.setLatitude(13.4124693);
        fanbase.setLongitude(103.864797);
        fanbases.add(fanbase);

        return fanbases;
    }

    @Provides
    @Singleton
    List<Member> providesMemberDB() {
        return new ArrayList<>();
    }

}
