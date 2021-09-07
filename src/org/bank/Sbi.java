package org.bank;

public class Sbi extends MyDetails
{
private void ifscCode() {
	System.out.println("ifsc code is sbsi0v055");
}
public static void main(String[] args) {
	Sbi d=new Sbi();
	d.ifscCode();
	d.pan();
	d.aadhar();
	d.name();
	d.phone();
}
}
