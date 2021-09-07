package org.bank;

public class Hdfc extends MyDetails 
{
	private void ifsc() {
		System.out.println("ifsc code is 2340hdb");
}
	public static void main(String[] args) {
		Hdfc d=new Hdfc();
		d.ifsc();
		d.pan();
		d.aadhar();
		d.name();
		d.phone();
	}
	}
