package 스트림응용예제;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * 회원(Member) 객체에서 '남자' 회원의 평균 나이를 람다식과 스트림을
 * 적용하여 프로그램 작성
 */

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = (List) Arrays.asList(new Member("박태호", Member.MALE, 30),
												 new Member("김연경", Member.FEMALE, 29),
												 new Member("손유일", Member.MALE, 32),
												 new Member("안재흥", Member.MALE, 27));
		
		// [방법 1] 외부 반복자를 적용하여 해결
		// index를 이용하는 for문 그리고 Iterator를 이용하는 while문은 모두
		// 외부 반복자를 이용한다.
		
		int count = 0;
		double sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getGender() == Member.MALE) {
				sum += list.get(i).getAge();
				count++;
			}
		}
		double ageAvg = sum/count;
		
		System.out.println("남자 회원의 평균 나이: " + ageAvg); 
		
		// [방법 2] 내부 반복자를 적용하여 해결
		double ageAvg2 = list.stream() 									// 오리지날 스트림
//							 .filter(x -> x.getGender() == Member.MALE) // 중간 처리 스트림
//						     .mapToInt(Member::getAge) 					// 중간 처리 스트림
						     .mapToInt(x -> x.getAge())
						     .average()									// 최종 처리 스트림
						     .getAsDouble();
						
		System.out.println("남자 회원의 평균 나이: " + Math.floor(ageAvg2)); 
	}
}
