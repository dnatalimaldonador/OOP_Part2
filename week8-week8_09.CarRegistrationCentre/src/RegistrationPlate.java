
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }
    
    

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        if (this.country == null){
            return 0000001;
        }
        else if(this.regCode == null){
            return 0000002;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegistrationPlate other = (RegistrationPlate) obj;
        
        if (!this.country.equals(other.getCountry())) {
            return false;
        }
        if (!this.regCode.equals(other.getRegCode())) {
            return false;
        }
        return true;
    }
    
    
}