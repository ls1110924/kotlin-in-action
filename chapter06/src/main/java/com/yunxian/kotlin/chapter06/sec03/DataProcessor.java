package com.yunxian.kotlin.chapter06.sec03;

import java.util.List;

public interface DataProcessor<T> {

    void process(String input, List<T> output, List<String> errors);

}
