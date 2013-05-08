package com.video.manager.controllers;

import com.video.manager.model.Video;
import com.video.manager.repository.VideoRepository;
import com.video.manager.repository.VideoRepositoryImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MainPageController {
    
    private VideoRepository videoRepository = new VideoRepositoryImpl();
    
    public Video getMainVideo(){
	return videoRepository.getMainVideo();
    }
    
}
