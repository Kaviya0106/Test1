package testPrograms;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String name1 = name.toLowerCase();

				if (name1 == null || name1 == "" ||name==" ") {
					System.out.println("Enterthe valid data");
				}

				char[] charArray = name1.toCharArray();

				for (int i = 0; i < charArray.length; i++) {
					char c = charArray[i];
					if (i % 2 != 0) {
						char upperCase = Character.toUpperCase(c);
						System.out.print(upperCase);

					} else {
						System.out.print(charArray[i]);

					}

	}
	}
}



