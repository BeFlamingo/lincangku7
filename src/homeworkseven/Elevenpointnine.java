package homeworkseven;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevenpointnine {
	public static void main(String[] args) {
        tan a=new tan();
        a.set();
        a.findrow();
        a.findcol();
        a.pt();
    }
}

class tan{
    int n;
    double randomNumber;
    int max;
    Scanner input=new Scanner(System.in);
    ArrayList<Integer>listrow=new ArrayList<>();
    ArrayList<Integer>listcol=new ArrayList<>();
    int [][]a=new int[10][10];
    void set() {
        System.out.print("Enter the array size n:");
        n=input.nextInt();
        System.out.println("The random array is");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                randomNumber=(Math.random()>0.5?1:0);
                a[i][j]=(int)(randomNumber);
                if(j<n-1)
                System.out.print(a[i][j]+" ");
                else
                    System.out.println(a[i][j]);
            }
    }
    
    void findrow() {
        int max=0;
        int count=0;
        for(int i=0;i<n;i++) {
            count=0;
            for(int j=0;j<n;j++) {

                if(a[i][j]==1)
                    count++;
                }
                if(count>max) {
                    max=count;
                    listrow.clear();
                    listrow.add(i);
                }
                else if(count==max){
                    listrow.add(i);
                }
            }

    }
    
    void findcol() {
        int max=0;
        int count=0;
        for(int i=0;i<n;i++) {
            count=0;
            for(int j=0;j<n;j++) {

                if(a[j][i]==1)
                    count++;
                }
                if(count>max) {
                    max=count;
                    listcol.clear();
                    listcol.add(i);
                }
                else if(count==max){
                    listcol.add(i);
                }
            }

    }
    
    void pt() {
    	int i;
        int l1=listrow.size();
        int l2=listcol.size();

        System.out.print("The largest row index: ");
        for(i=0;i<l1-1;i++)
            System.out.print(listrow.get(i)+",");
        System.out.print(listrow.get(i));
        System.out.println();
        System.out.print("The largest column index: ");
        for(i=0;i<l2-1;i++)
            System.out.print(listcol.get(i)+",");
        System.out.print(listcol.get(i));

    }
}
