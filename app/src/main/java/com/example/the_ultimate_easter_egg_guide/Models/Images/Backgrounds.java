package com.example.the_ultimate_easter_egg_guide.Models.Images;

public enum Backgrounds implements IImage {
    ;

    private final String imageName;
    private final ImageTypes imageType;
    private final int defaultImage;

    Backgrounds(String imageName, ImageTypes imageType, int defaultImage) {
        this.imageName = imageName;
        this.imageType = imageType;
        this.defaultImage = defaultImage;
    }

    @Override
    public String getImageName() {
        return imageName;
    }

    @Override
    public ImageTypes getImageType() {
        return imageType;
    }

    @Override
    public int getDefaultImage() {
        return defaultImage;
    }
}
