/*
 * Problem name : Java Sort
 */
package DataStructure;
 import java.util.*;
/**
 *
 * @author akash
 */


class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class Solution12
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
        CompareStudent myComparator = new CompareStudent();
        studentList.sort(myComparator);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
   
   public static class CompareStudent implements Comparator<Student>
   {

        @Override
        public int compare(Student o1, Student o2) {
            
            double cgpa = o2.getCgpa() - o1.getCgpa();
            if(cgpa==0)
            {
                int name = o1.getFname().compareTo(o2.getFname());
                if(name==0)
                {
                    return o2.getId()-o1.getId();
                }
                else
                    return name;
            }
            else
                if(cgpa<0)
                    return -1;
                else    
                    return 1;
                    
        }
       
   }
}

