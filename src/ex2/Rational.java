package ex2;

public class Rational
{
    private int p;
    private int q;

    public Rational(int p1 ,int q1)
    {
        this.p = p1;
        this.q = q1;
    }
    public Rational divide( Rational obg)
    {
        int pr = this.p* obg.q;
        int qr = this.q* obg.p;
        return  new Rational(pr,qr);
    }
    public Rational multiply( Rational obg)
    {
        int pr = this.p * obg.p;
        int qr = this.q * obg.q;
        return new Rational(pr,qr);
    }

    public Rational minus( Rational obg)
    {
        int pr = (this.p * obg.q) - (this.q + obg.p);
        int qr = this.q * obg.q;
        return new Rational(pr,qr);
    }

    public Rational plus( Rational obg)
    {
        int pr = this.p * obg.p;
        int qr = this.q * obg.q;
        return new Rational(pr, qr);
    }
    public boolean equals(Object o) {
        if (!(o instanceof Rational))
            return false;
        Rational r = (Rational)o;
        return this.p == (r.p) && this.q == (r.q);
    }
}

