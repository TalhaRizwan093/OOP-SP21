
package l8asi2;


public class Laptop extends Computer {
    
    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop() {
        
        length = 0;
        width = 0;
        height = 0;
        weight = 0;
        
    }

    public Laptop(double length, double width, double height, double weight, int wordSize, int memorySize, int storageSize, double speed) {
        super(wordSize, memorySize, storageSize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    public String display() {
        return super.display() + " Length: " + length + " Width:" + width + " Height:" + height + " Weight:" + weight;
    }
    
    
    
    
    
    
    
}
