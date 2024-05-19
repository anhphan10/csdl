/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author admin
 */
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class dbconnection {
    
    //Ham Ket Noi
    public Connection getConnect() {
        String ulr = "jdbc:mysql://localhost:3306/qlhocvien";
        String user = "root";
        String password = "";
        Connection ketNoi = null;
        try {
            ketNoi = DriverManager.getConnection(ulr, user, password);
            System.out.println("Ket Noi Thanh Cong");

        } catch (SQLException e) {
            System.out.println("Loi" + e.toString());
        }
        return ketNoi;
    }
        //Ham Doc Du Lieu
    public ResultSet getData(String sql) {
        ResultSet kq = null;
        try {
            Statement st = getConnect().createStatement();
            kq = st.executeQuery(sql);
        }
        catch(Exception e){
            System.out.println("Loi" + e.toString());
        }
        return kq;
    }
    
    //Ham lay thong tin hoc vien
    public ResultSet getttHV(){
        String sql = "select * from hocvien";
        return getData(sql);    
    }
    
    public ResultSet timKiem(String ten){
        String sql = "Select * from hocvien where tenHV like N'%" + ten + "%'";
        return getData(sql);
    }
    
}




