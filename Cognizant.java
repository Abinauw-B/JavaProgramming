public class Cognizant {
    public static int[] impactSum(int[] arr, int C) {

        int n = arr.length;
        int[] result = new int[n];

        int total = 0;
        for (int num : arr) {
            total += num;
        }

        for (int i = 0; i < n; i++) {
            int impact = total - arr[i];
            if (impact > C) impact = C;
            result[i] = impact;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int C = 7;

        int[] ans = impactSum(arr, C);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
