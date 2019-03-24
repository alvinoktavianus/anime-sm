package com.dhammananda.animesm.repositories;

import com.dhammananda.animesm.enums.Genre;
import com.dhammananda.animesm.models.Fanbase;

import java.util.ArrayList;
import java.util.List;

public class FanbaseRepository {

    private List<Fanbase> fanbases;
    private static FanbaseRepository instance = null;

    private FanbaseRepository() {
        fanbases = new ArrayList<>();
        initData();
    }

    private void initData() {
        Fanbase fanbase = new Fanbase();

        fanbase.setAnimeId(fanbases.size() + 1);
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
        fanbase.setAnimeId(fanbases.size() + 1);
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
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Fullmetal Alchemist: Brotherhood");
        fanbase.setSynopsis("Alchemy is bound by this Law of Equivalent Exchange—something the young brothers Edward and Alphonse Elric only realize after attempting human transmutation: the one forbidden act of alchemy. They pay a terrible price for their transgression—Edward loses his left leg, Alphonse his physical body. It is only by the desperate sacrifice of Edward's right arm that he is able to affix Alphonse's soul to a suit of armor. Devastated and alone, it is the hope that they would both eventually return to their original bodies that gives Edward the inspiration to obtain metal limbs called \"automail\" and become a state alchemist, the Fullmetal Alchemist");
        genres = new ArrayList<>();
        genres.add(Genre.ACTION);
        genres.add(Genre.COMEDY);
        fanbase.setGenres(genres);
        fanbase.setRating(9.24);
        fanbase.setLatitude(48.8583729);
        fanbase.setLongitude(2.2933365);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Hai to Gensou no Grimgar");
        fanbase.setSynopsis("Fear, survival, instinct. Thrown into a foreign land with nothing but hazy memories and the knowledge of their name, they can feel only these three emotions resonating deep within their souls. A group of strangers is given no other choice than to accept the only paying job in this game-like world—the role of a soldier in the Reserve Army—and eliminate anything that threatens the peace in their new world, Grimgar.");
        genres = new ArrayList<>();
        genres.add(Genre.ACTION);
        genres.add(Genre.ADVENTURE);
        fanbase.setGenres(genres);
        fanbase.setRating(7.81);
        fanbase.setLatitude(13.4124693);
        fanbase.setLongitude(103.864797);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Hyouka");
        fanbase.setSynopsis("Energy-conservative high school student Houtarou Oreki ends up with more than he bargained for when he signs up for the Classics Club at his sister's behest—especially when he realizes how deep-rooted the club's history really is. Begrudgingly, Oreki is dragged into an investigation concerning the 45-year-old mystery that surrounds the club room.");
        genres = new ArrayList<>();
        genres.add(Genre.SCHOOL);
        fanbase.setGenres(genres);
        fanbase.setRating(8.15);
        fanbase.setLatitude(28.385233);
        fanbase.setLongitude(-81.5660627);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Boku dake ga Inai Machi");
        fanbase.setSynopsis("When tragedy is about to strike, Satoru Fujinuma finds himself sent back several minutes before the accident occurs. The detached, 29-year-old manga artist has taken advantage of this powerful yet mysterious phenomenon, which he calls \"Revival,\" to save many lives.");
        genres = new ArrayList<>();
        genres.add(Genre.MYSTERY);
        fanbase.setGenres(genres);
        fanbase.setRating(8.54);
        fanbase.setLatitude(-7.6078738);
        fanbase.setLongitude(110.2015626);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Death Note");
        fanbase.setSynopsis("A shinigami, as a god of death, can kill any person—provided they see their victim's face and write their victim's name in a notebook called a Death Note. One day, Ryuk, bored by the shinigami lifestyle and interested in seeing how a human would use a Death Note, drops one into the human realm.");
        genres = new ArrayList<>();
        genres.add(Genre.MYSTERY);
        fanbase.setGenres(genres);
        fanbase.setRating(8.66);
        fanbase.setLatitude(40.4319077);
        fanbase.setLongitude(116.5681862);
        fanbases.add(fanbase);

        fanbase = new Fanbase();
        fanbase.setAnimeId(fanbases.size() + 1);
        fanbase.setName("Mahoutsukai no Yome");
        fanbase.setSynopsis("Chise Hatori, a 15-year-old Japanese girl, was sold for five million pounds at an auction to a tall masked gentleman. Abandoned at a young age and ridiculed by her peers for her unconventional behavior, she was ready to give herself to any buyer if it meant having a place to go home to. In chains and on her way to an unknown fate, she hears whispers from robed men along her path, gossiping and complaining that such a buyer got his hands on a rare \"Sleigh Beggy.\"");
        genres = new ArrayList<>();
        genres.add(Genre.FANTASY);
        fanbase.setGenres(genres);
        fanbase.setRating(8.22);
        fanbase.setLatitude(27.1750151);
        fanbase.setLongitude(78.0399665);
        fanbases.add(fanbase);
    }

    public static FanbaseRepository getInstance() {
        if (instance == null) {
            instance = new FanbaseRepository();
            return instance;
        }
        return instance;
    }

    public List<Fanbase> findAll() {
        return fanbases;
    }

    public Fanbase findByAnimeId(Integer id) {
        for (Fanbase fanbase : fanbases) {
            if (fanbase.getAnimeId().equals(id)) {
                return fanbase;
            }
        }
        return null;
    }

}
