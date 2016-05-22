package application;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements ICalculator {
	public Calculator() throws RemoteException {}
	private static final long serialVersionUID = 1L;

	public String plus(BigDecimal a, BigDecimal b) throws RemoteException {
		BigDecimal sum=a.add(b);
		if (isInt(sum))
			return sum.toBigInteger().toString();
		return sum.toString();
	}
	public String minus(BigDecimal a, BigDecimal b) throws RemoteException {
		BigDecimal sub=a.subtract(b);
		if (isInt(sub))
			return sub.toBigInteger().toString();
		return sub.toString();
	}
	public String multiplication(BigDecimal a, BigDecimal b) throws RemoteException {
		BigDecimal multp=a.multiply(b);
		if (isInt(multp))
			return multp.toBigInteger().toString();
		return multp.toString();
	}
	public String division(BigDecimal a, BigDecimal b) throws RemoteException {
		if (b.equals(BigDecimal.ZERO))
			return "Error";
		BigDecimal div=a.divide(b);
		if (isInt(div))
			return div.toBigInteger().toString();
		return String.format("%.2f", div);
	}
	public String involution(BigDecimal a, BigDecimal b) throws RemoteException {
		BigDecimal inv=new BigDecimal(Math.pow(a.doubleValue(), b.doubleValue()));
		if (isInt(inv))
			return inv.toBigInteger().toString();
		return inv.toString();
	}
	public String factorial(BigDecimal a, BigDecimal b) throws RemoteException {
		if (a.compareTo(BigDecimal.ZERO)==0 || a.compareTo(BigDecimal.ZERO)==1 && isInt(a))
			return ""+fact(a.intValue());
		return "Error";
	}
	public String reversal(BigDecimal a, BigDecimal b) throws RemoteException {
		if (a.equals(BigDecimal.ZERO))
			return "Error";
		else
		{
			BigDecimal rev=BigDecimal.ONE.divide(a,6,RoundingMode.HALF_UP);
			if (isInt(rev))
				return rev.toBigInteger().toString();
			return rev.toString();
		}
	}
	public String radical(BigDecimal a, BigDecimal b) throws RemoteException {
		if (a.compareTo(BigDecimal.ZERO)==0 || a.compareTo(BigDecimal.ZERO)==-1)
			return "Error";
		else
		{
			BigDecimal rad=new BigDecimal(Math.sqrt(a.doubleValue()));
			if (isInt(rad))
				return rad.toBigInteger().toString();
			return String.format("%.2f", rad);
		}
	}
	public String percentage(BigDecimal a,BigDecimal b) throws RemoteException {
		BigDecimal perct=a.divide(BigDecimal.valueOf(100));
		return perct.toString();
	}
	public boolean isInt(BigDecimal a) throws RemoteException {
		if (a.scale()==0)
			return true;
			return false;
	}
	public BigInteger fact(int a) throws RemoteException {
		BigInteger factorial=BigInteger.ONE;
		BigInteger factz=BigInteger.valueOf(a);
		if (a==0)
			return factorial;
		else
			return factz.multiply(fact(a-1));
	}

}