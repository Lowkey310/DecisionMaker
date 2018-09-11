import java.util.Scanner;

public class decisionmaker
	{

		public static void main(String[] args)
			{
				Intro();
				makingchoicesprocess();
				asktorunagain();
				

			}
		
		private static void Intro()
			{
				System.out.println("Hi! Nice to meet you! I'm your private decisionmaker!");
			}

		private static void makingchoicesprocess()
			{
				System.out.println("I know it's hard to make a decision, so now let me help u!");
				System.out.println("How many choices do you got for me?");
				Scanner userInput = new Scanner(System.in);
				int choices = userInput.nextInt();
				if(choices == 1)
					{
						System.out.println("Come on, u don't even need me now!");
					}
				else
					{
						String[] content = new String [choices];
						for(int i = 0; i < choices; i++)
							{
								System.out.println("What is your choice #" + (i+1));
								Scanner userInput1 = new Scanner(System.in);
								String answer = userInput1.nextLine();
								content [i] = answer;
								
							}
						System.out.println("I see! You should absoulutely choose " + content [(int) (Math.random()*choices)]+ "!");
				    }
				
			}
		
		private static void asktorunagain()
			{
				System.out.println("Well, Do you have any other decision to make? 1. Yea Sure! I still need your help! 2. Nope I'm outta here. Remember to type in the number infront of your choice !");
				Scanner userInput3 = new Scanner(System.in);
				int answerafterward = userInput3.nextInt();
				if (answerafterward == 1 )
					{
						System.out.println("Welcome Back! I miss you already!");
						makingchoicesprocess();
						asktorunagain();
	
					}
				else
					{
						System.out.println("Alright, see you soon T^T");
					}
				
			}
	}
