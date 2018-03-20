import javax.swing.*;

public class real {
    public static void main(String[] args) {
        JOptionPane.showInputDialog("price");
        JOptionPane.showInputDialog("itemSize");
        JOptionPane.showInputDialog("propertyType");
        realestate Land, House;
       Land=new realestate(8000, 2.5, "my land");
       House=new realestate(800, 23, "Barren",20,10);
        JOptionPane.showMessageDialog(null, Land.toString());
        JOptionPane.showMessageDialog(null, House.toString());
        
    }
}
