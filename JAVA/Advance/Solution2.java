/*
 * Problem name : Java Reflection - Attributes 
 */
package Advance;

import DataStructure.Solution15.Student;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author akash
 */
public class Solution2 {
     public static void main(String[] args){
           Class student = Student.class;
            Method[] methods = student.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method method : methods){
                methodList.add(method.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
    }