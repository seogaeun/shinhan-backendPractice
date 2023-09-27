package com.example.service;


import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BaseTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("매 테스트시에 호출합니다~~");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("매 테스트 전 호출");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("매 테스트 후 한번 호출");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("테스트 후 한번 호출");
    }

    @Test
    @DisplayName("더하기 테스트")
    public void calTest(){
        //given
        int a = 1;
        int b = 3;

        //when
        int sum = a + b;

        System.out.println(sum);


        //then
        assertEquals(4,sum);
        System.out.println("테스트 완료");
    }
}
