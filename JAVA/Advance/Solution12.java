/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advance;

/**
 *
 * @author akash
 */

import java.security.MessageDigest;
import java.util.*;

class Solution{
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		try{
			MessageDigest md=MessageDigest.getInstance("SHA-256");
			md.update(s.getBytes());
			byte[] digest=md.digest();
			for(byte b:digest)System.out.printf("%02x",b);
		}catch(Exception e){}
	}
}
