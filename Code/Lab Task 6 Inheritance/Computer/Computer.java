public class Computer{
    // Data Members
    private int wordSize;
    private int memorySize;
    private int storageSize;
    private double speed;

    // Constructors
    public Computer(){}
    public Computer(int wordSize,int memorySize,int storageSize,double speed){
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    // setters
    public void setWordSize(int wordSize){
        this.wordSize = wordSize;
    }
    public void setMemorySize(int memorySize){
        this.memorySize = memorySize;
    }
    public void setStorageMemory(int storageSize){
        this.storageSize = storageSize;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    // getters
    public int getWordSize(){
        return this.wordSize;
    }
    public int getMemorySize(){
        return this.memorySize;
    }
    public int getStorageSize(){
        return this.storageSize;
    }
    public double getSpeed(){
        return this.speed;
    }

    

}
