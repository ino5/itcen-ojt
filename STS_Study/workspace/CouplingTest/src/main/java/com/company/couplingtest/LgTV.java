package com.company.couplingtest;

import org.springframework.stereotype.Component;

/*
 * SamsungTV와 LgTV는 메소드 시그니처(signature)가 서로 다르게 구현되어 있다.
 */

public class LgTV implements TV {
	// 생성자
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}
	
	@Override // 재정의
	public void powerOn() {
		System.out.println("LgTV ===> 전원 켠다.");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV ===> 전원 끈다.");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTV ===> 볼륨 올린다.");	
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTV ===> 볼륨 내린다.");
	}
}
