package cn.com.taiji.service.impl;

import cn.com.taiji.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public Map<String, Object> uploadFile(MultipartFile uploadFile) throws Exception {

        Map<String,Object> resultMap  = new HashMap<String, Object>();
        if (uploadFile != null && uploadFile.getOriginalFilename() != null && uploadFile.getOriginalFilename().length() > 0){
            String fileName = uploadFile.getOriginalFilename();

            String filePath = "D:\\upload\\temp\\file\\";

        }

        return null;
    }

    @Override
    public boolean deleteFile(String fileName) throws Exception {
        return false;
    }
}
