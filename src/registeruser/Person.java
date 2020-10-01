
package registeruser;

    //This is going to be the person informations that
    //the application need to run up 
public class Person {
    
    //Attributes
    private int id;
    private String name;
    private String registerID;
    private String adress;
    private String city;
    private String state;
    
    //Class's constructor
    public Person(String name, String registerID, String adress, String city, String state)
    {
        this.name = name;
        this.registerID = registerID;
        this.adress = adress;
        this.city = city;
        this.state = state;
    }
    
    // Print the informations
    public void printClient(){
        System.out.println("-- User Informations --");
        System.out.println("Name: "+ name);
        System.out.println("Register ID: " + registerID);
        System.out.println("Adress: " + adress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("-----------------------");
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterID() {
        return registerID;
    }

    public void setRegisterID(String registerID) {
        this.registerID = registerID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
    
    
        
