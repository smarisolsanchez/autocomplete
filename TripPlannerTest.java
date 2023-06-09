import org.junit.Test;

import java.util.List;

public class TripPlannerTest {

    @Test
    public void test1() {
        TripPlanner tp = new TripPlanner();
        tp.buildMap("uscities_final.csv",250);
        List<Integer> sp = tp.shortestPath("New York NY","Los Angeles CA");

        System.out.print(sp.size());


    }

    @Test
    public void test2() {
        TripPlanner tp = new TripPlanner();
        tp.buildMap("uscities_final.csv",500);
        List<Integer> sp = tp.shortestPath("Boston MA","Atlanta GA");

        System.out.print(sp.size());

        System.out.print("\t");

        System.out.print( tp.getCity(sp.get(0)).getCity() + " -> " + tp.getCity(sp.get(1)).getCity() +
                " -> " + tp.getCity(sp.get(2)).getCity());

    }

    @Test
    public void testPrint() {
        TripPlanner tp = new TripPlanner();
        tp.buildMap("uscities_final.csv",600);
        List<Integer> sp = tp.shortestPath("New York NY","Seattle WA");




        System.out.print(tp.printCities(sp));
    }

    @Test
    public void testPopularity() {
        TripPlanner tp = new TripPlanner();
        List<Integer> l = tp.planRandom("Lorain OH","Atlanta GA",5,4, "uscities_final.csv");
        System.out.print(tp.printCities(l));

    }

    @Test
    public void testPopularity1() {
        TripPlanner tp = new TripPlanner();
        List<Integer> l = tp.planRandom("New York NY","Los Angeles CA",5,2, "uscities_final.csv");
        System.out.print(tp.printCities(l));

    }


    @Test
    public void testPlanTrip() {
        TripPlanner tp = new TripPlanner();
        List<Integer> l = tp.planTrip("Philadelphia PA","New York NY",5,2);
        System.out.print(tp.printCities(l));

    }



    @Test
    public void distanceSquare() {
        TripPlanner tp = new TripPlanner();
        System.out.println(tp.getDictionary().get("New York NY"));
    }

}
