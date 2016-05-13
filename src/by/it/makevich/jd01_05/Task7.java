package by.it.makevich.jd01_05;

public class Task7 {
	protected static double[] getRandomArray(){
		int arrayLength= 29;
		double[] m=new double[arrayLength];
		for (int j=0;j<m.length;j++){
			m[j]=Math.random() * 2 + 7;
			m[j]=Math.round(m[j]*100.0)/100.0;
		}
		return m;
	}
	protected static int count(double[]arrayM){
		int count=0;
		int res=0;
		double fraction=0.0;
		for (int i=0;i<arrayM.length;i++){
			res = (int) arrayM[i]; //целая часть
			fraction = arrayM[i] - res; //дробная часть
			if(fraction>i*2.0/100.0){
				count++;
			}else continue;
		}
		return count;
	}
	protected static double[] getArrayKFromArrayM(double[] arrayM, int count){
		int res=0;
		double fraction=0.0;
		int j=0;
		double[] arrayK=new double[count];
		for (int i=0;i<arrayM.length;i++) {
			res = (int) arrayM[i]; //целая часть
			fraction = arrayM[i] - res; //дробная часть
			if(fraction>i*2.0/100.0){
				arrayK[j]=arrayM[i];
				j++;
			}else continue;

		}
		double temp=0.0;
		for (int k=0;k<arrayK.length-1;k++){
			for (int l=k+1;l<arrayK.length;l++){
				if(arrayK[k]<arrayK[l]){
					temp=arrayK[k];
					arrayK[k]=arrayK[l];
					arrayK[l]=temp;
				}
			}
		}


		return arrayK;
	}

	protected static void printArrayM(double[] array){

		int l=0;
		for (int i=0;i<6;i++){
			for (int j=0;j<array.length/5;j++) {

				if (l<array.length) {

					System.out.format("%-4s%-2s%-2s%6s%2s", "| M[", l, "]=", array[l], " |");
					l++;

				}
			}
			System.out.println();
		}
	}
	protected static void printArrayK(double[] array){

		int l=0;
		for (int i=0;i<6;i++){
			for (int j=0;j<array.length/5;j++) {

				if (l<array.length) {

					System.out.format("%-4s%-2s%-2s%6s%2s", "| M[", l, "]=", array[l], " |");
					l=l+6;

				}
			}
			System.out.println();
		}
	}
}
