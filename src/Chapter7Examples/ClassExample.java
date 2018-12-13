package Chapter7Examples;

import java.util.Scanner;

/*
 * Alanna Botscharow
 * 12/18
 */
public class ClassExample {

	private String name; 
	private double balance; 
	private String address;
	private double intrate;
	private String phone; 
	private String pin = "123"; 
	public ClassExample(String name, double balance, String address, double intrate, String phone, String pin,
			String bday) {
		super();
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.intrate = intrate;
		this.phone = phone;
		this.pin = pin;
		this.bday = bday;
	}


	private String bday;
	
	
	
	public ClassExample() {
		super();
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		this.name = input.nextLine(); 
	}


	public void display() {

		System.out.println(name);
		System.out.println(balance);
		System.out.println(address);
		intcal(); 
		System.out.println(); 
		System.out.println(); 
		System.out.println(); 
		
		
		
	}
	
	
	public void intcal() {
		double Int= balance * intrate;
		System.out.println(Int);
	}


	
	//getters and setters.
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance, String pin) {
		if (this.pin.equals(pin)) {
		this.balance = balance;
	}
	else {
	System.out.println("that's not the right pin.");
	}
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getIntrate() {
		return intrate;
	}


	public void setIntrate(double intrate) {
		this.intrate = intrate;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public String getBday() {
		return bday;
	}


	public void setBday(String bday) {
		this.bday = bday;
	}
	
	
	
	
	
	
	
	
	
	
}
