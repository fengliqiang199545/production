package cn.com.taiji.util;

import java.util.Random;

public class IDUtils {

    /*
    *   图片名生成
    * */
    public static String genImageName(){
        //取当前时间的长整型值包含毫秒
        long millis = System.currentTimeMillis();

        //加上三位随机数
        Random random = new Random();

        int end3 =  random.nextInt(999);

        //如果不足三位，则在前面补零
        String str =  millis + String.format("%03d",end3);

        return str;
    }

    /*
    *   商品ID的生成
    * */
    public static String genStringId(){
        //取当前时间的长整型包含毫秒
        long millis = System.currentTimeMillis();

        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);

        //如果不足两位则在前面补零
        String str = millis + String.format("%02d",end2);

        return str;
    }


    /*
    *       long型id的生成
    * */
    public static long genLongId(){
        //取当前时间的长整型包含毫秒
        long millis = System.currentTimeMillis();

        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);

        //如果不足两位则在前面补零
        String str = millis + String.format("%02d",end2);

        Long id = new Long(str);

        return id;
    }

    public static void main(String[] args) {
        for (int i = 0;i < 30 ;i++){
            System.out.println(genLongId());
        }
    }

}
