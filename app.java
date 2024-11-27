import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int n =0;
		do
		{
		p("1) text --> Ascii code.\n\t2) text --> bainary code.\n\t0) Exit.\n\tPlease enter your choose : ");
		System.out.print("\t");
		n = in.nextInt();
		
		switch(n){
		case 1:
		p("To convert text to Ascii ");
		p("please enter your name : ");
		System.out.print("\t");
		name = in.next();
		String[] nameAscii = new String[name.length()];
		
		
		if(name.length()>=0)
		{	
		for(int i=0;i<name.length();i++)
		{
			char c = name.charAt(i);
			switch(c)
			{
				// **** a b c ****
				
				case 'a':
				p(c + " --> 97");
				nameAscii[i]=" 97";
				break;
				
				case 'b':
				p(c + " --> 98");
				nameAscii[i]=" 98";
				break;
				
				case 'c':
				p(c + " --> 99");
				nameAscii[i]=" 99";
				break;
				
				case 'd':
				p(c + " --> 100");
				nameAscii[i]=" 100";
				break;
				
				case 'e':
				p(c + " --> 101");
				nameAscii[i]=" 101";
				break;
				
				case 'f':
				p(c + " --> 102");
				nameAscii[i]=" 102";
				break;
				
				case 'g':
				p(c + " --> 103");
				nameAscii[i]=" 103";
				break;
				
				case 'h':
				p(c + " --> 104");
				nameAscii[i]=" 104";
				break;
				
				case 'i':
				p(c + " --> 105");
				nameAscii[i]=" 105";
				break;
				
				case 'j':
				p(c + " --> 106");
				nameAscii[i]=" 106";
				break;
				
				case 'k':
				p(c + " --> 107");
				nameAscii[i]=" 107";
				break;
				
				case 'l':
				p(c + " --> 108");
				nameAscii[i]=" 108";
				break;
				
				case 'm':
				p(c + " --> 109");
				nameAscii[i]=" 109";
				break;
				
				case 'n':
				p(c + " --> 110");
				nameAscii[i]=" 110";
				break;
				
				case 'o':
				p(c + " --> 111");
				nameAscii[i]=" 111";
				break;
				
				case 'p':
				p(c + " --> 112");
				nameAscii[i]=" 112";
				break;
				
				case 'q':
				p(c + " --> 113");
				nameAscii[i]=" 113";
				break;
				
				case 'r':
				p(c + " --> 114");
				nameAscii[i]=" 114";
				break;
				
				case 's':
				p(c + " --> 115");
				nameAscii[i]=" 115";
				break;
				
				case 't':
				p(c + " --> 116");
				nameAscii[i]=" 116";
				break;
				
				case 'u':
				p(c + " --> 117");
				nameAscii[i]=" 117";
				break;
				
				case 'v':
				p(c + " --> 118");
				nameAscii[i]=" 118";
				break;
				
				case 'w':
				p(c + " --> 119");
				nameAscii[i]=" 119";
				break;
				
				case 'x':
				p(c + " --> 120");
				nameAscii[i]=" 120";
				break;
				
				case 'y':
				p(c + " --> 121");
				nameAscii[i]=" 121";
				break;
				
				case 'z':
				p(c + " --> 122");
				nameAscii[i]=" 122";
				break;
				
				case '_':
				p(c + " --> _");
				nameAscii[i]= " _";
				break;
				
				// **** A B C ****
				
			   case 'A':
				p(c + " --> 65");
				nameAscii[i]=" 65";
				break;
				
				case 'B':
				p(c + " --> 66");
				nameAscii[i]=" 66";
				break;
				
				case 'C':
				p(c + " --> 67");
				nameAscii[i]=" 67";
				break;
				
				case 'D':
				p(c + " --> 68");
				nameAscii[i]=" 68";
				break;
				
				case 'E':
				p(c + " --> 69");
				nameAscii[i]=" 69";
				break;
				
				case 'F':
				p(c + " --> 70");
				nameAscii[i]=" 70";
				break;
				
				case 'G':
				p(c + " --> 71");
				nameAscii[i]=" 71";
				break;
				
				case 'H':
				p(c + " --> 72");
				nameAscii[i]=" 72";
				break;
				
				case 'I':
				p(c + " --> 73");
				nameAscii[i]=" 73";
				break;
				
				case 'J':
				p(c + " --> 74");
				nameAscii[i]=" 74";
				break;
				
				case 'K':
				p(c + " --> 75");
				nameAscii[i]=" 75";
				break;
				
				case 'L':
				p(c + " --> 76");
				nameAscii[i]=" 76";
				break;
				
				case 'M':
				p(c + " --> 77");
				nameAscii[i]=" 77";
				break;
				
				case 'N':
				p(c + " --> 78");
				nameAscii[i]=" 78";
				break;
				
				case 'O':
				p(c + " --> 79");
				nameAscii[i]=" 79";
				break;
				
				case 'P':
				p(c + " --> 80");
				nameAscii[i]=" 80";
				break;
				
				case 'Q':
				p(c + " --> 81");
				nameAscii[i]=" 81";
				break;
				
				case 'R':
				p(c + " --> 82");
				nameAscii[i]=" 82";
				break;
				
				case 'S':
				p(c + " --> 83");
				nameAscii[i]=" 83";
				break;
				
				case 'T':
				p(c + " --> 84");
				nameAscii[i]=" 84";
				break;
				
				case 'U':
				p(c + " --> 85");
				nameAscii[i]=" 85";
				break;
				
				case 'V':
				p(c + " --> 86");
				nameAscii[i]=" 86";
				break;
				
				case 'W':
				p(c + " --> 87");
				nameAscii[i]=" 87";
				break;
				
				case 'X':
				p(c + " --> 88");
				nameAscii[i]=" 88";
				break;
				
				case 'Y':
				p(c + " --> 89");
				nameAscii[i]=" 89";
				break;
				
				case 'Z':
				p(c + " --> 90");
				nameAscii[i]=" 90";
				break;
				
				// **** 1 2 3 ****
				
				case '0':
				p(c + " --> 48");
				nameAscii[i]=" 48";
				break;
				
				case '1':
				p(c + " --> 49");
				nameAscii[i]=" 49";
				break;
				
				case '2':
				p(c + " --> 50");
				nameAscii[i]=" 50";
				break;
				
				case '3':
				p(c + " --> 51");
				nameAscii[i]=" 51";
				break;
				
				case '4':
				p(c + " --> 52");
				nameAscii[i]=" 52";
				break;
				
				case '5':
				p(c + " --> 53");
				nameAscii[i]=" 53";
				break;
				
				case '6':
				p(c + " --> 54");
				nameAscii[i]=" 54";
				break;
				
				case '7':
				p(c + " --> 55");
				nameAscii[i]=" 55";
				break;
				
				case '8':
				p(c + " --> 56");
				nameAscii[i]=" 56";
				break;
				
				case '9':
				p(c + " --> 57");
				nameAscii[i]=" 57";
				break;
				
			//	case ' ':
			//	p("space --> 32");
			//	nameAscii[i]=" 32";
			//	break;
				
			}// end of small switch
		}// end of for loop
		}// end of big if
		System.out.print("\t"+name + " --> ");
		for(int i=0;i<nameAscii.length;i++)
		{
			System.out.print(nameAscii[i]);
		}
		p("");
		break;
		
		case 2:
		p("To convert text to Bainary ");
		p("please enter your name : ");
		System.out.print("\t");
		name = in.next();
		String[] nameBainary = new String[name.length()];
		
		
		if(name.length()>=0)
		{	
		for(int i=0;i<name.length();i++)
		{
			char c = name.charAt(i);
			switch(c)
			{
				case 'a':
				p(c + " --> 1100001");
				nameBainary[i]=" 1100001";
				break;
				
				case 'b':
				p(c + " --> 1100010");
				nameBainary[i]=" 1100010";
				break;
				
				case 'c':
				p(c + " --> 1100011");
				nameBainary[i]=" 1100011";
				break;
				
				case 'd':
				p(c + " --> 1100100");
				nameBainary[i]=" 1100100";
				break;
				
				case 'e':
				p(c + " --> 1100101");
				nameBainary[i]=" 1100101";
				break;
				
				case 'f':
				p(c + " --> 1100110");
				nameBainary[i]=" 1100110";
				break;
				
				case 'g':
				p(c + " --> 1100111");
				nameBainary[i]=" 1100111";
				break;
				
				case 'h':
				p(c + " --> 1101000");
				nameBainary[i]=" 1101000";
				break;
				
				case 'i':
				p(c + " --> 1101001");
				nameBainary[i]=" 1101001";
				break;
				
				case 'j':
				p(c + " --> 1101010");
				nameBainary[i]=" 1101010";
				break;
				
				case 'k':
				p(c + " --> 1101011");
				nameBainary[i]=" 1101011";
				break;
				
				case 'l':
				p(c + " --> 1101100");
				nameBainary[i]=" 1101100";
				break;
				
				case 'm':
				p(c + " --> 1101101");
				nameBainary[i]=" 1101101";
				break;
				
				case 'n':
				p(c + " --> 1101110");
				nameBainary[i]=" 1101110";
				break;
				
				case 'o':
				p(c + " --> 1101111");
				nameBainary[i]=" 1101111";
				break;
				
				case 'p':
				p(c + " --> 1110000");
				nameBainary[i]=" 1110000";
				break;
				
				case 'q':
				p(c + " --> 1110001");
				nameBainary[i]=" 1110001";
				break;
				
				case 'r':
				p(c + " --> 1110010");
				nameBainary[i]=" 1110010";
				break;
				
				case 's':
				p(c + " --> 1110011");
				nameBainary[i]=" 1110011";
				break;
				
				case 't':
				p(c + " --> 1110100");
				nameBainary[i]=" 1110100";
				break;
				
				case 'u':
				p(c + " --> 1110101");
				nameBainary[i]=" 1110101";
				break;
				
				case 'v':
				p(c + " --> 1110110");
				nameBainary[i]=" 1110110";
				break;
				
				case 'w':
				p(c + " --> 1110111");
				nameBainary[i]=" 1110111";
				break;
				
				case 'x':
				p(c + " --> 1111000");
				nameBainary[i]=" 1111000";
				break;
				
				case 'y':
				p(c + " --> 1111001");
				nameBainary[i]=" 1111001";
				break;
				
				case 'z':
				p(c + " --> 1111010");
				nameBainary[i]=" 1111010";
				break;
				
				case '_':
				p(c + " --> _");
				nameBainary[i]= " _";
				break;
				
				// **** A B C ****
				
			   case 'A':
				p(c + " --> 1000001");
				nameBainary[i]=" 1000001";
				break;
				
				case 'B':
				p(c + " --> 1000010");
				nameBainary[i]=" 1000010";
				break;
				
				case 'C':
				p(c + " --> 1000011");
				nameBainary[i]=" 1000011";
				break;
				
				case 'D':
				p(c + " --> 1000100");
				nameBainary[i]=" 1000100";
				break;
				
				case 'E':
				p(c + " --> 1000101");
				nameBainary[i]=" 1000101";
				break;
				
				case 'F':
				p(c + " --> 1000110");
				nameBainary[i]=" 1000110";
				break;
				
				case 'G':
				p(c + " --> 1000111");
				nameBainary[i]=" 1000111";
				break;
				
				case 'H':
				p(c + " --> 1001000");
				nameBainary[i]=" 1001000";
				break;
				
				case 'I':
				p(c + " --> 1001001");
				nameBainary[i]=" 1001001";
				break;
				
				case 'J':
				p(c + " --> 1001010");
				nameBainary[i]=" 1001010";
				break;
				
				case 'K':
				p(c + " --> 1001011");
				nameBainary[i]=" 1001011";
				break;
				
				case 'L':
				p(c + " --> 1001100");
				nameBainary[i]=" 1001100";
				break;
				
				case 'M':
				p(c + " --> 1001101");
				nameBainary[i]=" 1001101";
				break;
				
				case 'N':
				p(c + " --> 1001110");
				nameBainary[i]=" 1001110";
				break;
				
				case 'O':
				p(c + " --> 1001111");
				nameBainary[i]=" 1001111";
				break;
				
				case 'P':
				p(c + " --> 1010000");
				nameBainary[i]=" 1010000";
				break;
				
				case 'Q':
				p(c + " --> 1010001");
				nameBainary[i]=" 1010001";
				break;
				
				case 'R':
				p(c + " --> 1010010");
				nameBainary[i]=" 1010010";
				break;
				
				case 'S':
				p(c + " --> 1010011");
				nameBainary[i]=" 1010011";
				break;
				
				case 'T':
				p(c + " --> 1010100");
				nameBainary[i]=" 1010100";
				break;
				
				case 'U':
				p(c + " --> 1010101");
				nameBainary[i]=" 1010101";
				break;
				
				case 'V':
				p(c + " --> 1010110");
				nameBainary[i]=" 1010110";
				break;
				
				case 'W':
				p(c + " --> 1010111");
				nameBainary[i]=" 1010111";
				break;
				
				case 'X':
				p(c + " --> 1011000");
				nameBainary[i]=" 1011000";
				break;
				
				case 'Y':
				p(c + " --> 1011001");
				nameBainary[i]=" 1011001";
				break;
				
				case 'Z':
				p(c + " --> 1011010");
				nameBainary[i]=" 1011010";
				break;
				
				// **** 1 2 3 ****
				
				case '0':
				p(c + " --> 110000");
				nameBainary[i]=" 110000";
				break;
				
				case '1':
				p(c + " --> 110001");
				nameBainary[i]=" 110001";
				break;
				
				case '2':
				p(c + " --> 110010");
				nameBainary[i]=" 110010";
				break;
				
				case '3':
				p(c + " --> 110011");
				nameBainary[i]=" 110011";
				break;
				
				case '4':
				p(c + " --> 110100");
				nameBainary[i]=" 110100";
				break;
				
				case '5':
				p(c + " --> 110101");
				nameBainary[i]=" 110101";
				break;
				
				case '6':
				p(c + " --> 110110");
				nameBainary[i]=" 110110";
				break;
				
				case '7':
				p(c + " --> 110111");
				nameBainary[i]=" 110111";
				break;
				
				case '8':
				p(c + " --> 110111");
				nameBainary[i]=" 110111";
				break;
				
				case '9':
				p(c + " --> 111000");
				nameBainary[i]=" 111000";
				break;
				
				/*
				case 'b':
				p(c + " --> 98");
				break;
				case 'a':
				p(c + " --> 97");
				break;
				case 'b':
				p(c + " --> 98");
				break;
				case 'b':
				p(c + " --> 98");
				break;
				case 'b':
				p(c + " --> 98");
				break;
				*/
				
			}// end of small switch
		}// end of for loop
		}// end of big if
		System.out.print("\t"+name+ " --> ");
		for(int i=0;i<nameBainary.length;i++)
		{
			System.out.print(nameBainary[i]);
		}
		p("");
		break;
		
		case 0:
		p("\n\tMade by Mr.1110111.");
		break;
		
		
		}// end of big switch 
		}while(n!=0);
		
		
	}// end of main()
	
	public static void p(String x)
	{
		System.out.println("\t"+x);	
	}
	
}