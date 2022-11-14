package com.java.dhanasekaran;

import java.util.Scanner;

public class AllStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userinput;

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter your String :");
		userinput = scr.nextLine();
		System.out.println(userinput);
		System.out.println("Lowecase = " + userinput.toLowerCase());
		System.out.println("Uppercase = " + userinput.toUpperCase());
		int length = userinput.length();
		System.out.println("Your String length is = " + length);
		System.out.println("\nEnter your char and codepoint value Start at 0 to stringlengh -1 ");
		int charv = scr.nextInt();
		System.out.println("Your charis = " + userinput.charAt(charv));
		System.err.println("Your code point value is =" + userinput.codePointAt(charv));
		System.err.println("Your code pointbefore value is =" + userinput.codePointBefore(charv));

		System.out.println("Enter your count  starting point");
		int start = scr.nextInt();
		System.out.println("Enter your count  Ending point");
		int end = scr.nextInt();
		System.out.println("Your code point is = " + userinput.codePointCount(start, end));
		Scanner scr1 = new Scanner(System.in);
		{
			System.out.println("Enter your  String");
			String value = scr1.nextLine();

			System.out.println("compare is = " + userinput.compareTo(value));
			System.out.println("compareToIgnoreCase =" + userinput.compareToIgnoreCase(value));
			System.out.println("content equles = " + userinput.contentEquals(value));
			System.out.println("concat and uppercase  = " + userinput.concat(userinput.toUpperCase()));
			System.out.println("Contains method =" + userinput.contains(userinput.toLowerCase()));
			String cha = new String(userinput);
			char[] cha1 = new char[length];
			cha.getChars(start, end, cha1, 0);
			System.out.println("your getchar value is = " + cha1);
			Scanner scr2 = new Scanner(System.in);
			{

				System.out.println("Enter your copy char ");

				char[] valu2 = scr2.nextLine().toCharArray();
				char[] ch = userinput.toCharArray();
				for (int n = 0; n < ch.length; n++) {
					System.out.println(ch[n]);
				}

				String result = userinput.copyValueOf(valu2, 0, end);

				System.out.println("Your copy value is= " + result);

				System.out.println("Enter your End char");
				String End = scr2.next();
				System.out.println("your end value is = " + value.endsWith(End));
				System.out.println("your equal value = " + value.equals(userinput));
				System.out.println("your equlsignore value = " + value.equalsIgnoreCase(userinput));
				System.out.println("your format is = " + value.format(userinput));

				byte[] byt = userinput.getBytes();
				for (int i = 0; i < byt.length; i++) {
					System.out.println("your byte value is =" + byt[i]);
				}
				System.out.println("your hascode " + userinput.hashCode());
				System.out.println("your intex value" + userinput.indexOf(value));
				System.out.println("your intern = " + userinput.intern());
				System.out.println("your match is = " + userinput.matches(value));
				System.out.println("Region matches = " + userinput.regionMatches(length, value, start, end));
				System.out.println("return the intex within this String =" + userinput.offsetByCodePoints(start, end));
				System.out.println("your empty is  =" + userinput.isEmpty());
				System.out.println("your Lastintex value" + userinput.lastIndexOf(value));
				Scanner scr3 = new Scanner(System.in);
				{
					System.out.println("Enter your replace value");
					String replac = scr3.next();
					System.out.println("to print value ");
					String print = scr3.next();
					System.out.println("your replace value " + userinput.replace(replac, print));
					System.out.println("your replaceFirst value " + userinput.replaceFirst(replac, print));
					System.out.println("replace All value is = " + userinput.replaceAll(replac, print));
					System.out.println("Start with = " + userinput.startsWith(value));
					String[] splt = userinput.split("\\s");
					for (String s : splt) {
						System.out.println("your split = " + s);
					}
					System.out.println("sub sequuence " + start + "," + end + "=" + userinput.subSequence(start, end));
					System.out.println("sub String " + userinput.substring(start, end));
					System.out.println("sub String = " + userinput.substring(charv));
					System.out.println("your trim value = " + userinput.trim());
					System.out.println("toString = " + userinput.toString());
					System.out.println("value of = " + userinput.valueOf(value));

				}
			}
		}
	}
}
