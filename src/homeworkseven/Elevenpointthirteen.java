package homeworkseven;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevenpointthirteen {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int t;
        ArrayList<Integer>list=new ArrayList<Integer>();
        System.out.print("Enter ten integers:");
        for(int i=0;i<10;i++) {
            t=input.nextInt();
            list.add(t);
        }
        removeDuplicate(list);
    }
	
    public static void removeDuplicate(ArrayList<Integer>list) {
        ArrayList<Integer>list1=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
            if(!list1.contains(list.get(i)))
                list1.add(list.get(i));
        }
        System.out.print("The distinct integers are ");
        for(int i=0;i<list1.size();i++)
            System.out.print(list1.get(i)+" ");

    }

}
