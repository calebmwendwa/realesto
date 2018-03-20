public class realestate {
    //private is for encapsulation to make it accessible only by use of a method within the class
    private double price, itemSize;
    private String propertyType;
    private int numBeds, numBaths;
    //the above will be regarded as an instance of an object because it has been declared within a
    //convert instance objects to make them store values
    //do this by generating a construct

    public realestate(double price, double itemSize, String propertyType) {
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        numBeds =0;
        numBaths =0;
    }

    public realestate(double price, double itemSize, String propertyType, int numBeds, int numBaths) {
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
    }
    //create a user defined method to call main method
    public String toString(){
        return "price is"+price+"Property Type is"+propertyType+"numBeds is"+numBeds+"numBaths"+numBaths;
    }
}
