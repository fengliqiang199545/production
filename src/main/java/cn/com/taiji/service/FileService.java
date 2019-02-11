package cn.com.taiji.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface FileService {


    //上传文件
    Map<String,Object> uploadFile(MultipartFile uploadFile) throws Exception;

    //删除文件
    boolean deleteFile(String fileName)throws Exception;

}
