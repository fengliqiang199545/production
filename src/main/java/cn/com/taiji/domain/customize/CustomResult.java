package cn.com.taiji.domain.customize;

import cn.com.taiji.domain.Custom;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.MappedByteBuffer;

public class CustomResult {

    //定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    //响应业务状态
    private Integer status;

    //响应消息
    private String msg;

    //响应中的数据
    private  Object data;

    public CustomResult(){}

    public CustomResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public CustomResult(Object data) {
        this.data = data;
        this.msg = "OK";
        this.status = 200;
    }

    public static CustomResult build (Integer status , String msg , Object data){
        return new CustomResult(status,msg,data);
    }

    public static CustomResult ok(Object data){return new CustomResult(data);}
    public static CustomResult ok(){return new CustomResult(null);}

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     *
     *  将json对象转换成CustomResult
     *
     **/
    public static CustomResult formatToPojo(String jsonData, Class<?>clazz){

        try {
            if(clazz == null){
                return MAPPER.readValue(jsonData,CustomResult.class);
            }

            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");

            Object obj = null;
            if (clazz != null){
                if (data.isObject()){
                    obj = MAPPER.readValue(data.traverse(),clazz);
                }else if (data.isTextual()){
                    MAPPER.readValue(data.asText(),clazz);
                }
            }

            return build(jsonNode.get("status").intValue(),jsonNode.get("msg").asText(),obj);
        } catch (IOException e) {
            return null;
        }


    }

    /*
    *   没有object对象的转换
    * */
    public static CustomResult format(String json){
        try {
            return MAPPER.readValue(json, CustomResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /*
    *   json - object 集合转化
    * */
//    public static CustomResult formatToList(String jsondata, Class<?>clazz){
//        return null;
//
//        JsonNode jsonNode =  MAPPER.readTree(jsondata);
//
//        JsonNode data = jsonNode.get("data");
//        Object obj = null;
//
//        if ( data.isArray() && data.size()>0){
//            MAPPER.
//        }
//    }
}
