package application;

import java.math.BigDecimal;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Client {
	private ICalculator serv;
public Client(){

		IGenerator Ob = null;
		//ICalculator serv = null;
		String url = "rmi://localhost:1099/Calculator";
		try {
			Ob = (IGenerator) Naming.lookup(url);
		} catch (Exception e) {
			System.out.println("Conectare esuata...");
			System.exit(0);
		}

		try {
			serv = Ob.server_propriu();
		} catch (Exception e) {
		}
}
	
	public String operation(String op, BigDecimal a, BigDecimal b) throws RemoteException {
		switch (op){
		case "+": {
			return serv.plus(a, b);
		}
		case "-":{
			return serv.minus(a, b);
		}
		case "*":{
			return serv.multiplication(a, b);
		}
		case "/":{
			return serv.division(a, b);
		}
		case "!":{ 
			return serv.factorial(a, b);
		}
		case "^":{
			return serv.involution(a, b);
		}
		case "rev":{
			return	serv.reversal(a, b);
		}
		case "sqrt":{
			return serv.radical(a, b);
		}
		case "%":{
			return serv.percentage(a,b);
		}
		default:return "NULL";
		}
		
		
	}
}
