package introductory;

public class exercisesClass {
    //int n;
    int aux=0;
    int auxAsterisk=1;
    String asterisk="*";

    public exercisesClass(){}


    //Triangle Exercises

    public void exerciseOne(){
        System.out.println("Print one asterisk\n"+asterisk+"\n");
    }

    public void drawHorinzontalLine(int n){
        aux=0;
        while(aux<n){
            System.out.print(asterisk);
            aux++;
        }
    }

    public void drawVerticalLine(int n){
        aux=0;
        while(aux<n){
            System.out.println(asterisk);
            aux++;
        }
    }

    public void drawRightTriangle(int n){
        aux=0;
        while(aux<n){
            auxAsterisk=0;
            while(auxAsterisk<aux+1){
                System.out.print(asterisk);
                auxAsterisk++;
            }
            System.out.print("\n");
            aux++;
        }
    }

}
