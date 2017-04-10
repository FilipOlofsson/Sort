public class BinarySearch {

    public static int find(int[] sortedArray, int toSearch) {          //Användarvänlig metod som hämtar största indexen och minsta indexen automatiskt.
        return search(sortedArray, toSearch, 0, sortedArray.length - 1);    //Kalla metoden search med en sorterad array, ett item och max/min storleken på arrayen.
    }
    private static int search(int[] sortedArray, int toSearch, int minIndex, int maxIndex) {

        if(minIndex > maxIndex) {
            return -1;                  //Om minsta indexet är större än största så går det inte söka i den.
        }

        int middle = (minIndex + maxIndex) / 2;         //Hämta medelvärdet av största index och minsta index.


        if(sortedArray[middle] == toSearch) {           //Om indexet i mitten är samma som toSearch har itemet hittats.
            return middle;
        } else if(sortedArray[middle] > toSearch) {     //Om itemet finns i vänstra delen av arrayen så kasta den högra delen.
            return search(sortedArray, toSearch, minIndex, middle - 1);
        } else if(sortedArray[middle] < toSearch) {     //Om itemet finns i högra delen av arrayen så kasta den vänstra delen.
           return search(sortedArray, toSearch, middle + 1, maxIndex);
        }
        return -1;                                      //Inget har hittats.
    }
}
