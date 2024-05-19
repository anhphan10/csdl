/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author admin
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      frqlhv fr = new frqlhv();
//      fr.show(); 
        frqlhv  fr = new frqlhv();
        fr.setVisible(true);
 
        dbconnection db = new dbconnection();
        db.getConnect();
    }

}
