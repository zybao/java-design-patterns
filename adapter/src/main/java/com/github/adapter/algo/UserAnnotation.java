package com.github.adapter.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
@TestA(name = "type", gid = Long.class)
public class UserAnnotation {
    @TestA(name = "param", id = 1, gid = Long.class)
    private Integer age;

    @TestA(name = "constructor", id = 2, gid = Long.class)
    public UserAnnotation() {

    }

    @TestA(name = "public method", id = 3, gid = Long.class)
    public void a() {
        Map m = new HashMap<>(0);
    }


    public void b(Integer a) {

    }
}
