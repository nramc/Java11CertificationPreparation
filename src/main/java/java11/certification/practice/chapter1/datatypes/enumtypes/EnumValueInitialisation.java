package java11.certification.practice.chapter1.datatypes.enumtypes;


/**
 * Enum objects can be initialised with default values and also can be assigned later.
 * 
 * Note: Enum objects are by default static objects, Thus changing values impacts through out the projects. 
 */
public class EnumValueInitialisation {
	enum Country {
		
		// values initialised with default values
		INDIA("+91"),
		GERMANY();
		
		private String dialingCode;
		
		private Country(String dialingCode) {
			this.dialingCode = dialingCode;
		}
		private Country() {}
		
		private void setDailingCode(String dialingCode) {
			this.dialingCode = dialingCode;
		}
		private String getDialingCode() {
			return this.dialingCode;
		}

	}
	
	public static void main(String[] args) {
		// Reference to static object INDIA
		Country india = Country.INDIA;
		System.out.println("Default dialing code for India: " + india.getDialingCode());
		//Reassign value
		india.setDailingCode("0");
		System.out.println("Latest dialing code for India: " + india.getDialingCode());
		// Note: It will change Global INDIA object value also as enum objects are static by default
		System.out.println("Global INDIA object value changed: " + Country.INDIA.getDialingCode());
		
		
		Country germany = Country.GERMANY;
		System.out.println("Default dialing code for Germany:" + germany.getDialingCode());
		// Assign value now
		germany.setDailingCode("+49");
		System.out.println("Latest Dialing code for Germany: " + germany.getDialingCode());
		System.out.println("Global instance of Germany's dialing code: " + Country.GERMANY.getDialingCode());
		
	}
}
