public class Figura {
    int positionX;
    int positionY;

    Figura[][] tab=new Figura[8][8];
    String[][] ColoursTab=new String[8][8];


    public void setStartObjectsPositions(){
    tab[0][0]=Wieza.wieza1Black;
    tab[0][1]=Kon.kon1Black;
    tab[0][2]=Goniec.goniec1Black;
    tab[0][3]=Krol.krol1Black;
    tab[0][4]=Krolowa.krolowa1Black;
    tab[0][5]=Goniec.goniec2Black;
    tab[0][6]=Kon.kon2Black;
    tab[0][7]=Wieza.wieza2Black;

    tab[1][0]=PionekPrime.pionekPrimeBlack;
    tab[1][1]=Pionek.pionek1Black;
    tab[1][2]=Pionek.pionek2Black;
    tab[1][3]=Pionek.pionek3Black;
    tab[1][4]=Pionek.pionek4Black;
    tab[1][5]=Pionek.pionek5Black;
    tab[1][6]=Pionek.pionek6Black;
    tab[1][7]=Pionek.pionek7Black;


    tab[7][0]=Wieza.wieza1White;
    tab[7][1]=Kon.kon1White;
    tab[7][2]=Goniec.goniec1White;
    tab[7][3]=Krol.krol1White;
    tab[7][4]=Krolowa.krolowa1White;
    tab[7][5]=Goniec.goniec2White;
    tab[7][6]=Kon.kon2White;
    tab[7][7]=Wieza.wieza2White;

    tab[6][0]=PionekPrime.pionekPrimeWhite;
    tab[6][1]=Pionek.pionek1White;
    tab[6][2]=Pionek.pionek2White;
    tab[6][3]=Pionek.pionek3White;
    tab[6][4]=Pionek.pionek4White;
    tab[6][5]=Pionek.pionek5White;
    tab[6][6]=Pionek.pionek6White;
    tab[6][7]=Pionek.pionek7White;

    //Colours
        for (int i = 0; i < ColoursTab.length; i++) {
            ColoursTab[0][i]="Black";
        }
        for (int i = 0; i < ColoursTab.length; i++) {
            ColoursTab[1][i]="Black";
        }
        for (int i = 0; i < ColoursTab.length; i++) {
            ColoursTab[6][i]="White";
        }
        for (int i = 0; i < ColoursTab.length; i++) {
            ColoursTab[7][i]="White";
        }
    }//setStartPosition





    public void setTab(int x,int y, Figura figura) {
        this.tab[x][y]=figura;
    }//setTab
    public void setTabNull(int x, int y){
        this.tab[x][y]=null;
    }//setTabNull
    public Figura getFigura(int x, int y){
        Figura f=this.tab[x][y];
        return f;
    }//getFigura

    public void setStringTab(int x, int y, String colour){this.ColoursTab[x][y]=colour;}//setStringTab
    public void setColoursTabNull(int x, int y){this.ColoursTab[x][y]=null;}//setColoursTabNull
    public String getColoursTab(int x ,int y){
        String s=this.ColoursTab[x][y];
        return s;
    }//getColoursTab

    public void print2DObjectsArray() {
        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[i].length; j++) {
                if (this.tab[i][j] != null) {
                    System.out.print(this.tab[i][j].getClass().getSimpleName());
                } else {
                    System.out.print("null");
                }
                if (j < this.tab[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
    }
    public void print2DStringArray(){
        for (int i = 0; i < this.ColoursTab.length; i++) {
            for (int j = 0; j < this.ColoursTab[i].length; j++) {
                if (this.ColoursTab[i][j] == null) {
                    System.out.print("null ");
                } else {
                    System.out.print(this.ColoursTab[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
    }//print2DStringArray

}
