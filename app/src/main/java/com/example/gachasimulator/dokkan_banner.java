package com.example.gachasimulator;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class dokkan_banner implements View.OnClickListener {
    int image;
    String name;
    ImageView[] unitSlots = dokkan_summon.getUnitSlots();
    Card[] featured, unfeatured;
    private static ArrayList<Card> DOKKANFESTPOOL = null;
    private static final ArrayList<Card> SUMMONABLELRPOOL = null;
    private static final ArrayList<Card> NORMALPOOL = new ArrayList<Card>(Arrays.asList(new Card(R.drawable.Thum_1000010_1, 1000010), new Card(R.drawable.Thum_1000020_1, 1000020), new Card(R.drawable.Thum_1000840_1, 1000840),
            new Card(R.drawable.Thum_1001390_1, 1001390), new Card(R.drawable.Thum_1001400_1, 1001400), new Card(R.drawable.Thum_1001480_1, 1001480),
            new Card(R.drawable.Thum_1001490_1, 1001490), new Card(R.drawable.Thum_1001590_1, 1001590), new Card(R.drawable.Thum_1001630_1, 1001630),
            new Card(R.drawable.Thum_1001690_1, 1001690), new Card(R.drawable.Thum_1001700_1, 1001700), new Card(R.drawable.Thum_1001790_1, 1001790),
            new Card(R.drawable.Thum_1001800_1, 1001800), new Card(R.drawable.Thum_1001920_1, 1001920), new Card(R.drawable.Thum_1001930_1, 1001930),
            new Card(R.drawable.Thum_1001940_1, 1001940), new Card(R.drawable.Thum_1001950_1, 1001950), new Card(R.drawable.Thum_1001960_1, 1001960),
            new Card(R.drawable.Thum_1001970_1, 1001970), new Card(R.drawable.Thum_1002020_1, 1002020), new Card(R.drawable.Thum_1002080_1, 1002080),
            new Card(R.drawable.Thum_1002090_1, 1002090), new Card(R.drawable.Thum_1002100_1, 1002100), new Card(R.drawable.Thum_1002390_1, 1002390),
            new Card(R.drawable.Thum_1002400_1, 1002400), new Card(R.drawable.Thum_1002450_1, 1002450), new Card(R.drawable.Thum_1002460_1, 1002460),
            new Card(R.drawable.card_1002620, 1002620), new Card(R.drawable.card_1002670, 1002670), new Card(R.drawable.Thum_1002700_1, 1002700), new Card(R.drawable.Thum_1002810, 1002810),
            new Card(R.drawable.card_1002820, 1002820), new Card(R.drawable.card_1002830, 1002830), new Card(R.drawable.Thum_1002990_1, 1002990), new Card(R.drawable.Thum_1003020_1, 1003020), new Card(R.drawable.Thum_1003030_1, 1003030),
            new Card(R.drawable.Thum_1003040, 1003040), new Card(R.drawable.Thum_1003180_1, 1003180), new Card(R.drawable.Thum_1003190_1, 1003190), new Card(R.drawable.Thum_1003200_1, 1003200),
            new Card(R.drawable.Thum_1003230_1, 1003230), new Card(R.drawable.Thum_1003240_1, 1003240), new Card(R.drawable.Thum_1003260_1, 1003260), new Card(R.drawable.Thum_1003270_1, 1003270),
            new Card(R.drawable.Thum_1003290_1, 1003290), new Card(R.drawable.Thum_1003360_1, 1003360), new Card(R.drawable.Thum_1003370_1, 1003370), new Card(R.drawable.Thum_1003600_1, 1003600),
            new Card(R.drawable.Thum_1003610_1, 1003610), new Card(R.drawable.Thum_1003660_1, 1003660), new Card(R.drawable.Thum_1003670_1, 1003670), new Card(R.drawable.Thum_1003690_1, 1003690), new Card(R.drawable.Thum_1003720_1, 1003720), new Card(R.drawable.Thum_1003780_1, 1003780),
            new Card(R.drawable.Thum_1003790_1, 1003790), new Card(R.drawable.Thum_1004000_1, 1004000), new Card(R.drawable.Thum_1004070_1, 1004070), new Card(R.drawable.Thum_1004080_1, 1004080), new Card(R.drawable.Thum_1004090_1, 1004090),
            new Card(R.drawable.Thum_1004210_1, 1004210), new Card(R.drawable.Thum_1004340_1, 1004340), new Card(R.drawable.Thum_1004350_1, 1004350), new Card(R.drawable.Thum_1004360_1, 1004360),
            new Card(R.drawable.Thum_1004370_1, 1004370), new Card(R.drawable.Thum_1004380_1, 1004380), new Card(R.drawable.card_1004480, 1004480), new Card(R.drawable.Thum_1004600_1, 1004600),
            new Card(R.drawable.Thum_1004710_1, 1004710), new Card(R.drawable.Thum_1004720_1, 1004720), new Card(R.drawable.Thum_1004910_1, 1004910), new Card(R.drawable.Thum_1004940_1, 1004940), new Card(R.drawable.Thum_1004980_1, 1004980),
            new Card(R.drawable.Thum_1004990_1, 1004990), new Card(R.drawable.card_1005140, 1005140), new Card(R.drawable.Thum_1005150, 1005150), new Card(R.drawable.card_1005190, 1005190), new Card(R.drawable.card_1005210, 1005210),
            new Card(R.drawable.Thum_1005220_1, 1005220), new Card(R.drawable.Thum_1005260_1, 1005260), new Card(R.drawable.card_1005340, 1005340), new Card(R.drawable.Thum_1005350, 1005350), new Card(R.drawable.Thum_1005410_1, 1005410),
            new Card(R.drawable.Thum_1005640_1, 1005640), new Card(R.drawable.Thum_1005780_1, 1005780), new Card(R.drawable.Thum_1005940_1, 1005940), new Card(R.drawable.Thum_1006030, 1006030), new Card(R.drawable.Thum_1006360, 1006360),
            new Card(R.drawable.Thumb_1006480, 1006480), new Card(R.drawable.Thumb_1006490, 1006490), new Card(R.drawable.Thumb_1006500, 1006500), new Card(R.drawable.card_1006510, 1006510), new Card(R.drawable.Thum_1006710, 1006710),
            new Card(R.drawable.Thum_1006750, 1006750), new Card(R.drawable.Card_1006760_thumb, 1006750), new Card(R.drawable.card_1006780, 1006780), new Card(R.drawable.card_1007010, 1007010), new Card(R.drawable.card_1007090, 1007090),
            new Card(R.drawable.card_1007370, 1007370), new Card(R.drawable.card_1007380, 1007380), new Card(R.drawable.card_1007780, 1007780), new Card(R.drawable.Card_1007860_thumb, 1007860), new Card(R.drawable.card_1007880, 1007880),
            new Card(R.drawable.card_1007890, 1007890), new Card(R.drawable.Thum_1007920, 1007920), new Card(R.drawable.Thum_1008140, 1008140), new Card(R.drawable.card_1008340, 1008340), new Card(R.drawable.Thum_1008650, 1008650),
            new Card(R.drawable.card_1008660, 1008660), new Card(R.drawable.Thum_1008670, 1008670), new Card(R.drawable.card_1008680, 1008680), new Card(R.drawable.Thum_1008690, 1008690), new Card(R.drawable.card_1008700, 1008700),
            new Card(R.drawable.Thum_1008720, 1008720), new Card(R.drawable.Thum_1008760, 1008760), new Card(R.drawable.Thum_1008860, 1008860), new Card(R.drawable.Thum_1008880, 1008880), new Card(R.drawable.Thum_1009160, 1009160),
            new Card(R.drawable.Thum_1009530, 1009530), new Card(R.drawable.card_1009540, 1009540), new Card(R.drawable.card_1009760, 1009760), new Card(R.drawable.Thum_1009990, 1009990),
            new Card(R.drawable.Thum_1010010, 1010010), new Card(R.drawable.Thum_1010090, 1010090), new Card(R.drawable.Thum_1010100, 1010100), new Card(R.drawable.Thum_1010110, 1010110),
            new Card(R.drawable.Thum_1010120, 1010120), new Card(R.drawable.Thum_1010130, 1010130), new Card(R.drawable.Thum_1010140, 1010140), new Card(R.drawable.Thum_1010280, 1010280), new Card(R.drawable.card_1010540, 1010540),
            new Card(R.drawable.card_1010550, 1010550), new Card(R.drawable.card_1010630, 1010630), new Card(R.drawable.card_1010670, 1010670), new Card(R.drawable.card_1010680, 1010680), new Card(R.drawable.card_1010690, 1010690),
            new Card(R.drawable.card_1011580, 1011580), new Card(R.drawable.card_1011590, 1011590), new Card(R.drawable.card_1011750, 1011750), new Card(R.drawable.card_1011760, 1011760),
            new Card(R.drawable.Card_1011820_thumb, 1011820), new Card(R.drawable.card_1011830, 1011830), new Card(R.drawable.card_1011940, 1011940), new Card(R.drawable.card_1011950, 1011950),
            new Card(R.drawable.card_1011990, 1011990), new Card(R.drawable.Thum_1012040, 1012040), new Card(R.drawable.Thumb_1012060, 1012060), new Card(R.drawable.Card_1012070_thumb, 1012070), new Card(R.drawable.Thumb_1012090, 1012090),
            );
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
