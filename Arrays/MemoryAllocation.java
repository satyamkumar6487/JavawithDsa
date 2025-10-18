public class MemoryAllocation {

    public static void main(String [] args) {


        int[] one = new int[5];

        one[0] = 1;

        one[1] = 2;
        one[2] = 23;

        int[] two = one;

        two[1] = 10;

        for (int i = 0; i < one.length ; i++) {

            System.out.print(one[i] + " ");

        }
    }
}
