package homeworkseven;

import java.util.*;

public class Elevenpointnine {
	public static void main(String[] args) {
		tan a = new tan();
		a.start();
		a.row();
		a.col();
		a.output();
	}
}

class tan {
	int x;
	double randomNumber;
	int max;
	Scanner input = new Scanner(System.in);
	ArrayList<Integer> listrow = new ArrayList<>();
	ArrayList<Integer> listcol = new ArrayList<>();
	int[][] number = new int[10][10];

	void start() {
		System.out.print("Enter the array size n:");
		x = input.nextInt();
		System.out.println("The random array is ");
		for (int i = 0; i < x; i++)
			for (int j = 0; j < x; j++) {
				randomNumber = (Math.random() > 0.5 ? 1 : 0);
				number[i][j] = (int) (randomNumber);
				if (j < x - 1)
					System.out.print(number[i][j] + " ");
				else
					System.out.println(number[i][j]);
			}
	}

	void row() {
		int max = 0;
		int count = 0;
		for (int i = 0; i < x; i++) {
			count = 0;
			for (int j = 0; j < x; j++) {

				if (number[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				listrow.clear();
				listrow.add(i);
			} else if (count == max) {
				listrow.add(i);
			}
		}

	}

	void col() {
		int max = 0;
		int count = 0;
		for (int i = 0; i < x; i++) {
			count = 0;
			for (int j = 0; j < x; j++) {

				if (number[j][i] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				listcol.clear();
				listcol.add(i);
			} else if (count == max) {
				listcol.add(i);
			}
		}
	}

	void output() {
		int i;
		int row = listrow.size();
		int col = listcol.size();

		System.out.print("The largest row index: ");
		for (i = 0; i < row - 1; i++) {
			System.out.print(listrow.get(i) + ",");
		}
		System.out.print(listrow.get(i));
		System.out.println();
		System.out.print("The largest column index: ");
		for (i = 0; i < col - 1; i++) {
			System.out.print(listcol.get(i) + ",");
		}
		System.out.print(listcol.get(i));

	}
}
