package cn.com.taiji.service.impl;

import cn.com.taiji.service.FileService;
import cn.com.taiji.util.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public Map<String, Object> uploadFile(MultipartFile uploadFile) throws Exception {

        Map<String,Object> resultMap  = new HashMap<String, Object>();

        try {
            if (uploadFile != null && uploadFile.getOriginalFilename() != null && uploadFile.getOriginalFilename().length() > 0){
                String fileName = uploadFile.getOriginalFilename();

                String filePath = "D:\\upload\\temp\\file\\";
                FileUtil fu = new FileUtil();

                String newName = fu.newFile(filePath,fileName);

                //new file
                File file = new File(filePath+ newName);
                //将内存中的文件写入到磁盘
                uploadFile.transferTo(file);

                //图片上传成功后，将图片的地址写回
                resultMap.put("error",0);
                resultMap.put("url","/file/"+ newName);
                return resultMap;
            }else {
                //返回结果
                resultMap.put("error" ,1);
                resultMap.put("message" ,"文件异常");
                return resultMap;
            }
        } catch (Exception e) {
            resultMap.put("error",1);
            resultMap.put("message","文件上传发生异常");
            return resultMap;
        }


    }

    @Override
    public boolean deleteFile(String fileName) throws Exception {
        fileName = fileName.substring(fileName.lastIndexOf("/")+1);
        fileName = "D:\\upload\\temp\\file\\" +  fileName;
        FileUtil.deleteFile(fileName);
        return true;
    }
}
