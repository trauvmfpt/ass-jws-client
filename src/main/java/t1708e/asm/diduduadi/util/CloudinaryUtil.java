package t1708e.asm.diduduadi.util;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CloudinaryUtil {
    public static Cloudinary MyCloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "cheatmo1",
            "api_key", "723172711364762",
            "api_secret", "kSEPgweOUT7UbHf_PBftb5KcgWU"));

    public static List<String> saveImage(MultipartFile[] multipartFiles) {
        List<String> imageUrls = new ArrayList<>();
        try {
            for (MultipartFile multipartFile : multipartFiles
            ) {
               Map uploadResult = MyCloudinary.uploader().upload(multipartFile.getBytes(),ObjectUtils.emptyMap());
                imageUrls.add(uploadResult.get("url").toString());
            }
        } catch (IOException ex) {
            return null;
        }
        return imageUrls;
    }
}
