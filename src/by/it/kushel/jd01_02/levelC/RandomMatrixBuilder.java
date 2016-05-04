package by.it.kushel.jd01_02.levelC;


public class RandomMatrixBuilder {
    public static int[][] build(int dimension){
        int[][] array = new int[dimension][dimension];
        for (int i=0; i<dimension; i++){
            for (int j=0; j<dimension; j++){
                array[i][j]=(int)((2*dimension+1)*Math.random())-dimension;
            }
        }
        return array;
    }
}
