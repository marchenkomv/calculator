public class IntsCalculator implements Ints {

    public int sum(int arg0, int arg1) {
        return (int) new Calculator()
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    public int mult(int arg0, int arg1) {
        return (int) new Calculator()
                .newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    public int pow(int a, int b) {
        return (int) new Calculator()
                .newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}