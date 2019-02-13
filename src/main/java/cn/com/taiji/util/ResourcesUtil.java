package cn.com.taiji.util;


import java.io.Serializable;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/*
*   资源文件读取类
* */
public class ResourcesUtil implements Serializable {
    private static final long serialVersionUID = -7657898714983901418L;

    /*
     *   系统语言环境，默认为中文，'zh"
     * */
    public static final String LANGUAGE = "zh";

    /*
     *    系统国家环境，默认为中国CN
     * */
    public static final String COUNTRY = "CN";

    private static Locale getLocale() {
        Locale locale = new Locale(LANGUAGE,COUNTRY);

        return locale;
    }

    public static String getProperties(String baseName,String section){

        String retVaule = "";

        try {
            Locale locale = getLocale();
            ResourceBundle rb = ResourceBundle.getBundle(baseName,locale);
            retVaule = (String) rb.getObject(section);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return retVaule;

    }


    /*
    *   通过key从资源文件读取内容
    * */
    public static  String getVaule(String fileName, String key){
        String vaule = getProperties(fileName,key);
        return vaule;

    }

    /*
    *   通过key从资源文件读取内容，并格式化
    * */
    public static String getVaule(String fileName,String key,Object[] objs){
        String pattern = getVaule(fileName,key);
        String vaule = MessageFormat.format(pattern,objs);
        return vaule;
    }

    public static void main(String[] args) {
        System.out.println(getVaule("jdbc","jdbc.url",new Object[]{}));
    }
}
//
//    public static void main(String[] args) {
//
//        Locale defaultLocale =Locale.getDefault();
//
//        System.out.println(defaultLocale.getCountry());
//    }


/*
*   根据语言，国家， 资源文件名，Key名字来获取资源文件值
* */

