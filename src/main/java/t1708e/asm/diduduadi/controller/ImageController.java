package t1708e.asm.diduduadi.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import com.cloudinary.utils.ObjectUtils;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static t1708e.asm.diduduadi.util.CloudinaryUtil.MyCloudinary;

@Controller
@RequestMapping(value = "/image")
public class ImageController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String test(@RequestParam("file") MultipartFile multipartFile) throws IOException {

        String fileName = multipartFile.getOriginalFilename();
//        Map upload = MyCloudinary.uploader().upload("https://image.vtcns.com/files/nguyenxuantien/2019/10/15/anh-tra-thi-tuyet-suong-1-1124075.jpg",ObjectUtils.emptyMap());


        Map upload = MyCloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
//        return new Gson().toJson(upload);
        return new Gson().toJson(upload.get("url"));
    }

}
