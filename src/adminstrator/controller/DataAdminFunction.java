
package adminstrator.controller;

import adminstrator.model.Employee;
import java.util.ArrayList;
import registerbook.model.RegisterBook;

public interface DataAdminFunction {
    
    void readListAdmin(ArrayList<Employee> listE);
    int updateAdmin(Employee emp);
    Employee existAccountAdminSQL(String tk, String mk);
    boolean checkExistTKAdminSQL(String tk);
    int writeRegisterBookSQL(RegisterBook rb);
    void writeRegisterAdminSQL(Employee newEmployee);
    
}
