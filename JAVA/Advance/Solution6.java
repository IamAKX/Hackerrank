/*
 * Problem name : Java Singleton Pattern 
 */
package Advance;

/**
 *
 * @author akash
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
	
	static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public String str;
	
	static Singleton getSingleInstance() {
		return instance;
	}

}