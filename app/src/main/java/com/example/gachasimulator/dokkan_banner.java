package com.example.gachasimulator;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class dokkan_banner implements View.OnClickListener {
    int image;
    String name;
    ImageView[] unitSlots = dokkan_summon.getUnitSlots();
    ArrayList<Card> featured, unfeatured;
    private static final ArrayList<Card> NORMALPOOL = new ArrayList<>(Arrays.asList(new Card(R.drawable.thum_1000010_1, 1000010), new Card(R.drawable.thum_1000020_1, 1000020), new Card(R.drawable.thum_1000840_1, 1000840),
            new Card(R.drawable.thum_1001390_1, 1001390), new Card(R.drawable.thum_1001400_1, 1001400), new Card(R.drawable.thum_1001480_1, 1001480),
            new Card(R.drawable.thum_1001490_1, 1001490), new Card(R.drawable.thum_1001590_1, 1001590), new Card(R.drawable.thum_1001630_1, 1001630),
            new Card(R.drawable.thum_1001690_1, 1001690), new Card(R.drawable.thum_1001700_1, 1001700), new Card(R.drawable.thum_1001790_1, 1001790),
            new Card(R.drawable.thum_1001800_1, 1001800), new Card(R.drawable.thum_1001920_1, 1001920), new Card(R.drawable.thum_1001930_1, 1001930),
            new Card(R.drawable.thum_1001940_1, 1001940), new Card(R.drawable.thum_1001950_1, 1001950), new Card(R.drawable.thum_1001960_1, 1001960),
            new Card(R.drawable.thum_1001970_1, 1001970), new Card(R.drawable.thum_1002020_1, 1002020), new Card(R.drawable.thum_1002080_1, 1002080),
            new Card(R.drawable.thum_1002090_1, 1002090), new Card(R.drawable.thum_1002100_1, 1002100), new Card(R.drawable.thum_1002390_1, 1002390),
            new Card(R.drawable.thum_1002400_1, 1002400), new Card(R.drawable.thum_1002450_1, 1002450), new Card(R.drawable.thum_1002460_1, 1002460),
            new Card(R.drawable.card_1002620, 1002620), new Card(R.drawable.card_1002670, 1002670), new Card(R.drawable.thum_1002700_1, 1002700), new Card(R.drawable.thum_1002810, 1002810),
            new Card(R.drawable.card_1002820, 1002820), new Card(R.drawable.card_1002830, 1002830), new Card(R.drawable.thum_1002990_1, 1002990), new Card(R.drawable.thum_1003020_1, 1003020), new Card(R.drawable.thum_1003030_1, 1003030),
            new Card(R.drawable.thum_1003040, 1003040), new Card(R.drawable.thum_1003180_1, 1003180), new Card(R.drawable.thum_1003190_1, 1003190), new Card(R.drawable.thum_1003200_1, 1003200),
            new Card(R.drawable.thum_1003230_1, 1003230), new Card(R.drawable.thum_1003240_1, 1003240), new Card(R.drawable.thum_1003260_1, 1003260), new Card(R.drawable.thum_1003270_1, 1003270),
            new Card(R.drawable.thum_1003290_1, 1003290), new Card(R.drawable.thum_1003360_1, 1003360), new Card(R.drawable.thum_1003370_1, 1003370), new Card(R.drawable.thum_1003600_1, 1003600),
            new Card(R.drawable.thum_1003610_1, 1003610), new Card(R.drawable.thum_1003660_1, 1003660), new Card(R.drawable.thum_1003670_1, 1003670), new Card(R.drawable.thum_1003690_1, 1003690), new Card(R.drawable.thum_1003720_1, 1003720), new Card(R.drawable.thum_1003780_1, 1003780),
            new Card(R.drawable.thum_1003790_1, 1003790), new Card(R.drawable.thum_1004000_1, 1004000), new Card(R.drawable.thum_1004070_1, 1004070), new Card(R.drawable.thum_1004080_1, 1004080), new Card(R.drawable.thum_1004090_1, 1004090),
            new Card(R.drawable.thum_1004210_1, 1004210), new Card(R.drawable.thum_1004340_1, 1004340), new Card(R.drawable.thum_1004350_1, 1004350), new Card(R.drawable.thum_1004360_1, 1004360),
            new Card(R.drawable.thum_1004370_1, 1004370), new Card(R.drawable.thum_1004380_1, 1004380), new Card(R.drawable.card_1004480, 1004480), new Card(R.drawable.thum_1004600_1, 1004600),
            new Card(R.drawable.thum_1004710_1, 1004710), new Card(R.drawable.thum_1004720_1, 1004720), new Card(R.drawable.thum_1004910_1, 1004910), new Card(R.drawable.thum_1004940_1, 1004940), new Card(R.drawable.thum_1004980_1, 1004980),
            new Card(R.drawable.thum_1004990_1, 1004990), new Card(R.drawable.card_1005140, 1005140), new Card(R.drawable.thum_1005150, 1005150), new Card(R.drawable.card_1005190, 1005190), new Card(R.drawable.card_1005210, 1005210),
            new Card(R.drawable.thum_1005220_1, 1005220), new Card(R.drawable.thum_1005260_1, 1005260), new Card(R.drawable.card_1005340, 1005340), new Card(R.drawable.thum_1005350, 1005350), new Card(R.drawable.thum_1005410_1, 1005410),
            new Card(R.drawable.thum_1005640_1, 1005640), new Card(R.drawable.thum_1005780_1, 1005780), new Card(R.drawable.thum_1005940_1, 1005940), new Card(R.drawable.thum_1006030, 1006030), new Card(R.drawable.thum_1006360, 1006360),
            new Card(R.drawable.thumb_1006480, 1006480), new Card(R.drawable.thumb_1006490, 1006490), new Card(R.drawable.thumb_1006500, 1006500), new Card(R.drawable.card_1006510, 1006510), new Card(R.drawable.thum_1006710, 1006710),
            new Card(R.drawable.thum_1006750, 1006750), new Card(R.drawable.card_1006760_thumb, 1006750), new Card(R.drawable.card_1006780, 1006780), new Card(R.drawable.card_1007010, 1007010), new Card(R.drawable.card_1007090, 1007090),
            new Card(R.drawable.card_1007370, 1007370), new Card(R.drawable.card_1007380, 1007380), new Card(R.drawable.card_1007780, 1007780), new Card(R.drawable.card_1007860_thumb, 1007860), new Card(R.drawable.card_1007880, 1007880),
            new Card(R.drawable.card_1007890, 1007890), new Card(R.drawable.thum_1007920, 1007920), new Card(R.drawable.thum_1008140, 1008140), new Card(R.drawable.card_1008340, 1008340), new Card(R.drawable.thum_1008650, 1008650),
            new Card(R.drawable.card_1008660, 1008660), new Card(R.drawable.thum_1008670, 1008670), new Card(R.drawable.card_1008680, 1008680), new Card(R.drawable.thum_1008690, 1008690), new Card(R.drawable.card_1008700, 1008700),
            new Card(R.drawable.thum_1008720, 1008720), new Card(R.drawable.thum_1008760, 1008760), new Card(R.drawable.thum_1008860, 1008860), new Card(R.drawable.thum_1008880, 1008880), new Card(R.drawable.thum_1009160, 1009160),
            new Card(R.drawable.thum_1009530, 1009530), new Card(R.drawable.card_1009540, 1009540), new Card(R.drawable.card_1009760, 1009760), new Card(R.drawable.thum_1009990, 1009990),
            new Card(R.drawable.thum_1010010, 1010010), new Card(R.drawable.thum_1010090, 1010090), new Card(R.drawable.thum_1010100, 1010100), new Card(R.drawable.thum_1010110, 1010110),
            new Card(R.drawable.thum_1010120, 1010120), new Card(R.drawable.thum_1010130, 1010130), new Card(R.drawable.thum_1010140, 1010140), new Card(R.drawable.thum_1010280, 1010280), new Card(R.drawable.card_1010540, 1010540),
            new Card(R.drawable.card_1010550, 1010550), new Card(R.drawable.card_1010630, 1010630), new Card(R.drawable.card_1010670, 1010670), new Card(R.drawable.card_1010680, 1010680), new Card(R.drawable.card_1010690, 1010690),
            new Card(R.drawable.card_1011580, 1011580), new Card(R.drawable.card_1011590, 1011590), new Card(R.drawable.card_1011750, 1011750), new Card(R.drawable.card_1011760, 1011760),
            new Card(R.drawable.card_1011820_thumb, 1011820), new Card(R.drawable.card_1011830, 1011830), new Card(R.drawable.card_1011940, 1011940), new Card(R.drawable.card_1011950, 1011950),
            new Card(R.drawable.card_1011990, 1011990), new Card(R.drawable.thum_1012040, 1012040), new Card(R.drawable.thumb_1012060, 1012060), new Card(R.drawable.card_1012070_thumb, 1012070), new Card(R.drawable.thumb_1012090, 1012090),
            new Card(R.drawable.card_1012300_thumb, 1012300), new Card(R.drawable.card_1012410_thumb, 1012410), new Card(R.drawable.thumb_1012610, 1012610), new Card(R.drawable.card_1012640, 1012640), new Card(R.drawable.card_1012670, 1012670),
            new Card(R.drawable.card_1012690, 1012690), new Card(R.drawable.card_1012860_thumb, 1012860), new Card(R.drawable.card_1012950, 1012950), new Card(R.drawable.card_1012980, 1012980), new Card(R.drawable.thumb_1013170, 1013170), new Card(R.drawable.thumb_1013180, 1013180),
            new Card(R.drawable.thumb_1013190, 1012190), new Card(R.drawable.thumb_1013200, 1013200), new Card(R.drawable.thumb_1013700, 1013700), new Card(R.drawable.thumb_1013920, 1013920), new Card(R.drawable.thumb_1013930, 1013930),
            new Card(R.drawable.card_1014200_thumb, 1014200), new Card(R.drawable.card_1014320, 1014320), new Card(R.drawable.card_1014340, 1014340), new Card(R.drawable.thumb_1014360, 1014360), new Card(R.drawable.thumb_1014380, 1014380),
            new Card(R.drawable.card_1014480, 1014480), new Card(R.drawable.thumb_1014650, 1014650), new Card(R.drawable.thumb_1014730, 1014730), new Card(R.drawable.card_1015090_thumb, 1015090), new Card(R.drawable.card_1015190_thumb, 1015190),
            new Card(R.drawable.card_1015280_thumb, 1015280), new Card(R.drawable.card_1015300_thumb, 1015300), new Card(R.drawable.card_1015780_thumb, 1015780), new Card(R.drawable.card_1015800_thumb, 1015800), new Card(R.drawable.card_1016020_thumb, 1016020),
            new Card(R.drawable.card_1016040_thumb, 1016040), new Card(R.drawable.card_1016060_thumb, 1016060), new Card(R.drawable.card_1016070int_thumb, 1016070), new Card(R.drawable.card_1016240_thumb, 1016240), new Card(R.drawable.card_1016260_thumb, 1016260),
            new Card(R.drawable.card_1016270_thumb, 1016270), new Card(R.drawable.card_1016620_thumb, 1016620), new Card(R.drawable.card_1016640_thumb, 1016640), new Card(R.drawable.card_1016890_thumb, 1016890), new Card(R.drawable.card_1017010_thumb, 1017010),
            new Card(R.drawable.card_1017210_thumb, 1017210), new Card(R.drawable.card_1017460_thumb, 1017460), new Card(R.drawable.card_1017560_thumb, 1017560), new Card(R.drawable.card_1017580_thumb, 1017580), new Card(R.drawable.card_1017690_thumb, 1017690),
            new Card(R.drawable.card_1018050_thumb, 1018050), new Card(R.drawable.card_1018090_thumb, 1018090), new Card(R.drawable.card_1018140_thumb, 1018140), new Card(R.drawable.card_1018570_thumb, 1018570), new Card(R.drawable.card_1018670_thumb, 1018670),
            new Card(R.drawable.card_1019030_thumb, 1019030), new Card(R.drawable.card_1019270_thumb, 1019270), new Card(R.drawable.card_1019290_thumb, 1019290), new Card(R.drawable.card_1019350_thumb, 1019350), new Card(R.drawable.card_1019830_thumb, 1019830),
            new Card(R.drawable.thum_2000170_1, 2000170), new Card(R.drawable.thum_2000230_1, 2000230), new Card(R.drawable.thum_2000240_1, 2000240), new Card(R.drawable.thum_2000250_1, 2000250)));

    private static ArrayList<Card> DOKKANFESTPOOL = new ArrayList<>(Arrays.asList(new Card(R.drawable.thum_1002800_1, 1002800), new Card(R.drawable.card_1003070, 1003070), new Card(R.drawable.thum_1003240_1, 1003240)));
    private static final ArrayList<Card> SUMMONABLELRPOOL = null;

    public dokkan_banner(int bannerImage, ArrayList<Card> featuredPool, ArrayList<Card> unfeaturedPool, String name) {
        image = bannerImage;
        featured = featuredPool;
        unfeatured = unfeaturedPool;
        this.name = name;
    }

    public ArrayList<Card> customizePool(int[] removeID, int[] addID, ArrayList<Card> pool) {
        boolean contains;
        ArrayList<Card> v = pool;
        for (int i = 0; i < removeID.length; i++) {
            for (Card card : v) {
                if (removeID[i] == card.getCardID()) {
                    v.remove(card);
                    break;
                }
            }
        }
        for (int i = 0; i < addID.length; i++) {
            Card temp = null;
            contains = false;
            for (Card card : v) {
                if (card.getCardID() == addID[i]) {
                    contains = true;
                    break;
                }
                temp = card;
            }
            if (contains == false)
                v.add(temp);
        }
        return v;
    }
    @Override
    public void onClick(View view) {

    }
}
