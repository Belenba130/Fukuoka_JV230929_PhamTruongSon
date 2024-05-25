package com.ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class Upfile {
    @Autowired
    private ServletContext servletContext;

    public String upload(MultipartFile file){
        String uploadFolder = "/upload/";
        String path = servletContext.getRealPath("/WEB-INF/") + uploadFolder;
        File upLoadDir = new File(path);
        if (!upLoadDir.exists()){
            upLoadDir.mkdir();
        }
        if (!file.isEmpty()){
            Path filePath = Paths.get(path+file.getOriginalFilename());
            try {
                Files.write(filePath,file.getBytes());
                return uploadFolder + file.getOriginalFilename();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
