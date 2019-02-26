package cn.com.taiji.controller;

import cn.com.taiji.service.PictureService;
import cn.com.taiji.util.CollectionsFactory;
import cn.com.taiji.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.CollectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "/pic/upload")
    public String pictureUpload(MultipartFile file) throws Exception{
        Map<String ,Object> result = pictureService.uploadPicture(file);
        String json = JsonUtils.objectToJson(result);
        return json;
    }

    @RequestMapping(value = "/pic/delete")
    public String pictureDelete(String fileName) throws Exception{
        pictureService.deleteFile(fileName);
        Map<String , Object> result = CollectionsFactory.newHashMap();
        result.put("data","success");
        String json = JsonUtils.objectToJson(result);
        return json;
    }
}
