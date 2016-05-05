package by.it.drachyova.jd01_02;

class TaskC {

    //метод транспонирует матрицу и выводит ее в консоль
    static void transpMatrix(int array[][]){
        int[][] result = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[j][i] = array[i][j];
                result[i][j] = array[j][i];
            }
        }
        Util.showMatrix(result);
    }
}
