//3
public class Converter{
	
	public static void main(String[] values)
	{
		System.out.println("Converting String to other Primitives");
		
		String maxPassWordLength="10";
		byte convertedmaxPassWordLength=Byte.parseByte(maxPassWordLength);
		System.out.println("String to byte: "+convertedmaxPassWordLength);
		
		String rollNo="248";
		short convertedrollNo=Short.parseShort(rollNo);
		System.out.println("String to short: "+convertedrollNo);
		
		String salary="100000";
		int convertedSalary=Integer.parseInt(salary);
		System.out.println("String to Integer: "+convertedSalary);
		
		String population="1300000000";
		long convertedPopulation=Long.parseLong(population);
		System.out.println("String to Integer: "+convertedPopulation);
		
		String percentage="80.83";
		float convertedPercentage=Float.parseFloat(percentage);
		System.out.println("String to Float: "+convertedPercentage);
		
		String cgpa="7.25";
		double convertedCgpa=Double.parseDouble(cgpa);
		System.out.println("String to Double: "+convertedCgpa);
		
	}
}