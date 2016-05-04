package by.it.drachyova.jd01_02;

class TaskB {

    static void isItInRange(int number, int start, int end){
        if(number>=start&&number<=end) {
            System.out.println("Число "+number+" принадлежит диапазону ["+start+","+end+"]");
        }
        else
            System.out.println("Число "+number+" не принадлежит диапазону ["+start+","+end+"]");

    }

    static void toMatrix(int k, int n){
        int[][] array = new int[n][n];
        int l=1;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                if(l<=k)
                    array[i][j] = l++;
                else break;
        }
       Util.showMatrix(array);
    }

    static void adjustRoots(int a, int b, int c){
        int discriminant = b*b-(4*a*c);
        if(discriminant < 0){
            System.out.println("Корней нет!");
        }
        else if (discriminant == 0){
            double d = Math.sqrt(discriminant);
            double x = (-b+d)/2*a;
            System.out.printf("x = "+x);
        }
        else if(discriminant > 0) {
            double d = Math.sqrt(discriminant);
            double x1 = (-b + d) / 2 * a;
            double x2 = (-b - d) / 2 * a;
            System.out.println("X1= " + x1 + " X2= " + x2);
        }
    }

     static void whatMonthIsIt(int month){
         switch (month){
             case 1:
                 System.out.println("Месяц №"+month+" это "+"Январь");
                 break;
             case 2:
                 System.out.println("Месяц №"+month+" это "+"Февраль");
                 break;
             case 3:
                 System.out.println("Месяц №"+month+" это "+"Март");
                 break;
             case 4:
                 System.out.println("Месяц №"+month+" это "+"Апрель");
                 break;
             case 5:
                 System.out.println("Месяц №"+month+" это "+"Май");
                 break;
             case 6:
                 System.out.println("Месяц №"+month+" это "+"Июнь");
                 break;
             case 7:
                 System.out.println("Месяц №"+month+" это "+"Июль");
                 break;
             case 8:
                 System.out.println("Месяц №"+month+" это "+"Август");
                 break;
             case 9:
                 System.out.println("Месяц №"+month+" это "+"Сентябрь");
                 break;
             case 10:
                 System.out.println("Месяц №"+month+" это "+"Октябрь");
                 break;
             case 11:
                 System.out.println("Месяц №"+month+" это "+"Ноябрь");
                 break;
             case 12:
                 System.out.println("Месяц №"+month+" это "+"Декабрь");
                 break;
         }
     }
}
