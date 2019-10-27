package com.SinglePattern;

public class Resolution {
    private double height;
    private double width;

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Resolution{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
