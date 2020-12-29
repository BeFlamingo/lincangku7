package homeworkseven;

import java.util.Scanner;

class point {
	public double x;
	public double y;

	point() {
		this.x = 0;
		this.y = 0;
	}
}

public class Elevenpointfifteen {

	public static float caculate(point vertex[], int pointNumber) {
		int i = 0;
		float temp = 0;
		for (; i < pointNumber - 1; i++) {
			temp += (vertex[i].x - vertex[i + 1].x) * (vertex[i].y + vertex[i + 1].y);
		}
		temp += (vertex[i].x - vertex[0].x) * (vertex[i].y + vertex[0].y);
		return -temp / 2;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int pointNumber = 0;
		point[] p = new point[100];
		for (int i = 0; i < 100; i++) {
			p[i] = new point();
		}
		System.out.print("Enter the number of the points:");
		pointNumber = input.nextInt();
		System.out.println("Enter the coordinates of the points:");
		for (int i = 0; i < pointNumber * 2; i++) {
			if (i % 2 == 0) {
				p[i / 2].x = input.nextDouble();
			} else {
				p[i / 2].y = input.nextDouble();
			}
		}
		System.out.println("The total area is " + caculate(p, pointNumber));
	}

}
