public class CharCount {
    public static void main(String[] args) {
        String s = "success";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int count = 0;

            // count how many times ch appears
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " → " + count);
        }
    }
}
