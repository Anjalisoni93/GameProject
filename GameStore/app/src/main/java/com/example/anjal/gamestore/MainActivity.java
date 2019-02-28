package com.example.anjal.gamestore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    GamesAdapter gamesAdapter;
    private List<GameTitle> gameTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView = findViewById(R.id.recyclerview);

        gameTitles = ImageList();

        gamesAdapter = new GamesAdapter(gameTitles, getApplication());

        LinearLayoutManager layout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        mrecyclerView.setLayoutManager(layout);
        mrecyclerView.setAdapter(gamesAdapter);


    }

    public List<GameTitle> ImageList() {

        List<GameTitle> games = new ArrayList<>();

        games.add(new GameTitle(R.drawable.bubsy, "Bubsy : The Wollies Strike Back", "Adventure", "Our favorite Bobcat is making a triumphant " +
                "return 20 years after virtually disappearing from the world stage (N64/PS1). " +
                "Yes, that’s right, Bubsy is back and starring in an all new adventure, Bubsy: The Woolies Strike Back! " +
                "Yep, those no good, yarn stealing always annoying intergalactic trolls, the Woolies, are up to their no good ways once again! " +
                "They’ve stolen Bubsy’s most prized possession, the Golden Fleece. Now Bubsy is on a one Bobcat mission taking on Woolies, Bumble Bees, Sharks, " +
                "and UFO's to collect an insane amount of yarnballs and bring his Holy Grail of Wool home. \n" +
                "\n" + "2D, or not 2D? Bubsy thinks 3D is so 1998 that he’s going back to the 2D well with a huge assist with his good friends at Black Forrest for 14 rip roaring " +
                "levels of side scrolling action. " + "Watch Bubsy glide like Bat, jump like a jack rabbit, bounce like a red rubber ball and run…run Bubsy run. This is the Bubsy adventure you were born to play."
                , "https://www.gog.com/game/bubsythewooliesstrikeback"));
        games.add(new GameTitle(R.drawable.colonization, "Colonization", "Strategy", "Discover the New World and fulfill your Manifest Destiny! \n" +
                "\n" + "The New World lies before you with all its peril, promise, and infinite possibility: your colonists anxiously follow you to shore and the treasures of an entire continent await you. But beware of your enemies!" +
                " Angry natives and rival powers can encroach upon your territory. You'll have to overcome your foes with superior military strategy and wily diplomacy. Only then can you launch your revolution and declare your independence. \n" +
                "\n" + "Players control either English, French, Dutch, or Spanish colonists in the New World. This New World can be the historically accurate Americas (North and South) or a randomly generated world with varying resources and challenges. " +
                "Overseeing economic, military, and political growth, you strive to establish independence from the mother country while competing with other colonies for control of the New World. \n"
                , "https://www.gog.com/game/sid_meiers_colonization"));
        games.add(new GameTitle(R.drawable.deadlock, "Deadlock : Planetary Conquest", "Scifi", "Beneath you floats magnificent, untamed Gallius IV, a terran world newly discovered in this disputed part of the galaxy. Your colony ship is ready, " +
                "equipped with all the basics you need to settle this planet. The select group of colonists orbiting with you are prepared both to build a strong colony and to defend it to the last stone. Other ships are also scanning the planet's surface, choosing the " +
                "landing site for their colony. All past allegiances have been cast aside in the fever for this world. \n" +
                "\n" + "In Deadlock, an intense turn-based strategic simulation, seven races colonize a virgin planet, but only one will survive. Build your province’s structures. Conduct research to advance your race. Devise the perfect strategy of diplomacy, " +
                "intimidation and warfare. Every decision you make will determine the ultimate fate of your people, your empire, and your survival."
                ,"https://www.gog.com/game/deadlock_planetary_conquest"));
        games.add(new GameTitle(R.drawable.kim, "Kim", "Historical", "Kim is an open world RPG set in colonial India. Play as Rudyard Kipling's ragamuffin hero, Kim, and roam hand-painted towns and procedurally generated countryside. Learn to survive by " +
                "fair means or foul, meet characters from history and literature, travel to exotic lands and discover their secrets. Your aim is to live Kim's youth as best you can, it will not last forever but if at first you don't succeed, you may retell this classic adventure " +
                "as often as you wish." , "https://www.gog.com/game/kim"));
        games.add(new GameTitle(R.drawable.knights, "Knights Of The Sky", "Action", "Simulation of Aerial Combat and Gallantry in World War I.\n" +
                "\n" + "Flying north along the road from Lille to bust a German recon balloon. I wave to the foot boys in their muddy trenches. Poor devils. Oh, how they envy me! \n" +
                "\n" + "Off to the left! Can it be? The scoundrel in the red Fokker! My dear chum Bates signaled that his gun was jammed, but that greedy Hun downed him nonetheless. The Fokker is flying east. Homeward, low on petrol, " +
                "no doubt. The balloon can wait. This won't take long. \n" , "https://www.gog.com/game/knights_of_the_sky"));
        games.add(new GameTitle(R.drawable.pirates, "Pirates! Gold Plus", "Realtime-Historical", "Arrr matey! It’s a pirate’s life for me! \n" +
                "\n" + "Grab your parrot, your eye patch, and sail the Caribbean in search of adventure, treasure, beautiful maidens, or all of the above in Pirates! Gold Plus. With a letter of marque in your hand, you can fly the flag of France," +
                " the Dutch Republic, England, or Spain. " + "Change your loyalties as you see fit, all in the name of fame and profit. You won’t be sailing alone--your rough and ready crew comes along with you. Don’t forget to split the spoils with them or you may find that you're the one who's walking the plank. \n" +
                "\n" + "You begin with a letter of marque, a humble ship, and a bit of gold. As a privateer for either the Dutch Republic, France, England, or Spain you’ll hire your crew and set sail for treasure and adventure. Discover lost cities as you put together treasure maps acquired from seedy pubs " +
                "or rescue your long-lost family members. ", "https://www.gog.com/game/pirates_gold_plus"));

        return games;
    }

    public void ImageClick(View view) {

        Intent intent = new Intent(this, GameDescription.class);
        startActivity(intent);

    }
}
