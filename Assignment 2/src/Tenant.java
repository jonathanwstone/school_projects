public class Tenant {
    public String name;
    public static Double rent;
    public int age;

    // Constructor
    public Tenant(String name, int age, double rent){
        this.name = name;
        this.age = age;
        this.rent = rent;

    }
    public static String toString(){

        return  name + " (" + age + ") | $" + rent + "/mo";
    }

    public static void main(String[] args){

    }

}
