package by.it.sinkevich.jd01_02;

import java.io.IOException;

class TaskB {

    void isKBetweenMN() throws IOException {
        System.out.print("Введите целое число: ");
        int k = Util.getInt();
        System.out.print("Введите первую границу интервала: ");
        int border1 = Util.getInt();
        System.out.print("Введите вторую границу интервала: ");
        int border2 = Util.getInt();
        if (k < Math.min(border1, border2) || k > Math.max(border1, border2)) {
            System.out.printf("Число %d, не попадает в заданный интервал.%n", k);
        } else {
            System.out.printf("Число %d, попадает в заданный интервал.%n", k);
        }
    }

    int[][] counterMatrix() throws IOException {
        System.out.print("Введите целое число: ");
        int k = Util.getInt();
        int matrixSize = (int) (Math.ceil(Math.sqrt(k)));
        int[][] result = new int[matrixSize][matrixSize];
        int counter = 0;
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                result[row][col] = ++counter;
                if (counter == k) break;
            }
            if (counter == k) break;
        }
        return result;
    }

    void findSquareRoots(int a, int b, int c) {
        if (a == 0 && b != 0) {
            double root = - c / b;
            System.out.println("Корень уравнения равен: " + root);
            return;
        } else if (a == 0) {
            System.out.println("Введены неправильные входные данные!");
            return;
        }
        double discr = b * b - 4 * a * c;
        if (discr > 0) {
            double root1 = (- b + discr) / (2 * a);
            double root2 = (- b - discr) / (2 * a);
            System.out.printf("Корни квадратного уравнения: Х1 = %-6.2f и Х2 = %-6.2f%n", root1, root2);
        } else if (discr < 0) {
            System.out.println("Квадратное уравнение не имеет корней");
        } else {
            double root = - b / (2 * a);
            System.out.printf("Корни квадратного уравнения: Х1 = Х2 = %-6.2f%n", root);
        }
    }

    void getMonthFromInt(int number) {
        switch (number) {
            case 1: {
                System.out.println("Январь");
                break;
            }
            case 2: {
                System.out.println("Февраль");
                break;
            }
            case 3: {
                System.out.println("Март");
                break;
            }
            case 4: {
                System.out.println("Апрель");
                break;
            }
            case 5: {
                System.out.println("Май");
                break;
            }
            case 6: {
                System.out.println("Июнь");
                break;
            }
            case 7: {
                System.out.println("Июль");
                break;
            }
            case 8: {
                System.out.println("Август");
                break;
            }
            case 9: {
                System.out.println("Сентябрь");
                break;
            }
            case 10: {
                System.out.println("Октябрь");
                break;
            }
            case 11: {
                System.out.println("Ноябрь");
                break;
            }
            case 12: {
                System.out.println("Декабрь");
                break;
            }
            default: {
                System.out.println("Введено неправильное число, в году 12 месяцев!!!");
            }
        }
    }
}
