package odevler.bolum01;

public class Q11 {
    public static void main(String[] args) {

        int current_population = 312032486;

        int total_second = 365*24*60*60;

        int birthNumberPerYear = total_second/7; // küsüratı saymamak için int olarak tanımladım

        int deathNumberPerYear = total_second/13;

        int immigrantNumberPerYear = total_second/45;

        System.out.println("After 1 Year, Population : " + (current_population + (birthNumberPerYear + immigrantNumberPerYear - deathNumberPerYear)));
        System.out.println("After 2 Year, Population : " + (current_population + 2 * (birthNumberPerYear + immigrantNumberPerYear - deathNumberPerYear)));
        System.out.println("After 3 Year, Population : " + (current_population + 3 * (birthNumberPerYear + immigrantNumberPerYear - deathNumberPerYear)));
        System.out.println("After 4 Year, Population : " + (current_population + 4 * (birthNumberPerYear + immigrantNumberPerYear - deathNumberPerYear)));
        System.out.println("After 5 Year, Population : " + (current_population + 5 * (birthNumberPerYear + immigrantNumberPerYear - deathNumberPerYear)));
    }
}
