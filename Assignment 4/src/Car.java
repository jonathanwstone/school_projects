public abstract class Car {

    // Variables
    int id ;
    static int nextId = 0;


    Car(){
        this.id = nextId++;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Car" + id;
    }
}
