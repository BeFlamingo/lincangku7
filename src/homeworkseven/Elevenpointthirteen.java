package homeworkseven;

import java.util.*;

public class Elevenpointthirteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, i;
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter ten integers:");
		for (i = 0; i < 10; i++) {
			x = input.nextInt();
			list.add(x);
		}
		removeDuplicate(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			if (!lst.contains(list.get(i))) {
				lst.add(list.get(i));
			}
		}
		System.out.print("The distinct integers are ");
		for (int i = 0; i < lst.size(); i++) {
			System.out.print(lst.get(i) + " ");
		}

	}

}
