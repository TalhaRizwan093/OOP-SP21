
package l8asi2;


public class Computer {
    
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private double speed;

    public Computer() {
        wordSize = 0;
        memorySize = 0;
        storageSize = 0;
        speed = 0;
    }

    public Computer(int wordSize, int memorySize, int storageSize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWordSize() {
        return wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public double getSpeed() {
        return speed;
    }

    
    public String display() {
        return "Word Size:" + wordSize + " Memory Size:" + memorySize + " Storage Size:" + storageSize + " Speed" + speed;
    }
    
    
    
    
    
}
