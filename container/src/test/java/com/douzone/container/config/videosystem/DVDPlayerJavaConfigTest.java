package com.douzone.container.config.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;
import com.douzone.containter.config.videosystem.DVDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
	// 같은 타입의 빈이 2개 이상 존재하는 경우1
	// 설정 클래스의 빈 생성 메소드 이름
	@Qualifier("dvdPlayer03")
	@Autowired
	private DVDPlayer dvdplayer03;
	
	// 같은 타입의 빈이 2개 이상 존재하는 경우2
	// 설정 클래스의 빈생성 메소드의 @Bean의 name 속성을 사용하는 방법
	@Qualifier("dvdPlayer04")
	@Autowired
	private DVDPlayer dvdplayer04;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	

	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdplayer03);
	}
	
}
