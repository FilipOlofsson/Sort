public class searchTest {

    public static void main(String[] args) {
        int[] integers = {0, 10, 50};
        integers = Sort.selSort(integers);
        for(int i : integers) {
            System.out.println(i);
        }
        System.out.println("BinarySearch.find(integers, 50));
    }
}
