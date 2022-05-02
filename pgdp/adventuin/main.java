package pgdp.adventuin;

import pgdp.color.RgbColor;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {


        Adventuin AdvenTuin1 = new Adventuin ("AdvenTuin1", 100, new RgbColor(3, 2, 7, 5), HatType.FISHY_HAT, Language.ENGLISH);

        Adventuin AdvenTuin2 = new Adventuin ("AdvenTuin2", 120, new RgbColor(5, 2, 7, 4), HatType.FISHY_HAT, Language.ENGLISH);


        Adventuin AdvenTuin3 = new Adventuin ("AdvenTuin3", 100, new RgbColor(3, 2, 7, 3), HatType.FISHY_HAT, Language.GERMAN);

        Adventuin AdvenTuin4 = new Adventuin ("AdvenTuin4", 110, new RgbColor(3, 2, 7, 2), HatType.FISHY_HAT, Language.GERMAN);

        Adventuin AdvenTuin5 = new Adventuin ("AsadasvenTux5", 138, new RgbColor(3, 2, 7, 1), HatType.SANTA_CLAUS, Language.GEORGIAN);

        Adventuin AdvenTuin6 = new Adventuin ("AsadasvenTux6", 138, new RgbColor(3, 2, 7, 1), HatType.SANTA_CLAUS, Language.GEORGIAN);

        Adventuin AdvenTuin7 = new Adventuin ("AsadasvenTux7", 138, new RgbColor(3, 2, 7, 1), HatType.SANTA_CLAUS, Language.GEORGIAN);

        System.out.println(
                AdvenTuin1.getLanguage().getLocalizedChristmasGreeting("dato"));
//
//        System.out.println(dato.getLanguage());
//
//        System.out.println(HatType.REINDEER);

        List<Adventuin> list = new LinkedList<>();

        list.add(AdvenTuin4);
        list.add(AdvenTuin3);
        list.add(AdvenTuin1);
        list.add(AdvenTuin2);
        list.add(AdvenTuin5);
        list.add(AdvenTuin6);
        list.add(AdvenTuin7);



//
//        System.out.println(AdventuinParty.groupByHatType(kaka));
//
//        System.out.println();
//
//
//        AdventuinParty.printLocalizedChristmasGreetings(kaka);
//        System.out.println();
//
//
//        System.out.println(AdventuinParty.getAdventuinsWithLongestNamesByHatType(kaka));
        System.out.println("Brightness");

        System.out.println(AdventuinParty.getAverageColorBrightnessByHeight(list));
        System.out.println();

//        System.out.println(AdventuinParty.getDiffOfAvgHeightDiffsToPredecessorByHatType(kaka));
//        System.out.println();


    }
}
