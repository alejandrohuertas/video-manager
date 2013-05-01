package com.video.manager.model;

public class Video {

    private String youtubeId;
    
    private String name;
    
    private String description;
    
    private Double timeInSecounds;
    
    private String genre;

    public Double getTimeInSecounds() {
	return timeInSecounds;
    }

    public void setTimeInSecounds(Double timeInSecounds) {
	this.timeInSecounds = timeInSecounds;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getYoutubeId() {
	return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
	this.youtubeId = youtubeId;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getGenre() {
	return genre;
    }

    public void setGenre(String genre) {
	this.genre = genre;
    }
    
    
}
