/**
 * @author Abhishek Jain
 * This file contains sample code for CORE JAVA Array implementation.
 */
public class ArrayEx {
    public static void main(String[] args) {
        // One-D or Single dimensional Array
        int[] studenRollNoArr = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        //Array of studenRollNoArr is initialized with 10 values
        //to print studenRollNoArr Array values, we can use for loop

        System.out.println("#### Accessing arrays value without loop ####");
        System.out.println("Roll Number of Student 1 is " + studenRollNoArr[0]);
        System.out.println("Roll Number of Student 5 is " + studenRollNoArr[4]);
        System.out.println("Roll Number of Student 10 is " + studenRollNoArr[9]);

        System.out.println("\n #### Accessing arrays value using loop ####");
        for(int index=0; index<10; index++)
            System.out.println("Roll Number of Student " + (index+1) + " is " + studenRollNoArr[index]);
    }
}
