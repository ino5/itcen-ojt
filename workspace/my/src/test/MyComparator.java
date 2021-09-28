package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyComparator {
	public static void main(String[] args) {
		MyComparatorSolution sol = new MyComparatorSolution();
		Integer[] arr = {5, 11, 24, 13, 4};
		Integer[] answer = sol.solution(arr, 1);
		for (int num : answer) {
			System.out.print(num + " ");
		}
	}
}

class MyComparatorSolution {
	public Integer[] solution(Integer[] arr, int n) {
		List<MyInteger> list = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			list.add(new MyInteger(arr[i], n));
		}
		Collections.sort(list, comparator);
		Integer[] answer = new Integer[list.size()];
		
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).num;
		}
		return answer;
	}
	Comparator<MyInteger> comparator = new Comparator<MyInteger>() {
		public int compare(MyInteger a, MyInteger b) {
			if (a.n == 1) return b.num - a.num;
			else return a.num - b.num;
		}
	};
	
	class MyInteger {
		int num;
		int n;
		MyInteger(int num, int n) {
			this.num = num;
			this.n = n;
		}
	}
}