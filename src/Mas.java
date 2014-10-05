/**
 * Created by Devil Trigger S on 05.10.2014.
 */
public class Mas {
    public static void main(String[] args) {
        int i;
        int d = 0;
        int[] x = {2, 3, 4};
        int[] y = {7, 6};
        int[] z = new int[x.length + y.length];
        for (i = 0; i < x.length; i++) {
            z[i] = x[i];
            d = i;
        }
        d++;
        for (i = 0; i < y.length; i++) {
            z[d] = y[i];
            d++;
        }
        for (i = 0; i < z.length; i++) System.out.println(z[i]);

    }
}