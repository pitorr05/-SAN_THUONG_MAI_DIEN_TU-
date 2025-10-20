/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 *
 * @author lehailongt
 */

public class databaseConnection {
    private final String USER_NAME = "root";
    private final String PASSWD = "lehailongt";
    private final String DB_NAME = "QLTV";
    private final int PORT = 3306;
    private final String SERVER_NAME = "localhost";
    
    public databaseConnection(){};
    
    public MysqlDataSource ketNoiSQL() {
        MysqlDataSource data = new MysqlDataSource();
        data.setUser(USER_NAME);
        data.setPassword(PASSWD);
        data.setDatabaseName(DB_NAME);
        data.setPortNumber(PORT);
        data.setServerName(SERVER_NAME);
        return data;
    }
}
