import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame  {
    private static final long serialVersionUID = 1L;
    private static final int ROWS = 8, COLUMNS = 8;
    private JButton[][] squares = new JButton[ROWS][COLUMNS];
    private JButton selectedButton = null;
    private ImageIcon selectedIcon = null;
    Images images=new Images();
    Color def;

    public Board() {

        setLayout(new GridLayout(ROWS, COLUMNS));
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                squares[i][j] = new JButton();
                squares[i][j].setBackground((i + j) % 2 == 0 ? new Color(227,193,111) : new Color(184,139,74));
                squares[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = (JButton) e.getSource();
                        if (selectedButton == null) {
                            if (clickedButton.getIcon()!=null){
                            // First button clicked
                            selectedButton = clickedButton;
                            selectedIcon = (ImageIcon) selectedButton.getIcon();
                            def=selectedButton.getBackground();
                            selectedButton.setBackground(Color.YELLOW);
                            }
                        } else {
                            // Second button clicked
                            if (selectedButton!=clickedButton) {
                                selectedButton.setIcon(null);
                                clickedButton.setIcon(selectedIcon);
                                selectedButton.setBackground((getRow(selectedButton) + getColumn(selectedButton)) % 2 == 0 ? new Color(227, 193, 111) : new Color(184, 139, 74));
                            }else {selectedButton.setBackground(def);}
                            selectedButton = null;
                        }
                    }
                });
                add(squares[i][j]);
            }
        }
    }

    public void setSquareIcon(int row, int column, ImageIcon icon) {
        squares[row][column].setIcon(icon);
    }
    public void setStartLocation(){
        squares[0][0].setIcon(images.wiezaBlack);
        squares[0][1].setIcon(images.konBlack);
        squares[0][2].setIcon(images.goniecBlack);
        squares[0][3].setIcon(images.krolBlack);
        squares[0][4].setIcon(images.krolowaBlack);
        squares[0][5].setIcon(images.goniecBlack);
        squares[0][6].setIcon(images.konBlack);
        squares[0][7].setIcon(images.wiezaBlack);
        for (int i=0;i<8;i++){
            squares[1][i].setIcon(images.pionekBlack);
        }
        squares[7][0].setIcon(images.wiezaWhite);
        squares[7][1].setIcon(images.konWhite);
        squares[7][2].setIcon(images.goniecWhite);
        squares[7][3].setIcon(images.krolWhite);
        squares[7][4].setIcon(images.krolowaWhite);
        squares[7][5].setIcon(images.goniecWhite);
        squares[7][6].setIcon(images.konWhite);
        squares[7][7].setIcon(images.wiezaWhite);
        for (int i=0;i<8;i++){
            squares[6][i].setIcon(images.pionekWhite);
        }
    }//setStartIcon

    private int getRow(JButton button) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (squares[i][j] == button) {
                    return i;
                }
            }
        }
        return -1; // button not found
    }
    private int getColumn(JButton button) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (squares[i][j] == button) {
                    return j;
                }
            }
        }
        return -1; // button not found
    }

}
