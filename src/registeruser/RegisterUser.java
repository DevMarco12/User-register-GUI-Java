
package registeruser;

public class RegisterUser {

    public static void main(String[] args) {
        
        UserRegisterGUI forms = new UserRegisterGUI();
        forms.setVisible(true);
        Person client = new Person(forms.name, forms.registerID, forms.adress, forms.city, forms.state);
        
        }     
    }
