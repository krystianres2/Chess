import javax.swing.*;

public class Main {
    public static void main(String[]args){
        Board board=new Board();
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setSize(700, 700);
        board.setVisible(true);
        board.setStartLocation();



    }
}
