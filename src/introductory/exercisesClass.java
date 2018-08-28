package introductory;

public class exercisesClass {
    //int n;
    int aux=0;
    int auxAsteriskDraw =1, auxAsteriskOdd;
    int auxSpaces;
    String asterisk="*";

    public exercisesClass(){}


    //TRIANGLE EXERCISES

    public void exerciseOne(){
        System.out.println("Print one asterisk\n"+asterisk+"\n");
    }

    public void drawHorinzontalLine(int n){
        aux=0;
        while(aux<n){
            System.out.println(asterisk);
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
            auxAsteriskDraw =0;
            while(auxAsteriskDraw <aux+1){
                System.out.print(asterisk);
                auxAsteriskDraw++;
            }
            System.out.print("\n");
            aux++;
        }
    }

    //DIAMOND EXERCISES

    public void isoscelesTriangle(int n){
        aux=1;
        auxAsteriskOdd=1;
        auxSpaces=n-1;
        while(aux<=n){
            auxAsteriskDraw =1;
            while(auxSpaces>=0){
                System.out.print(" ");
                auxSpaces--;
            }
            while(auxAsteriskDraw <=auxAsteriskOdd){
                System.out.print(asterisk);
                auxAsteriskDraw++;
            }
            System.out.print("\n");
            aux++;
            auxSpaces=n-aux;
            auxAsteriskOdd=auxAsteriskOdd+2;
        }
    }

    public void drawDiamond(int n){
        aux=1;
        auxAsteriskOdd=1;
        auxSpaces=n-1;
        int auxSpacesDraw=1;
        //Upper triangle
        while(aux<=n){
            auxAsteriskDraw =1;
            while(auxSpaces>=0){
                System.out.print(" ");
                auxSpaces--;
            }
            while(auxAsteriskDraw <=auxAsteriskOdd){
                System.out.print(asterisk);
                auxAsteriskDraw++;
            }
            System.out.print("\n");
            aux++;
            auxSpaces=n-aux;
            auxAsteriskOdd=auxAsteriskOdd+2;
        }

        //Lower triangle
        while(aux>=1){
            auxAsteriskDraw =1;
            auxSpaces=0;
            while(auxSpaces<=auxSpacesDraw){
                System.out.print(" ");
                auxSpaces++;
            }
            while(auxAsteriskDraw<=auxAsteriskOdd-4){
                System.out.print(asterisk);
                auxAsteriskDraw++;
            }
            System.out.print("\n");
            aux--;
            auxSpaces=aux-n;
            auxAsteriskOdd=auxAsteriskOdd-2;
            auxSpacesDraw++;
        }
    }

    public void drawDiamondWithName(int n){
        aux=1;
        auxAsteriskOdd=1;
        auxSpaces=n-1;
        int auxSpacesDraw=1;
        //Upper triangle
        while(aux<=n){
            auxAsteriskDraw =1;
            while(auxSpaces>=0){
                System.out.print(" ");
                auxSpaces--;
            }
            if(aux==n){
                System.out.print("Megan");
            }else{
                while(auxAsteriskDraw <=auxAsteriskOdd){
                    System.out.print(asterisk);
                    auxAsteriskDraw++;
                }
            }
            System.out.print("\n");
            aux++;
            auxSpaces=n-aux;
            auxAsteriskOdd=auxAsteriskOdd+2;
        }

        //Lower triangle
        while(aux>=1){
            auxAsteriskDraw =1;
            auxSpaces=0;
            while(auxSpaces<=auxSpacesDraw){
                System.out.print(" ");
                auxSpaces++;
            }
            while(auxAsteriskDraw<=auxAsteriskOdd-4){
                System.out.print(asterisk);
                auxAsteriskDraw++;
            }
            System.out.print("\n");
            aux--;
            auxSpaces=aux-n;
            auxAsteriskOdd=auxAsteriskOdd-2;
            auxSpacesDraw++;
        }

    }



}
