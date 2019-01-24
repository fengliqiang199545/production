package cn.com.taiji.controller.convertor;

import org.springframework.core.convert.converter.Converter;

public class StringTrimConvertor implements Converter<String,String> {
    @Override
    public String convert(String s) {
        //去掉字符串两边的字符串
        try {
            if (s != null){
                s = s.trim();
                if (s.equals("")){
                    return null;

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }
}
