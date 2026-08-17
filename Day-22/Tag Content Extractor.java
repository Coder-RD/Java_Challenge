import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");

        while (n-- > 0) {
            String line = sc.nextLine();

            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}