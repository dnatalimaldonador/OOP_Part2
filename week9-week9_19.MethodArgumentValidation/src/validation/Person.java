package validation;

public class Person {

    private String name;
    private int age;

    
    public Person(String name, int age) {
       
        if(name == null){
            throw new IllegalArgumentException("Argurments are not correct");
        }
        else if(name.length() >40 || name.isEmpty() || age<0 || age>120){
            throw new IllegalArgumentException("Argurments are not correct");
        }
        
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
