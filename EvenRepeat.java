import java.util.Arrays;

public class EvenRepeat {
    public static void main(String[] args) {
        int[] list = {3, 7, 2, 6, 2, 3, 1, 4, 6, 2};
        int[] list2 = new int[list.length];
        int s = 0;
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
                    list2[s++] = list[i];
                    break;
                }
            }
        }
        int k;
        for (k = 0; k < list2.length; k++) {
            if (list2[k] == 0) {
                break;
            }
        }
        int[] list3 = Arrays.copyOf(list2, k);
        System.out.println(Arrays.toString(list3));
    }
}
