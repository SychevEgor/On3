package Calculate;

public class Ratio extends Digit{
    public Ratio(float real) {
        super.real = real;
}
    @Override
    public String toString() {
        return Float.toString(real);
    }
}