/*
 * Problem name : Java String Tokens 
 */
package String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author akash
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine() + " ";
        ArrayList<String> list = new ArrayList<>();
        String word = "";
        for(char c : s.toCharArray())
        {
            if((c>='A' && c<='Z') || (c>='a' && c<='z'))
                word += c;
            else
            {
                if(word!="")
                    list.add(word);
                word = "";
            }
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
