package Set계열의클래스들예제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoGeneratorEx {
	public static void main(String[] args) {
		Random random = new Random();
//		Set<Integer> set = new HashSet<Integer>();
		/*
		 * TreeSet은 저장할 때 이미 정렬하기 때문에 읽어올 때 따로 정렬할필요가 없다.
		 * TreeSet은 Binary Search Tree의 형태로 데이터를 저장하는 컬렉션이다.
		 */
		Set<Integer> set = new TreeSet<Integer>(); 
		while (set.size() != 6) {
			int num = random.nextInt(45) + 1;
			set.add(num);
		}
//		List<Integer> list = new ArrayList<Integer>(set);
//		Collections.sort(list);
//		System.out.println(list);
		System.out.println(set);
	}
}
