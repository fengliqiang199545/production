package cn.com.taiji.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface PictureService {
    Map<String ,Object> uploadPicture(MultipartFile uploadFile) throws Exception;

    boolean deleteFile(String picName) throws Exception;
}
