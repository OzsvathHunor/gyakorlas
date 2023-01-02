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
            if (i / 2 == 0){
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
    public static void main(String[] args){
        int[] tomb = new int[20];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random() * (100 - 1) + 1);
        }
    }
}
