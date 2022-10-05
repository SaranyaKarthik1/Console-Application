package Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact_process {
	public static void get() throws SQLException {
		Contactpojo obj = new Contactpojo();
		String first_name;
		String last_name;
		String Address;
		String city;
		String State;
		String email = null;
		String adhar_no;
		int age;
		String gender;
		String phone_number =null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		first_name=sc.next();
		obj.setFirst_name(first_name);
		System.out.println("Enter your Last name: ");
		last_name=sc.next();
		obj.setLast_name(last_name);
		System.out.println("Enter your Address: ");
		Address=sc.next();
		obj.setAddress(Address);
		System.out.println("Enter your city: ");
		city=sc.next();
		obj.setCity(city);
		System.out.println("Enter your state/Region: ");
		State=sc.next();
		obj.setState(State);
		boolean bool = true;
		while(bool) {
		System.out.println("Enter your phone_number: ");
		phone_number=sc.next();
		if(numbercheck(phone_number)) {
			obj.setPhone_number(phone_number);
			bool=false;
		}else {
			System.out.println("enter valid phone_number");
		}
		}
		boolean bool1=true;
		while(bool1) {
		System.out.println("Enter your email-address: ");
		email=sc.next();
		if(emailcheck(email)) {
		obj.setEmail(email);
		bool1=false;
		}else {
			System.out.println("Enter the valid e-mail address: ");
		}
		}
		System.out.println("Enter your Aadhar-card: ");
		adhar_no=sc.next();
		obj.setAdhar_no(adhar_no);
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		obj.setAge(age);
		System.out.println("Gender: ");
		gender=sc.next();
		obj.setGender(gender);
		Connection connect=DriverManager.getConnection("jdbc:mySql://localhost:3306/management","root","sarakarp10@123");
		Statement contact_state=connect.createStatement();
		String query="insert into  user_info(first_name, last_name, address, city, state, phone, email, adhar_no, age, gender) values (\""+first_name+"\",\""+ last_name+"\",\""+ Address+"\",\""+city+"\",\""+State+"\",\""+phone_number+"\",\""+email+"\",\""+adhar_no+"\",\""+age+"\",\""+gender+"\")";	
		contact_state.executeUpdate(query);
	}
	
	public static boolean numbercheck(String phone_number) {
		
		String mobileNumberValidate = "^[6-9][0-9]{9}$";
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile(mobileNumberValidate);
		matcher = pattern.matcher(phone_number);
		return matcher.matches();
		
	
	}
public static boolean emailcheck(String email) {
	String emailvalidate="^[a-zA-Z0-9]@[a-zA-Z0-9].[a-zA-Z]$";//^(.+)@(.+)$
	Pattern p;
	Matcher matcher;
	p=Pattern.compile(emailvalidate);
	matcher=p.matcher(emailvalidate);
	return matcher.matches();
	
}

	private void assertTrue(boolean matches) {
		// TODO Auto-generated method stub
		
	}
}