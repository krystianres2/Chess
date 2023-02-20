import javax.swing.*;
import java.awt.*;

public class Images {

    //black
    private ImageIcon icon1=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Goniec.jpg");
    ImageIcon goniecBlack=new ImageIcon(getScaledImage(icon1));
    private ImageIcon icon2=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Koń.jpg");
    ImageIcon konBlack=new ImageIcon(getScaledImage(icon2));
    private ImageIcon icon3=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Król.jpg");
    ImageIcon krolBlack=new ImageIcon(getScaledImage(icon3));
    private ImageIcon icon4=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Królowa.PNG");
    ImageIcon krolowaBlack=new ImageIcon(getScaledImage(icon4));
    private ImageIcon icon5=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Pionek.jpg");
    ImageIcon pionekBlack=new ImageIcon(getScaledImage(icon5));
    private ImageIcon icon6=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Czarne\\Wieża.jpg");
    ImageIcon wiezaBlack=new ImageIcon(getScaledImage(icon6));

    //white
    private ImageIcon icon7=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Goniec.PNG");
    ImageIcon goniecWhite=new ImageIcon(getScaledImage(icon7));
    private ImageIcon icon8=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Koń.jpg");
    ImageIcon konWhite=new ImageIcon(getScaledImage(icon8));
    private ImageIcon icon9=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Król.jpg");
    ImageIcon krolWhite=new ImageIcon(getScaledImage(icon9));
    private ImageIcon icon10=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Królowa.jpg");
    ImageIcon krolowaWhite=new ImageIcon(getScaledImage(icon10));
    private ImageIcon icon11=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Pionek.jpg");
    ImageIcon pionekWhite=new ImageIcon(getScaledImage(icon11));
    private ImageIcon icon12=new ImageIcon("C:\\Users\\w65551\\Desktop\\Pionki\\Białe\\Wieża.PNG");
    ImageIcon wiezaWhite=new ImageIcon(getScaledImage(icon12));

    //functions
    private static Image getScaledImage(ImageIcon icon) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return scaledImage;
    }//getScaledImage
}