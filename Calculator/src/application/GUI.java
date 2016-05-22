package application;

import java.math.BigDecimal;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

public class GUI {
	private static String screen="0";
	private static String a="";
	private static Label result;
	private static String operator="";
	private static Button ac;
	private static boolean operator_enter=false;
public static GridPane api(){
	Client client=new Client();
	GridPane pane=new GridPane();
	pane.setAlignment(Pos.TOP_CENTER);
	//Result Display
	result=new Label("0");
	result.setAlignment(Pos.BOTTOM_RIGHT);
	result.setMinWidth(350);
	result.setMinHeight(100);
	GridPane.setColumnSpan(result, 5);
	pane.add(result, 0, 0);
	//Calculator
	Button off=new Button("OFF");
	off.getStyleClass().add("button-dark-grey");
	off.setOnAction(e->System.exit(-1));
	pane.add(off, 0, 1);
	
	ac=new Button("AC");
	ac.getStyleClass().add("button-dark-grey");
	pane.add(ac,1 ,1 );
	
	Button plus_minus=new Button("+/_");
	plus_minus.getStyleClass().add("button-dark-grey");
	pane.add(plus_minus,2 ,1 );
	
	Button percentage=new Button("%");
	percentage.getStyleClass().add("button-dark-grey");
	pane.add(percentage,3 ,1 );
	
	Button division=new Button("\u00F7");
	division.getStyleClass().add("button-orange");
	pane.add(division,4 ,1 );
	
	Button reversal=new Button("1/x");
	reversal.getStyleClass().add("button-dark-grey");
	pane.add(reversal,0 ,2 );
	
	Button seven=new Button("7");
	seven.setAlignment(Pos.CENTER);
	seven.getStyleClass().add("button-grey");
	pane.add(seven,1 ,2);
	
	Button eight=new Button("8");
	eight.setAlignment(Pos.CENTER);
	eight.getStyleClass().add("button-grey");
	pane.add(eight,2 ,2);
	
	Button nine=new Button("9");
	nine.setAlignment(Pos.CENTER);
	nine.getStyleClass().add("button-grey");
	pane.add(nine,3 ,2);
	
	Button multiplication=new Button("x");
	multiplication.getStyleClass().add("button-orange");
	pane.add(multiplication, 4,2);
	
	Button involution=new Button("x^y");
	involution.getStyleClass().add("button-dark-grey");
	pane.add(involution,0 ,3);
	
	Button four=new Button("4");
	four.setAlignment(Pos.CENTER);
	four.getStyleClass().add("button-grey");
	pane.add(four,1 ,3);
	
	Button five=new Button("5");
	five.setAlignment(Pos.CENTER);
	five.getStyleClass().add("button-grey");
	pane.add(five,2 ,3);
	
	Button six=new Button("6");
	six.setAlignment(Pos.CENTER);
	six.getStyleClass().add("button-grey");
	pane.add(six,3 ,3);
	
	Button minus=new Button("-");
	minus.getStyleClass().add("button-orange");
	pane.add(minus, 4,3);
	
	Button fact=new Button("x!");
	fact.getStyleClass().add("button-dark-grey");
	pane.add(fact,0 ,4);
	
	Button one=new Button("1");
	one.setAlignment(Pos.CENTER);
	one.getStyleClass().add("button-grey");
	pane.add(one,1 ,4);
	
	Button two=new Button("2");
	two.setAlignment(Pos.CENTER);
	two.getStyleClass().add("button-grey");
	pane.add(two,2 ,4);
	
	Button three=new Button("3");
	three.setAlignment(Pos.CENTER);
	three.getStyleClass().add("button-grey");
	pane.add(three,3,4);
	
	Button plus=new Button("+");
	plus.getStyleClass().add("button-orange");
	pane.add(plus, 4,4);
	
	Button radical=new Button("\u221Ax");
	radical.getStyleClass().add("button-dark-grey");
	pane.add(radical, 0,5);
	
	Button zero=new Button("0");
	zero.setAlignment(Pos.CENTER_LEFT);
	zero.setPadding(new Insets(0,0,0,30));
	zero.getStyleClass().add("button-grey");
	zero.setMinWidth(140);
	GridPane.setColumnSpan(zero, 2);  
	pane.add(zero, 1,5);
	
	Button dot=new Button(".");
	dot.setAlignment(Pos.CENTER);
	dot.getStyleClass().add("button-grey");
	pane.add(dot, 3,5);
	
	Button equal=new Button("=");
	equal.getStyleClass().add("button-orange2");
	pane.add(equal, 4,5);
	
	//Actions
		
		ac.setOnAction(e->{
			screen="0";
			a="";
			result.setText(screen);
			ac.setText("AC");
			
		});
		plus_minus.setOnAction(e->{
			if (screen.indexOf("-")<0)
				screen="-"+screen;
				else
					screen=screen.substring(1);
				ac();
				result.setText(screen);
		});
		dot.setOnAction(e->{
			if (screen.indexOf(".")<=0){
			screen+=".";
			ac();
			result.setText(screen);
			}
		});
		one.setOnAction(e->{
			clear();
			if (screen.length()<16){
			screen+="1";
			ac();
			result.setText(screen);
			}
		});
		two.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="2";
			ac();
			result.setText(screen);
				}
		});
		three.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="3";
			ac();
			result.setText(screen);
				}
		});
		four.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="4";
			ac();
			result.setText(screen);
				}
		});
		five.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="5";
			ac();
			result.setText(screen);
				}
		});
		six.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="6";
			ac();
			result.setText(screen);
				}
		});
		seven.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="7";
			ac();
			result.setText(screen);
				}
		});
		eight.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="8";
			ac();
			result.setText(screen);
				}
		});
		nine.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="9";
			ac();
			result.setText(screen);
				}
		});
		zero.setOnAction(e->{
				clear();
				if (screen.length()<16){
			screen+="0";
			ac();
			result.setText(screen);
				}
		});
		plus.setOnAction(e->{
			operator="+";
			operator_enter=true;
			if (a.equals(""))
			a=screen;
			screen="";
		});
		minus.setOnAction(e->{
			operator="-";
			operator_enter=true;
			if (a.equals(""))
			a=screen;
			screen="";
		});
		multiplication.setOnAction(e->{
			operator="*";
			operator_enter=true;
			if (a.equals(""))
			a=screen;
			screen="";
		});
		division.setOnAction(e->{
			operator="/";
			operator_enter=true;
			if (a.equals(""))
			a=screen;
			screen="";
		});
		involution.setOnAction(e->{
			operator="^";
			operator_enter=true;
			if (a.equals(""))
			a=screen;
			screen="";
		});
		equal.setOnAction(e->{
			if (!a.equals("")){
			try {
				if (screen.equals("")){
				a=client.operation(operator, new BigDecimal( Double.parseDouble(a)),new BigDecimal( Double.parseDouble(screen=a)));
				}
				else
					a=client.operation(operator,new BigDecimal( Double.parseDouble(a)),new BigDecimal(Double.parseDouble(screen)));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			result.setText(a);
			}
			});
		fact.setOnAction(e->{
			operator="!";
			operator_enter=true;
			try {
				if (a.equals(""))
				screen=client.operation(operator,new BigDecimal(  Double.parseDouble(screen)), new BigDecimal( Double.parseDouble("0")));
				else {
					a=client.operation(operator,new BigDecimal(  Double.parseDouble(a)), new BigDecimal( Double.parseDouble("0")));
					screen=a;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (screen.length()<16){
			result.setText(screen);
			}
			else
				result.setText("Error");
		});
		percentage.setOnAction(e->{
			operator="%";
			operator_enter=true;
			try {
				if (a.equals(""))
				screen=client.operation(operator, new BigDecimal( Double.parseDouble(screen)), new BigDecimal( Double.parseDouble("0")));
				else {
					a=client.operation(operator, new BigDecimal( Double.parseDouble(a)), new BigDecimal( Double.parseDouble("0")));
					screen=a;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (screen.length()<16){
			result.setText(screen);
			}
			else
				result.setText("Error");
		});
		radical.setOnAction(e->{
			operator="sqrt";
			operator_enter=true;
			try {
				if (a.equals(""))
				screen=client.operation(operator,new BigDecimal(  Double.parseDouble(screen)),new BigDecimal(  Double.parseDouble("0")));
				else {
					a=client.operation(operator,new BigDecimal(  Double.parseDouble(a)),new BigDecimal(  Double.parseDouble("0")));
					screen=a;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (screen.length()<16){
			result.setText(screen);
			}
			else
				result.setText("Error");
		});
		reversal.setOnAction(e->{
			operator="rev";
			operator_enter=true;
			try {
				if (a.equals(""))
					screen=client.operation(operator,new BigDecimal(  Double.parseDouble(screen)),new BigDecimal(  Double.parseDouble("0")));
				else {
				a=client.operation(operator,new BigDecimal(  Double.parseDouble(a)),new BigDecimal(  Double.parseDouble("0")));
				screen=a;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (screen.length()<16){
			result.setText(screen);
			}
			else
				result.setText("Error");
		});
		pane.setOnKeyPressed(new EventHandler<KeyEvent>(){
			public void  handle(KeyEvent keyEvent){
				switch(keyEvent.getCode()){
				case EQUALS:
				case ENTER:{
					equal.fire();
				}break;
				case NUMPAD0:
				case DIGIT0:{
					zero.fire();
				}break;
				case NUMPAD1:
				case DIGIT1:{
					one.fire();
				}break;
				case NUMPAD2:
				case DIGIT2:{
					two.fire();
				}break;
				case NUMPAD3:
				case DIGIT3:{
					three.fire();
				}break;
				case NUMPAD4:
				case DIGIT4:{
					four.fire();
				}break;
				case NUMPAD5:
				case DIGIT5:{
					five.fire();
				}break;
				case NUMPAD6:
				case DIGIT6:{
					six.fire();
				}break;
				case NUMPAD7:
				case DIGIT7:{
					seven.fire();
				}break;
				case NUMPAD8:
				case DIGIT8:{
					eight.fire();
				}break;
				case NUMPAD9:
				case DIGIT9:{
					nine.fire();
				}break;
				case ADD:
				case PLUS:{
					plus.fire();
				}break;
				case SUBTRACT:
				case MINUS:{
					minus.fire();
				}break;
				case DIVIDE:{
					division.fire();
				}break;
				case MULTIPLY:{
					multiplication.fire();
				}break;
				case DECIMAL:
				case PERIOD:{
					dot.fire();
				}break;
				case ESCAPE:{
					System.exit(-1);
				}
				default:break;
				}
			}
		});	
	return pane;
}
public static void ac(){
		if (screen.equals("0"))
			ac.setText("AC");
		else
			ac.setText("C");
}
public static void clear(){
	if (screen.equals("0")||operator_enter)
	{
		operator_enter=false;
		screen="";
	}
}
}
