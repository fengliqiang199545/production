package cn.com.taiji.util;

import java.io.File;

public class FileUtil {

    //得到文件的扩展名
    public String getFileExt(String s){
        String result = new String();
        int i = 0;
        int j = 0;
        if (s == null){
            return null;
        }
        i = s.lastIndexOf(46) + 1;
        j = s.length();
        result = s.substring(i,j);
        if (s.lastIndexOf(46) > 0){
            return result.toLowerCase();
        }else {
            return "";
        }
    }

    //得到不含扩展名的文件名称
    public String getNameWithoutExtension(String fileName) {
        return fileName.substring(0,fileName.lastIndexOf("."));
    }

    //判断文件是否是图片
    public boolean isImgFile(String fileName){
        if (UtilFuns.isNotEmpty(fileName)){
            String s1 = "." + this.getFileExt(fileName);
            if (".jpg.jpeg.bmp.gif.png".indexOf(s1) > -1){
                return true;
            }
        }
        return false;
    }

    //得到文件名的全称
    public String getFileName(String s){
        try {
            s = s.replaceAll("/","\\\\");
            int fileIndex = s.lastIndexOf("\\" )+ 1;
            return s.substring(fileIndex,s.length());
        } catch (Exception e) {
            e.printStackTrace();
            return "wrong";
        }

    }

    //得到文件的全路径
    public String getFilePath(String s){
        try {
            s = s.replaceAll("/" ,"\\\\");
            int fileIndex = s.lastIndexOf("\\") + 1;
            return s.substring(0,fileIndex);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    //如果目录下有同名的文件，则文件重命名，增加文件序号
    public String newFile(String sPath,String sFile){
        String newFileName = new String();
        String withoutExt = new String();
        File curFile = new File(sPath + "\\" + sFile);
        if (curFile.exists()){
            for (int counter = 1;curFile.exists();counter++){
                withoutExt = this.getNameWithoutExtension(curFile.getName());
                if (withoutExt.endsWith(counter -1 + ")")){
                    withoutExt = withoutExt.substring(0,withoutExt.indexOf("("));
                }
                newFileName = withoutExt + "(" + counter + ")" + "." + getFileExt(curFile.getName());
                curFile = new File(sPath + "\\" + newFileName);
            }
        }else {
            newFileName = curFile.getName();
        }
        return newFileName;
    }


    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
//        //测试获取扩展名
//        String s =  fileUtil.getFileExt("123.avi");
//        System.out.println(s);

//        //测试不加扩展名的文件名
//        System.out.println(fileUtil.getNameWithoutExtension("龙兴华夏.avi"));

        //判断是否是图片文件
//        System.out.println(fileUtil.isImgFile("aa.jpg"));

        //通过全路径获取文件全称
//        System.out.println(fileUtil.getFileName("D:\\book\\microsoft-sql-server-2012-step-by-step-pre-press.pdf"));

        //只获取路径
        //System.out.println(fileUtil.getFilePath("D:\\chromeDownload\\SSM框架.pptx"));

        System.out.println(fileUtil.newFile("C:\\Users\\Administrator\\Desktop\\","使用2说明.docx"));
    }
}
