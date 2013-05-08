package com.video.manager.repository;

import com.video.manager.model.Video;

public class VideoRepositoryImpl implements VideoRepository {

    public VideoRepositoryImpl(){
    }
    
    @Override
    public Video getMainVideo() {
	
	Video video1= new Video ("4V0N1x675FQ", "Take My Bones Away", "Baroness");
	
	
	return video1;
    }
   
}
