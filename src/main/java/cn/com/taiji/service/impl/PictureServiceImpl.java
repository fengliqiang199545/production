package cn.com.taiji.service.impl;

import cn.com.taiji.service.PictureService;
import cn.com.taiji.util.FileUtil;
import cn.com.taiji.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class PictureServiceImpl implements PictureService {

    @Override
    public Map<String, Object> uploadPicture(MultipartFile uploadFile) throws Exception {
        Map<String , Object> resultMap = new HashMap<>();
        try {
            if (uploadFile != null && uploadFile.getOriginalFilename() != null && uploadFile.getOriginalFilename().length() > 0){
                //生成一个新的文件名
                //取出原始文件名
                String oldName = uploadFile.getOriginalFilename();

                //生成新的文件名
                String newName = IDUtils.genImageName();
                newName =  newName + oldName.substring(oldName.lastIndexOf("."));

                //定义存储位置
                String filePath = "D:\\upload\\temp\\img\\";

                //定义写入路径
                File file = new File(filePath + newName);

                //将文件写入到文件路径中去
                uploadFile.transferTo(file);

                //图片上传成功后，将图片的地址返回
                resultMap.put("error",0);
                resultMap.put("url","/pic/"+newName);

                return resultMap;

            }else {
                //文件发生异常
                resultMap.put("error", 1);
                resultMap.put("message", "文件异常");
                return resultMap;
            }
        } catch (Exception e) {
            //发生其他异常
            resultMap.put("error", 1);
            resultMap.put("message", "文件上传发生异常");
            return resultMap;
        }

    }

    @Override
    public boolean deleteFile(String picName) throws Exception {
        //picName更像是图片路径
        picName = picName.substring(picName.lastIndexOf("/")+1);

        picName = "D:\\upload\\temp\\img\\"+picName;

        FileUtil.deleteFile(picName);

        return true;
    }
}
