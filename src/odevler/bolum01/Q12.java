package odevler.bolum01;

public class Q12 {
    public static void main(String[] args) {

        int distance_in_miles = 24;

        double distance_in_km = distance_in_miles*1.6;

        double time_in_hour = (double)(60*60 + 40*60 +35) / (60*60);

        System.out.println("Speed : " + distance_in_km / time_in_hour);
    }
}
