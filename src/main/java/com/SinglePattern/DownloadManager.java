package com.SinglePattern;

public class DownloadManager {

    private static DownloadManager downloadSession = null;

    private DownloadManager() {
    }

    public static DownloadManager getInstance(){
        if (downloadSession == null){
            downloadSession = new DownloadManager();
        }
        return downloadSession;
    }

    public Image downloadImageFromURL(String URL){
        System.out.println("Starting downloading image from URL: " + URL);
        Resolution resolution = new Resolution();
        resolution.setHeight(50);
        resolution.setWidth(60);
        Image image = new Image(resolution, 700, true);
        System.out.println("Downloaded image: " + image);
        return image;
    }

    public File downloadFileFromURL(String URL){
        System.out.println("Starting downloading file from URL: " + URL);
        File file = new File(255,true,"doc");
        System.out.println("Downloaded file: " + file);
        return file;
    }
}
