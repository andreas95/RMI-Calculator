package application;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote{
	public String plus(BigDecimal a,BigDecimal b) throws RemoteException;
	public String minus(BigDecimal a,BigDecimal b) throws RemoteException;
	public String multiplication(BigDecimal a,BigDecimal b) throws RemoteException;
	public String division(BigDecimal a,BigDecimal b) throws RemoteException;
	public String involution(BigDecimal a,BigDecimal b) throws RemoteException;
	public String factorial(BigDecimal a,BigDecimal b) throws RemoteException;
	public String reversal(BigDecimal a,BigDecimal b) throws RemoteException;
	public String radical(BigDecimal a,BigDecimal b) throws RemoteException;
	public boolean isInt(BigDecimal a) throws RemoteException;
	public BigInteger fact(int a) throws RemoteException;
	public String percentage(BigDecimal a,BigDecimal b) throws RemoteException;
}
