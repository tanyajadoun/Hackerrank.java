//input format
//Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
//Output Format

//For each line, print the line number, followed by a single space, and then the line content received as input.
//Sample Input

//Hello world
//I am a file
//Read me until end-of-file.
//Sample Output

//1 Hello world
//2 I am a file
//3 Read me until end-of-file.
import java.io.*;
import java.util.*;

public class endoffile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(i +" "+ s);
            i++;
        }
        
    }
}
