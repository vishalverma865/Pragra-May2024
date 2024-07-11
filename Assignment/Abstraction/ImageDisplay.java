package Assignment.Abstraction;

class ImageDisplay extends MediaDevice {
    private String name;
    private String resolution;

    public ImageDisplay(String name, String resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public void displayImage() {
        System.out.println("Displaying Image");
    }
    @Override
    public void displayDetails() {
        System.out.println("Iamge name : " + name + "of resolution " + resolution );

    }
}
