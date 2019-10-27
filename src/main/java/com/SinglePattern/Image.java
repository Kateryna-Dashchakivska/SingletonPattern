package com.SinglePattern;

import com.sun.glass.ui.Size;

public class Image {

    private Resolution resolution;
    private double size;
    private boolean isColorful;

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isColorful() {
        return isColorful;
    }

    public void setColorful(boolean colorful) {
        isColorful = colorful;
    }

    public Image(Resolution resolution, double size, boolean isColorful) {
        this.resolution = resolution;
        this.size = size;
        this.isColorful = isColorful;
    }

    @Override
    public String toString() {
        return "Image{" +
                "resolution=" + resolution +
                ", size=" + size +
                ", isColorful=" + isColorful +
                '}';
    }
}
