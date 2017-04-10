/**
 * Created by Filip on 2017-04-09.
 */
public class sortTest {

    public static void main(String[] args) {
        int[] integers = {9, 1, 15, -195, 2147483647};
        integers = Sort.selSort(integers);
        System.out.println("Sorted Integers:\n");
        for(int i : integers) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        double[] doubles = {0.15, 1.51, 1, 1.98, -5.19};
        doubles = Sort.selSort(doubles);
        System.out.println("Sorted Doubles:\n");
        for(double i : doubles) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        String[] StringLengths = {"Hej", "Då", "Hallå", "Hejhej"};
        StringLengths = Sort.selSortStringLength(StringLengths);
        System.out.println("Sorted Strings by length:\n");
        for(String i : StringLengths) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

        String[] StringAlphas = {"Alfabet", "Boll", "Ö", "Filip"};
        StringAlphas = Sort.selSortStringAlpha(StringAlphas);
        System.out.println("Sorted Strings by alphabet:\n");
        for(String i : StringAlphas) {
            System.out.println(i);
        }
        System.out.println("\n@@@@@@@@@@@");

    }
}
