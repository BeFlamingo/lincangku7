package homeworkseven;
import java.util.Scanner;
class point{
	public double x;
	public double y;
	point(){
		this.x=0;
		this.y=0;
	}
}
public class Elevenpointfifteen {
	
	public static float caculate(point vertex[],int pointNum)
    {
    	int i=0;
    	float temp=0;
    	for(;i<pointNum-1;i++)
    	{
    		temp+=(vertex[i].x-vertex[i+1].x)*(vertex[i].y+vertex[i+1].y);
    	}
    	temp+=(vertex[i].x-vertex[0].x)*(vertex[i].y+vertex[0].y);
    	return -temp/2;
    }
    public static void main(String args[]) 
    {
    	point[] point1=new point[100];
    	int pointNum=0;
    	Scanner input = new Scanner(System.in); 	
    	for(int i=0;i<100;i++)
    	{
    		point1[i]= new point();
    	}
    	System.out.print("Enter the number of the points:");
    	pointNum=input.nextInt();
    	System.out.println("Enter the coordinates of the points:");
    	for(int i=0;i<pointNum*2;i++)
    	{
    		if(i%2==0) {
	    		point1[i/2].x = input.nextDouble();
    		}
    		else {
	    		point1[i/2].y = input.nextDouble();
    		}
    	}
    	System.out.println("The total area is "+caculate(point1,pointNum));
    }


}
