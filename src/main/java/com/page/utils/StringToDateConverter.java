package com.page.utils;
/*
  把 字符串 转换成 日期格式
 */

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请你填日期");
        }
        DateFormat dateFormat =  new SimpleDateFormat("yyyy-MM-dd");
        try {
           return  dateFormat.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("你填写的日期格式有误");
        }

    }
}
