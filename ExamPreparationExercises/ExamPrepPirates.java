import java.util.*;

public class ExamPrepPirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Integer>> citiesPopulatonGold = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Sail")){
            String[] tokens = input.split("\\|\\|");
            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);
            if (!citiesPopulatonGold.containsKey(city)){
                List<Integer> list = new ArrayList<>();
                list.add(0,population);
                list.add(1,gold);
                citiesPopulatonGold.put(city, list);
            }else {
                int newPopulation = citiesPopulatonGold.get(city).get(0) + population;
                int newGold = (citiesPopulatonGold.get(city).get(1)) + gold;

                citiesPopulatonGold.get(city).set(0, newPopulation);
                citiesPopulatonGold.get(city).set(1, newGold);
            }
            input=scanner.nextLine();
            }
        String inputAfterSail = scanner.nextLine();
        while (!inputAfterSail.equals("End")){
            String[] token = inputAfterSail.split("=>");
            String event = token[0];
            String town = token[1];
            switch (event){
                case "Plunder":
                    int people = Integer.parseInt(token[2]);
                    int gold = Integer.parseInt(token[3]);
                    int newPeople = citiesPopulatonGold.get(town).get(0) - people;
                    int newGold = citiesPopulatonGold.get(town).get(1) - gold;
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (people<=0 || gold<=0){
                        citiesPopulatonGold.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }else {
                        citiesPopulatonGold.get(town).set(0, people);
                        citiesPopulatonGold.get(town).set(1, gold);
                    }
                    break;
                
            }
            inputAfterSail=scanner.nextLine();
        }


    }
        }


