import java.util.Random;

public class Test {
    public static void main(String[] args){
        int[] tomb = new int[20];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random() * (100 - 1) + 1);
        }
    }
}
