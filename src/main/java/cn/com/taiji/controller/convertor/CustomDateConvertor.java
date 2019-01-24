package cn.com.taiji.controller.convertor;


import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//自定义日期转换器
public class CustomDateConvertor implements Converter<String, Date> {
    @Override
    public Date convert(String s) {

        //进行日期转换
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
