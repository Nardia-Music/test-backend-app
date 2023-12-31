package com.nardia.streamingservice.services;
import com.nardia.streamingservice.domain.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

public interface VideoService {
    Video getVideo(String name);

    void saveVideo(MultipartFile file, String name) throws IOException;

    List<String> getAllVideoNames();
}