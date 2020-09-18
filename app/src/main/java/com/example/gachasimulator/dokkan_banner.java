package com.example.gachasimulator;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class dokkan_banner implements View.OnClickListener{
    int image;
    String name;
    ImageView[] unitSlots = dokkan_summon.getUnitSlots();
    Card[] featured, unfeatured;
    public static ArrayList<Card> DOKKANFESTPOOL = null;
    public static final ArrayList<Card> SUMMONABLELRPOOL = null;
    public static final ArrayList<Card> NORMALPOOL = new ArrayList<Card>(Arrays.asList(new Card(R.drawable.Thum_1000010_1,1000010), new Card(R.drawable.Thum_1000020_1,1000020),new Card(R.drawable.Thum_1000840_1,1000840),
            new Card(R.drawable.Thum_1001390_1,1001390),new Card(R.drawable.Thum_1001400_1,1001400),new Card(R.drawable.Thum_1001480_1,1001480),
            new Card(R.drawable.Thum_1001490_1,1001490), new Card(R.drawable.Thum_1001590_1,1001590), new Card(R.drawable.Thum_1001630_1,1001630),
            new Card(R.drawable.Thum_1001690_1,1001690), new Card(R.drawable.Thum_1001700_1, 1001700), new Card(R.drawable.Thum_1001790_1,1001790),
            new Card(R.drawable.Thum_1001800_1,1001800),new Card(R.drawable.Thum_1001920_1,1001920), new Card(R.drawable.Thum_1001930_1,1001930),
            new Card(R.drawable.Thum_1001940_1,1001940), new Card(R.drawable.Thum_1001950_1,1001950), new Card(R.drawable.Thum_1001960_1,1001960),
            new Card(R.drawable.Thum_1001970_1, 1001970), new Card(R.drawable.Thum_1002020_1,1002020), new Card(R.drawable.Thum_1002080_1, 1002080),
            new Card(R.drawable.Thum_1002090_1, 1002090), new Card(R.drawable.Thum_1002100_1,1002100), new Card(R.drawable.Thum_1002390_1, 1002390),
            new Card(R.drawable.Thum_1002400_1, 1002400), new Card(R.drawable.Thum_1002450_1,1002450), new Card(R.drawable.Thum_1002460_1, 1002460),
            new Card(R.drawable.card_1002620,1002620), new Card(R.drawable.card_1002670,1002670), new Card(R.drawable.Thum_1002700_1,1002700), new Card(R.drawable.Thum_1002810, 1002810),
            new Card(R.drawable.card_1002820,1002820), new Card(R.drawable.card_1002830,1002830)));
    public dokkan_banner(int bannerImage, Card[] featuredPool, Card[] unfeaturedPool, String name)
    {
        image = bannerImage;
        featured = featuredPool;
        unfeatured = unfeaturedPool;
        this.name = name;
    }
    public Card findCardById(int id, int pool)
    {
        if(pool == 0) {
            for (Card card : NORMALPOOL) {
                if (card.getCardID() == id)
                    return card;
            }
        }
        else if (pool == 1)
        {

        }
        else
        {

        }
        return null;
    }

    @Override
    public void onClick(View view) {

    }
}
