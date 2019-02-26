package cn.com.taiji.controller;

import cn.com.taiji.service.FileService;
import cn.com.taiji.util.DownloadUtil;
import cn.com.taiji.util.JsonUtils;
import org.apache.ibatis.scripting.xmltags.ForEachSqlNode;
import org.omg.PortableServer.ForwardRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/file/upload" ,method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(MultipartHttpServletRequest request) throws Exception{
            Iterator<String> iterator = request.getFileNames();
            String json = null;
            while (iterator.hasNext()){
                String filename = iterator.next();
                MultipartFile file = request.getFile(filename);

                Map<String,Object> result = fileService.uploadFile(file);
                json = JsonUtils.objectToJson(request);
            }

            return json;
    }


@RequestMapping(value = "/file/delete")
@ResponseBody
public String handleFileDelete(@RequestParam String fileName) throws Exception{
    String json = null;
    Map<String ,Object> result = new HashMap<>();
    fileService.deleteFile(fileName);
    result.put("data","success");
    json = JsonUtils.objectToJson(result);
    String json2 = null;

    return json;
    }

@RequestMapping(value = "/file/download")
    public void handleFileDownload(@RequestParam String fileName, HttpServletResponse response) throws Exception{
        fileName = fileName.substring(fileName.lastIndexOf("/")+ 1);
        String filePath = "D:\\upload\\temp\\file\\" + fileName;
    DownloadUtil downloadUtil = new DownloadUtil();
    downloadUtil.download(filePath,fileName,response,false);
}
}
