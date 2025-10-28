
package adminstrator.model;

import java.util.Date;
import java.util.Objects;
import user.Person;

public class Employee extends Person{
    private String nameTK;
    private String password;

    public Employee(String nameTK, String password, String name, 
                    Date dob, String address, String phone, String gender) 
    {
        super(name, dob, address, phone, gender);
        this.nameTK = nameTK;
        this.password = password;
    }

    public Employee(String nameTK, String password) {
        this.nameTK = nameTK;
        this.password = password;
    }

    public String getNameTK() {
        return nameTK;
    }

    public void setNameTK(String nameTK) {
        this.nameTK = nameTK;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.nameTK.toLowerCase(), other.nameTK.toLowerCase())) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Employee{" + "nameTK=" + nameTK + ", password=" + password + '}';
    }

}
