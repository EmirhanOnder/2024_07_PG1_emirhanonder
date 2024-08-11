package odevler.bolum01;

public class Q10 {
    public static void main(String[] args) {

        int distance_in_km = 14;

        double distance_in_miles = distance_in_km / 1.6;

        double time = 45.5 / 60; // 1 saat 60 dakika ise 45.5 dakika kaç saattir?

        double speed = distance_in_miles / time;

        System.out.println("Speed in miles/hour : " + speed);
    }
}
