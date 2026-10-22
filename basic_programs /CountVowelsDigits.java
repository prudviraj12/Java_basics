import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v = 0, d = 0, total = s.length();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                d++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                       ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                v++;
            }
        }

        System.out.println(v);
        System.out.println(d);
        System.out.println((v * 100.0) / total);
    }
}