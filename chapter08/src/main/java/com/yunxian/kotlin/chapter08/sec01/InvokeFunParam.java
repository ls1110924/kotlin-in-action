package com.yunxian.kotlin.chapter08.sec01;

import com.yunxian.kotlin.chapter08.sec01.invoke._08_01_invokeFunParamKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class InvokeFunParam {

    public static void main(String[] args) {
        _08_01_invokeFunParamKt.processNum(integer -> integer * 10);
        _08_01_invokeFunParamKt.processNum(new Function1<Integer, Integer>() {
            @Override
            public Integer invoke(Integer integer) {
                return integer + 100;
            }
        });

        _08_01_invokeFunParamKt.processNumUnit(integer -> {
            System.out.println("Integer-->" + integer);
            return Unit.INSTANCE;
        });
    }

}
