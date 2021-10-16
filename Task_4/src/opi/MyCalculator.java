package opi;
import java.math.BigInteger;
public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                sum+=i;
                System.out.print(i+" ");
            }
        }
        return sum;
    }
    @Override
    public BigInteger findFactorial(int n)
    {
        BigInteger fac= BigInteger.ONE;
        for(int i=1; i<=n; i++)
        {
            fac=fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
}
