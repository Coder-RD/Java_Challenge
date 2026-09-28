import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        byte[] hash=md.digest(input.getBytes());
        StringBuilder hexString=new StringBuilder();
        for(byte b:hash){
            hexString.append(String.format("%02x", b));
        }
        System.out.println(hexString);
    }
}
