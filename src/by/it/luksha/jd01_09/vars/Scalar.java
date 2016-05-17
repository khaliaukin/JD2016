package by.it.luksha.jd01_09.vars;

public class Scalar extends Var{
    private Double var;

    public Scalar(String var) {
        this.var = Double.parseDouble(var);
    }

    public Scalar(Double var) {
        this.var = var;
    }

    @Override
    public Var add(Var var2) {
        //Var result =
        return null;
    }

    @Override
    public Var sub(Var var2) {
        return null;
    }

    @Override
    public Var mult(Var var2) {
        return null;
    }

    @Override
    public Var div(Var var2) {
        return null;
    }
}
