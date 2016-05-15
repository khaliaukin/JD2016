package by.it.sereda.jd01_05.math;

import java.math.BigDecimal;

import static java.lang.Math.*;
/**
 * Created by Igor on 12.05.2016.
 */
public class Task7 {
    public static double[] arrayrandom (int arrayrandomsize, int randommin, int randommax) {
        double[] arrayrandom= new double[arrayrandomsize];
        for (int i=0; i<arrayrandomsize; i++){
            double temp = randommin + (Math.random() * (randommax - randommin));
            arrayrandom[i] = BigDecimal.valueOf(temp).setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue();
        }
        return arrayrandom;
    }
}
