
package registerbook.controller;


import java.util.ArrayList;
import registerbook.model.RegisterBook;

public interface DataRegisterBookFuction {
    
    void readRegisterBookSQL(ArrayList<RegisterBook> listRb);
    int writeRegisterBookSQL(RegisterBook rb);
    int updateRegisterBookSQL(RegisterBook rb,String bookId, String studentId);
    int deleteRegisterBookSQL(RegisterBook rb);
    ArrayList<RegisterBook> seachByStudentId(ArrayList<RegisterBook> listRb,String studentId);
    ArrayList<RegisterBook> seachByBookId(ArrayList<RegisterBook> listRb, String bookId);
    ArrayList<RegisterBook> seachByGiveBookBack(ArrayList<RegisterBook> listRb, String gbb);
    
}
