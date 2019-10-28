package t1708e.asm.diduduadi.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import com.cloudinary.utils.ObjectUtils;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import t1708e.asm.diduduadi.dto.ImageDTO;
import t1708e.asm.diduduadi.entity.Place;
import t1708e.asm.diduduadi.entity.rest.RESTResponse;
import t1708e.asm.diduduadi.service.image.ImageService;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Map;

import static t1708e.asm.diduduadi.util.CloudinaryUtil.MyCloudinary;

@RestController
@RequestMapping(value = "/image")
public class ImageController {

    @Autowired
    ImageService imageService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getById(@PathVariable int id) throws RemoteException {
        ImageDTO imageDTO = new Gson().fromJson(imageService.getByIdImage(id), ImageDTO.class);
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Action success!")
                .addData(imageDTO)
                .build(),
                HttpStatus.OK);
    }
}
