package com.SinglePattern;

public class Browser {

    public void openURL(String URL){
        System.out.println("Opening the URL..." + URL);
        DownloadManager downloadManager = DownloadManager.getInstance();
        Image pic1 = downloadManager.downloadImageFromURL(URL);
        File file1 = DownloadManager.getInstance().downloadFileFromURL(URL);



        DownloadManager downloadManager2 = DownloadManager.getInstance();
        Image pic2 = downloadManager2.downloadImageFromURL(URL);


        if (downloadManager.equals(downloadManager2)){
            System.out.println("Managers are equal: "+ downloadManager + downloadManager2);

        }
        System.out.println("Downloading successfully finished!");
    }

}
