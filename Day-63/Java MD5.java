import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
       String input=br.readLine();
       MessageDigest md=MessageDigest.getInstance("MD5");
       byte[] hash=md.digest(input.getBytes());
       StringBuilder result=new StringBuilder();
       for(byte b:hash){
        result.append(String.format("%02x", b & 0xff));
       }
       System.out.println(result);
       
        
    }
}