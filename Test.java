import java.util.Arrays;

public class Test {

    public int minimum(int[] tomb){
        int min = Integer.MAX_VALUE;
        for (var i:tomb) {
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    public int paros(int[] tomb){
        int count = 0;
        for (var i:tomb) {
            if (i % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int max (int[] tomb){
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] > max){
                max = tomb[i];
            }
        }
        return max;
    }

    public static int paratlan (int[] tomb){
        int count = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static int sumOfParatlan(int[] tomb){
        int sum = 0;
        for (var i:tomb) {
            if (i % 2 == 1){
                sum+= i;
            }
        }
        return sum;
    }

    public static int sumOfParos(int[] tomb){
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 2 == 0){
                sum += tomb[i];
            }
        }
        return sum;
    }


    public static void main(String[] args){
        int[] tomb = new int[20];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random() * (100 - 1) + 1);
        }
    }
}
