package by.it.sinkevich.jd01_09.variables;

/**
 * Created by Computer on 16.05.2016.
 *
 * @author Sinkevich Denis
 */
public class MathLabFloat extends MathLabVariable {

    private Double value;

    public MathLabFloat() {
        value = 0.0;
    }

    public MathLabFloat(Double value) {
        this.value = value;
    }

    public MathLabFloat(String value) {
        this.value = Double.valueOf(value);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
