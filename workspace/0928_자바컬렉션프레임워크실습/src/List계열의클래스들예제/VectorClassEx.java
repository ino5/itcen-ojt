package List계열의클래스들예제;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClassEx {
	public static void main(String[] args) {
		String[] name = {"김진명", "최인호", "조정래", "김흥신", "박경리"};
		
		// Vector 객체 생성
		// List<E> list = new Vector<E>(); //일반적인 경우
		List<String> list = new Vector<String>(4, 3);
		
		// Vector 클래스의 주요 메소드 적용
		System.out.println("벡터에 저장된 요소의 개수: " + list.size());  // 0이 출력됨!
		System.out.println("벡터의 용량은: " + ((Vector<String>) list).capacity()); // 4
		
		/* 객체 추가 */
		for (int i = 0; i < name.length; i++) {
			list.add(name[i]); // 객체 추가
		}

		System.out.println("벡터에 저장된 요소의 개수: " + list.size());  // 0이 출력됨!
		System.out.println("벡터의 용량은: " + ((Vector<String>) list).capacity()); // 4
		
		System.out.println(list);
		
		list.add(2, "공지영");
		System.out.println(list);
		
		/* 객체 검색 get() 메소드, contains(), size() */
		System.out.println(list.get(1));
		
		boolean contains_result = list.contains("김흥신");
		System.out.println(contains_result);

		boolean contains_result2 = list.contains("홍길동");
		System.out.println(contains_result2);
		
		System.out.println(list.size());
		
		/* 객체 변경 set() 메소드 */
		// "공지영" 객체를 "이문열" 객체로 변경하고자 한다.
		list.set(2, "이문열");
		System.out.println(list);
		
		/* 객체 삭제 remove() 메소드 */
		list.remove(3);
		System.out.println(list);
		
		list.remove("김흥신");
		System.out.println(list);
		
		System.out.println(); //개행
		
		/* 객체 정렬 => 오름차순 */
		System.out.println("[객체 오름차순 정렬]");
		Collections.sort(list);
		System.out.println(list);
		
		/* 객체 정렬 => 내림차순 */
		System.out.println("[객체 내림차순 정렬]");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
