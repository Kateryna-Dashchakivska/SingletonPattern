package com.SinglePattern;

public class File {

    private double size;
    private boolean isCompressed;
    private String extension;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isCompressed() {
        return isCompressed;
    }

    public void setCompressed(boolean compressed) {
        isCompressed = compressed;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public File(double size, boolean isCompressed, String extension) {
        this.size = size;
        this.isCompressed = isCompressed;
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", isCompressed=" + isCompressed +
                ", extension='" + extension + '\'' +
                '}';
    }


}
