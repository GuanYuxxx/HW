/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;

/**
 *
 * @author user
 */
public class D2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory friesFac = new FrenchFriesFactory();
        Product fries = friesFac.getProduct();
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽");

        fries.describe();//我是有鹽巴薯條
        myfries.describe();//我是無鹽的薯條
    }
    
}
