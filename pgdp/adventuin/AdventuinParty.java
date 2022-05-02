package pgdp.adventuin;


import java.util.*;
import java.util.stream.Collectors;

public final class AdventuinParty {


    public static Map<HatType, List<Adventuin>> groupByHatType(List<Adventuin> list) {
        return list.stream().collect(Collectors.groupingBy(Adventuin::getHatType)); //convert list to stream, then collect all objects and group them by hats
    }

    public static void printLocalizedChristmasGreetings(List<Adventuin> list) {
        list.stream().sorted(Comparator.comparing(Adventuin::getHeight)).forEach(p -> {     //convert list to stream, then sort by the comparator of height
            System.out.println(p.getLanguage().getLocalizedChristmasGreeting(p.getName())); //for each member of stream, write Christmas greeting
        });
    }

    public static Map<HatType, List<Adventuin>> getAdventuinsWithLongestNamesByHatType(List<Adventuin> list) {
        //initialize variables with minimal values

        int maxSanta = Integer.MIN_VALUE;
        int maxFish = Integer.MIN_VALUE;
        int maxReindeer = Integer.MIN_VALUE;
        int maxNone = Integer.MIN_VALUE;

        //convert list to stream and filter it for specific HatTypes and then find maximum length, using OptionalInt, if int is not null, then return integer
        OptionalInt maxSantaOpt = list.stream().filter(p -> p.getHatType() == HatType.SANTA_CLAUS).mapToInt(p -> p.getName().length()).max();
        if (maxSantaOpt.isPresent()) {
            maxSanta = maxSantaOpt.getAsInt();
        }
        OptionalInt maxFishOpt = list.stream().filter(p -> p.getHatType() == HatType.FISHY_HAT).mapToInt(p -> p.getName().length()).max();
        if (maxFishOpt.isPresent()) {
            maxFish = maxFishOpt.getAsInt();
        }
        OptionalInt maxReindeerOpt = list.stream().filter(p -> p.getHatType() == HatType.REINDEER).mapToInt(p -> p.getName().length()).max();
        if (maxReindeerOpt.isPresent()) {
            maxReindeer = maxReindeerOpt.getAsInt();
        }
        OptionalInt maxNoneOpt = list.stream().filter(p -> p.getHatType() == HatType.NO_HAT).mapToInt(p -> p.getName().length()).max();
        if (maxNoneOpt.isPresent()) {
            maxNone = maxNoneOpt.getAsInt();
        }

        //create new map to return
        Map<HatType, List<Adventuin>> result = new HashMap<HatType, List<Adventuin>>();

        // save initial variables
        int finalMaxFish = maxFish;
        int finalMaxSanta = maxSanta;
        int finalMaxReindeer = maxReindeer;
        int finalMaxNone = maxNone;

        // for each member of stream check HatType and according to its name save it into map
        list.stream().forEach(p -> {
            List<Adventuin> current = result.get(p.getHatType());
            if (current == null) {
                current = new LinkedList<>();
            }


            if (p.getHatType() == HatType.FISHY_HAT && p.getName().length() == finalMaxFish) {
                current.add(p);
                result.put(HatType.FISHY_HAT, current);
            } else if (p.getHatType() == HatType.SANTA_CLAUS && p.getName().length() == finalMaxSanta) {
                current.add(p);
                result.put(HatType.SANTA_CLAUS, current);
            } else if (p.getHatType() == HatType.REINDEER && p.getName().length() == finalMaxReindeer) {
                current.add(p);
                result.put(HatType.REINDEER, current);
            } else if (p.getHatType() == HatType.NO_HAT && p.getName().length() == finalMaxNone) {
                current.add(p);
                result.put(HatType.NO_HAT, current);
            }

        });

        //return grouped map
        return result;

    }

    public static Map<Integer, Double> getAverageColorBrightnessByHeight(List<Adventuin> list) {
        Map<Integer, Double> result = new HashMap<>(); //create Map to return
        Map<Integer, List<Adventuin>> temp = new HashMap<>(); //create a temporary map to group adventuins by integers


        temp = list.stream().collect(Collectors.groupingBy(p -> {
            if (p.getHeight() % 10 == 5) return p.getHeight() + 5;
            else if (p.getHeight() % 10 > 5) return p.getHeight() + (10 - p.getHeight() % 10);
            else return p.getHeight() - (p.getHeight() % 10);
        }));  //group by rounding to 10 multiples


        for (Map.Entry<Integer, List<Adventuin>> entry : temp.entrySet()) { //go through the map of grouped adventuins
            double brightness = 0;
            OptionalDouble brightnessOpt = entry.getValue().stream().mapToDouble(pingu ->   // for each key get corresponding list and convert it to stream
                            (0.2126 * pingu.getColor().toRgbColor8Bit().getRed() + 0.7152 * pingu.getColor().toRgbColor8Bit().getGreen() + 0.0722 * pingu.getColor().toRgbColor8Bit().getBlue()) / 255) //map its members to given formula
                    .average();
            if (brightnessOpt.isPresent())
                brightness = brightnessOpt.getAsDouble(); // get average and check it for existence

            result.put(entry.getKey(), brightness); //put gotten average values to the integers
        }

        return result; //return gotten map
    }


    public static Map<HatType, Double> getDiffOfAvgHeightDiffsToPredecessorByHatType(List<Adventuin> list) {
        Map<HatType, List<Adventuin>> grouped = groupByHatType(list); //group all adventuins by hats
        Map<HatType, Double> result = new HashMap<>();  //create result to return it later


        for (Map.Entry<HatType, List<Adventuin>> entry : grouped.entrySet()) {  //go through whole Map
            double NegdiffPredecessor = 0.0;     //create negative difference
            double PosdiffPredecessor = 0.0;     // positive difference
            double AbsoluteDiff = 0.0;           // absolute difference

            int negCount = 0;                   // count negative differences
            int posCount = 0;                   // count positive differences

            int[] intarr = entry.getValue().stream().mapToInt(Adventuin::getHeight).toArray();  //create an array from adventuin heights
            if (intarr.length == 1) {   //if only one adventuin wears specific hat continue to next hat
                AbsoluteDiff = 0.0;
                result.put(entry.getKey(), AbsoluteDiff);
                continue;
            }
            for (int i = 0; i < intarr.length; i++) {  // run through array, check conditions and save the values
                if (i == 0) {
                    if (intarr[i] - intarr[intarr.length - 1] > 0) {
                        PosdiffPredecessor += intarr[i] - intarr[intarr.length - 1];
                        posCount += 1;
                    } else if (intarr[i] - intarr[intarr.length - 1] < 0) {
                        NegdiffPredecessor += intarr[i] - intarr[intarr.length - 1];
                        negCount += 1;
                    } else {
                        PosdiffPredecessor += 0;
                        PosdiffPredecessor += 0;
                    }
                } else {
                    if (intarr[i] - intarr[i - 1] > 0) {
                        PosdiffPredecessor += intarr[i] - intarr[i - 1];
                        posCount += 1;
                    } else if (intarr[i] - intarr[i - 1] < 0) {
                        NegdiffPredecessor += intarr[i] - intarr[i - 1];
                        negCount += 1;
                    } else {
                        PosdiffPredecessor += 0;
                        PosdiffPredecessor += 0;
                    }
                }
            }

            if (posCount != 0 && negCount != 0)
                AbsoluteDiff = (PosdiffPredecessor / posCount) - (NegdiffPredecessor / negCount);  //calculate absolute difference

            else if (posCount != 0)
                AbsoluteDiff = PosdiffPredecessor / posCount;

            else if (negCount != 0)
                AbsoluteDiff = 0 - (NegdiffPredecessor / negCount);

            else AbsoluteDiff = 0;


            result.put(entry.getKey(), AbsoluteDiff); //fill the result map

        }
        return result;
    }
}
