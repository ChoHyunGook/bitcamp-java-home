package net.zerotodev.javabasic;

import java.util.Scanner;

public class HelloApp {
    String id = "";
    String pw = "";
    String name = "";

    public String hello(String paramId, String paramPw, String paramName) { // 파라미터 = 매개변수
        id = paramId;
        pw = paramPw;
        name = paramName;
        return "ID "+id+" PW "+pw+" Name "+name;
    }
}

