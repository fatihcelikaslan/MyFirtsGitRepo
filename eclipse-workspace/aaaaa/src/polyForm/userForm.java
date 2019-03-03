package polyForm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class userForm {
  
  public static void printForm(List<Field> form) {
    System.out.println();
    System.out.println("------------- SIGN UP FORM ------------");
    for (Field field : form) {
      System.out.println(field.displayLabel() + field.displayValue());
    }    
  }
  
  public static void main(String[] args) {
//    Field myField = new Field("Sample Field");
//    
//    System.out.println(myField.getFieldDefinition());
//    
//    System.out.println(myField.displayLabel());
//    Field myField2 = new Field("Another short Label");
//    System.out.println(myField2.displayLabel());
    
    TextField name = new TextField("Name");
    name.setDefaultValue("Full Name");
    name.setValue("Halil Aslan");
    
    System.out.println(name.getFieldDefinition());
    System.out.println(name.displayLabel() + name.displayValue());
    
    TextField company = new TextField("Company");
    company.setDefaultValue("Company Name");
    //name.setValue("Halil Aslan");
    System.out.println(company.displayLabel() + company.displayValue());
    
    System.out.println("------------- SIGN UP FORM ------------");
    
    List<Field> signUpForm = new ArrayList<>();
    signUpForm.add(name);
    signUpForm.add(company);
    
    for (Field field : signUpForm) {
      System.out.println(field.getFieldDefinition());
    }
    
    printForm(signUpForm);
    
    EmailField email = new EmailField("Email");
    email.setDefaultValue("user@domain.com");
    
    signUpForm.add(email);
    
    PasswordField password = new PasswordField("Password");
    password.setDefaultValue("Enter password");
    
    signUpForm.add(password);
    
    printForm(signUpForm);
    
    Field size = new NumberField("Company Size");
    size.setDefaultValue("Number of Employees");
    signUpForm.add(size);
    
    Field phone = new PhoneField("Phone");
    phone.setDefaultValue("Phone Number");
    signUpForm.add(phone);
    
    printForm(signUpForm);
    
    Field likely = new PercentField("Likely to buy");
    likely.setDefaultValue(99);
    signUpForm.add(likely);
    
    printForm(signUpForm);
    
    System.out.println("-------------------------------------");
    
    Scanner sc = new Scanner(System.in);
    
    for (Field field:signUpForm) {
      do {
        System.out.print(field.displayLabel());
        String str = sc.nextLine();
        field.setValue(str);
        System.out.println(field.displayLabel() + field.displayValue());
      } while(!field.isValid());
    }
    
    
    
  }
}