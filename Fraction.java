public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }    
    @Override
    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }    
    @Override
    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }
    
    // Your work here!

    // Add two fractions  
    public Fraction add(Fraction other) {   
        long commonDenominator = this.bottom * other.bottom;  
        long numeratorSum = (this.top * other.bottom) + (other.top * this.bottom);  
        return new Fraction(numeratorSum, commonDenominator);  
    }  

    public long gcd(long a, long b) {  
        return b == 0 ? a : gcd(b, a % b);   
    }  

    // Make this class string representable  
    @Override  
    public String toString() {  
        long divisor = gcd(this.top, this.bottom); 
        System.out.println((this.top / divisor) + "/" + (this.bottom / divisor));
        return (this.top / divisor) + "/" + (this.bottom / divisor);  
}  
}