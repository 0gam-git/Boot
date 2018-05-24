package com.younggambyeon;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringRunner extends SpringJUnit4ClassRunner
 * 
 * 
 */
@RunWith(SpringRunner.class)
// 스프링 부트로 컨텍스트 로드
// WebAppConfiguration
@SpringBootTest
public class SpringBootExampleApplicationTests {

	@Test
	public void contextLoads() { // 컨텍스트 로드 테스트
	}

}
