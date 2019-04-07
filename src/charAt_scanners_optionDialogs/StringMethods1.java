package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String stringI = "Greetings, Earth creature.";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(stringI.charAt(3));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
System.out.println(stringI.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
int length = stringI.length();
int character = 0;
System.out.println();
for (int i = 0; i < length; i++) {
System.out.print(stringI.charAt(character));
character = character + 1;
}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
int charPos = 0;
int charpos = -1;
System.out.println();
for (int i = 0; i < length; i++) {
if(stringI.charAt(charPos)==('i')) {
System.out.println("Character 'i' is a index " + charpos + ".");
}
charPos = charPos + 1;
charpos = charpos + 1;
}
	}
}


