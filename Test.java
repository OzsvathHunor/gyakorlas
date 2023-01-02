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
    public static void main(String[] args){
        int[] tomb = new int[20];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = (int)(Math.random() * (100 - 1) + 1);
        }
    }
}
