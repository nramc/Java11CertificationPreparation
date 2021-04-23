package java11.certification.practice.chapter1.datatypes;


/**
 * Every programming language has its own set of rules and conventions for the kinds of names that you're allowed to use,
 * and the Java programming language is no different.
 *
 * 1. Variable names are case-sensitive
 * 2. Single _ as variable name is not permitted from JDK 9
 * 3. Java Reserved words and keywords are not permitted
 * 4. Variable name should not starts with digits
 * 
 * Recommendations:
 * 1. Variable starting with $ and _ are permitted but it is not recommended as some libraries use such conventions to denote different objects
 * 2. Use camel case letters for variable names
 * 3. Use CAPITALISED words for naming constant values and use _ as words separator
 * 4. it is recommended to always starts variable name with letters
 * 
 */

@SuppressWarnings("unused")
public class VeriableNamingConventions {
	
	// Variable names are case-sensitive
	private String firstname;
	private String firstName;
	
	// Single _ as variable name is not permitted from JDK11. ### Uncomment below statement to see  the error message
	//private int _;
	
	// Java Reserved words and keywords are not permitted. ### Uncomment below statement to see  the error message
	//private String float;
	//private String int;
	
	// String is Java class and it is not keyword or reserved word. Thus it is permitted. But is is not advisable to use such variable names.
	private String String = "error";
	
	// Variable name should not starts with digits. ### Uncomment below statement to see  the error message
	//private String 1stName;
	
	

}
