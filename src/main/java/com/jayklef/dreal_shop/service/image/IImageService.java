package com.jayklef.dreal_shop.service.image;

import com.jayklef.dreal_shop.dto.ImageDto;
import com.jayklef.dreal_shop.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImage(Long id);
    List<ImageDto> saveImage(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
