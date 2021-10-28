package com.company.couplingtest;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker {
	// 생성자
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker ===> 볼륨 올린다.");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker ===> 볼륨 내린다.");
	}
	
	
}
