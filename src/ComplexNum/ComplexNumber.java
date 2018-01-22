package ComplexNum;

@SuppressWarnings("WeakerAccess")
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof ComplexNumber){
            ComplexNumber tmp = (ComplexNumber)anObject;
            return Double.compare(this.getIm(), tmp.getIm()) == 0 && Double.compare(this.getRe(), tmp.getRe()) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
