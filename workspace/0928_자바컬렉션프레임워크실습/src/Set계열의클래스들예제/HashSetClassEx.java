package Set계열의클래스들예제;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet은 객체를 저장하기 전에
 * 먼저 객체의 hashCode() 메소드를 호출해서 해시코드 값을 얻는다.
 * 그리고 이미 저장되어 있는 객체들의 해시코드와 비교한다.
 * 만약 동일한 해시코드가 있다면 equals() 메소드로 두 객체를 비교해서
 * true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
 * 
 */

public class HashSetClassEx {

	public static void main(String[] args) {
		// HashSet 객체 생성
		Set<Member> member_set = new HashSet<Member>();
		
		Member member1 = new Member("손흥민", 29, "111111-1111111");
		Member member2 = new Member("손흥민", 29, "111111-1111111");
//		Member member3 = new Member("가나다", 30, "111111-2222222");
		
		member_set.add(member1);
		member_set.add(member2);
//		member_set.add(member3);
		
		System.out.println("총 객체수: " + member_set.size());
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		System.out.println(member1.equals(member2));

	}

}
