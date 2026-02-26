public class App {
    public static void main(String[] args) {

        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};

        int[] arr2 = new int[20];
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[i] == myArray[j]) {
                    arr2[count] = myArray[j];
                    count++;
                    break;
                }

            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
