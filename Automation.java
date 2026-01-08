package testPrograms;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://ecommerce-playground.lambdatest.io/");

	}

}
