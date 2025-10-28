public class VariablesAndTypes {
	public static void main(String[] args) {
		System.out.println("hello\tworkplease");
		System.out.println("hello\nagain\n");

		// switch alternate between z and e, and after every two (even recursions) print
		// a new line
		// i am NOT doing that ^^
		System.out.println("ZZZZZZZZZZZZZZZZZ  EEEEEEEEEEEEEEEEEEEEE");
		System.out.println("             ZZZ   EEE");
		System.out.println("            ZZZ    EEE");
		System.out.println("           ZZZ     EEE");
		System.out.println("          ZZZ      EEE");
		System.out.println("         ZZZ       EEE");
		System.out.println("        ZZZ        EEE");
		System.out.println("       ZZZ         EEEEEEEEEEEEEEEE");
		System.out.println("      ZZZ          EEE");
		System.out.println("     ZZZ           EEE");
		System.out.println("    ZZZ            EEE");
		System.out.println("   ZZZ             EEE");
		System.out.println("  ZZZ              EEE");
		System.out.println(" ZZZ               EEE");
		System.out.println("ZZZ                EEE");
		System.out.println("ZZZZZZZZZZZZZZZZZ  EEEEEEEEEEEEEEEEEEEEE");

		{ // find the average and stuff
			double average = 1.1 + 5.3 + 12 + 20.88;
			average = average / 4;
			System.out.print("\nThe average is:\t");
			System.out.print(average);
			System.out.println(". yay");
		}

		{ // pythagorean theorum
			double a = 7;
			double b = 13;
			double c;
			double answer;

			a = Math.pow(a, 2);
			b = Math.pow(b, 2);
			// c = Math.pow(c, 2);

			answer = (a + b); // a^2 + b^2
			answer = Math.sqrt(answer);
			System.out.print("\nc = ");
			System.out.println(answer);
		}

		{ // the fibbonachi thingy

			{
				int sequenceLength = 10;
				int fibbonachi = 0;
				int cache1 = 0;
				int cache2 = 1;
				System.out.print("\t" + "0"); // lol

				for (int i = 0; i < (sequenceLength - 1); i++) {
					fibbonachi = cache2 + cache1;
					cache1 = cache2;
					cache2 = fibbonachi;
					System.out.print("\t" + fibbonachi);
				}
			}

			// 1+e^(4.12 - e)
			double e = Math.E;
			System.out.print("\nThe answer to the fibbonachi thing is: ");
			System.out.println(1 + Math.pow(e, 4.12 - e));
		}

	}
}