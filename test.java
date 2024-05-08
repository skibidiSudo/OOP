import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] a = {-1, -8, 0, 5, -9};
        System.out.println(maxSatisfaction(a));
        String s = "123";
        int x = Integer.parseInt(s);
        int b = 123;
        String s2 = String.valueOf(b);
    }

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans = 0;
        for (int i = 0; i < satisfaction.length; i++){
            int sum = 0, pro = 1;
            for (int j = i; j < satisfaction.length; j++){
                sum += satisfaction[j] * (pro);
                pro++;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
