package cn.com.taiji.util;

import cn.com.taiji.domain.Device;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonUtils {


    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();


    /*
    *   将对象数据转换为json数据格式
    * */
    public static String objectToJson(Object data) {

        try {
            String result = MAPPER.writeValueAsString(data);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    *   将json数据转换为对象
    * */
    public static <T> T jsonToPojo(String data,Class<T> beanType){
        try {
            T t =  MAPPER.readValue(data,beanType);
            return t;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
