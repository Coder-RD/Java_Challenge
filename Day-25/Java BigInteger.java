import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);

        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));

        bufferedReader.close();
    }
}
