/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import javax.swing.*;
/**
 *
 * @author khanhnguyen
 */
public class testjframe {
    public static void main(String[] args){
       JFrame frame = new JFrame("Ví dụ JTabbedPane");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel tab1 = new JPanel();
        tab1.add(new JLabel("Đây là nội dung Tab 1"));

        JPanel tab2 = new JPanel();
        tab2.add(new JLabel("Đây là nội dung Tab 2"));

        // Thêm các tab vào JTabbedPane
        tabbedPane.addTab("Tab 1", tab1);
        tabbedPane.addTab("Tab 2", tab2);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);           
    }
}
