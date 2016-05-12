package by.it.kushel.jd01_05;

/**
 * Created by Diomn on 05.05.2016.
 */
public class InOut {
    public  static  void  arrayPrint(double[] mas, String name, int cols){
        int col=0;
        for(int i=0; i<mas.length; i++){
            System.out.print(name);
            System.out.printf("[%-1d]=%-7.2f",i,mas[i]);
            col++;
            if((0==col%cols)||(mas.length-1==i)){
                System.out.println();
            }
        }
    }
    public  static  void  arrayPrint2D(double[][] mas){
        for(int i=0; i<mas.length; i++){
            for(int j =0; j<mas.length; j++){
                System.out.printf("%6.2f", mas[i][j]);

            }
            System.out.println();
        }
    }
}
