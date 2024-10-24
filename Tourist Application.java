import java.util.Scanner;
class phonenumber
{
	private long phonenumber;
	void setDetails(long phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	long getpass()
	{
		return phonenumber;
	}
}

class Login
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	void start()
	{
		long phonenum;
       		String str;
		char ch;
        	do 
		{
			System.out.println(blue);
			System.out.println("Enter your mobile number:");
			System.out.println(def);
			phonenum = sc.nextLong();
			str = String.valueOf(phonenum);
			ch=str.charAt(0);
			if (str.length() != 10) 
			{
				System.out.println(red);
				System.out.println("Please enter a valid 10-digit mobile number.");
				System.out.println(def);
		}
		} while (str.length() != 10||(ch<54||ch>58));  // Continue loop until valid number is entered
		new phonenumber().setDetails(phonenum);
		int value;
		int otp;
		do 
		{
			value=((int)(Math.random()*9000)+1000);
			System.out.println("Your OTP: " + value);
			System.out.println("Enter your OTP:");
			otp = sc.nextInt();
			if (value != otp) 
			{
				System.out.println("Incorrect OTP.\nPlease try again.");
			}
		} while (value != otp); // Continue loop until the correct OTP is entered
		System.out.println("Login Successful");
        } 
}
abstract class Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	int balance=(int)(Math.random()*5001)+5000;
	abstract void finalpayment(int amount);	
}
class Wallet extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	int g=0;
	void finalpayment(int amount)
	{
		System.out.println("Add amount to the Wallet.\nEnter the amount you want to add");
		int y=sc.nextInt();
		g=g+y;//amount added in the wallet.
		balance=balance-y;
		int l=(amount*30/100);
		int amount1=amount-l;
		if(amount1<=g)
		{
			g=g-amount1;
			double random=Math.random();
			System.out.println("you got the 30% off on your payment Rs"+l);
			System.out.println("you have to pay "+amount1+" Rs on your Booking");
			System.out.println("Thanks for visiting!\nEnjoy your trip!");
		}
		else
		{
			System.out.println("Insufficent balance");
			finalpayment(amount);
		}
	}
}
class Phonepay extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	void finalpayment(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			int f=new Hotel().person;
			int value=(int)(Math.random()*101)+100;//(min value 100 and max value 200)
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.println("you got the cashback of "+value);
			System.out.println("Thanks for visiting!\nEnjoy your trip!");
			balance=balance+value;
		}
		else
		{
			System.out.println("Insufficent balance");
			int f=amount-balance;
			System.out.println("You need more "+f+" Rs to make payment");
			System.out.println("Enter the amount you want to add to your balance");
			int s=sc.nextInt();
			balance =balance+s;
			finalpayment(amount);
		}
	}
}
class Gpay extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	void finalpayment(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			int f=new Hotel().person;
			int value=(int)(Math.random()*401)+100;//(min value 100 and max value 400)
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.println("you got the cashback of "+value);
			System.out.println("Thanks for visiting!\nEnjoy your trip!");
			balance=balance+value;
		}
		else
		{
			System.out.println("Insufficent balance");
			int f=amount-balance;
			System.out.println("You need more "+f+" Rs to make payment");
			System.out.println("Enter the amount you want to add to your balance");
			int s=sc.nextInt();
			balance =balance+s;
			finalpayment(amount);
		}
	}
}
class Paytm extends Bank
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	void finalpayment(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			int f=new Hotel().person;
			System.out.println("You have to pay "+amount+" Rs for the "+f+" number of persons on your booking.");
			System.out.println("you get Rs30- Rs200 off on your first Quick Shop order");
			System.out.println("Thanks for visiting!\nEnjoy your trip!");
		}
		else
		{
			System.out.println("Insufficent balance");
			int f=amount-balance;
			System.out.println("You need more "+f+" Rs to make payment");
			System.out.println("Enter the amount you want to add to your balance");
			int s=sc.nextInt();
			balance =balance+s;
			finalpayment(amount);
		}
	}
}

abstract class amount
{
	abstract void payment(int amount);
}
class Hotel extends amount
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	int amount1;
	static int person;
	void person(int persons)
	{
		this.person=persons;
	}
	void payment(int amount)
	{
		this.amount1=amount;
		System.out.println("1.To know about the offers to payment");
		System.out.println("2.To choose payment platform");
		int f=sc.nextInt();
		switch(f)
		{
			case 1:
			{
				offers();
				break;
			}
			case 2:
			{
				paymentmethod();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				payment(amount);
			}
		}
	}
	void offers()
	{
		System.out.println("By using Wallet you get 30% off on the price");
		System.out.println("By using PhonePay you get chashBack between 100-200");
		System.out.println("By using GPay you get chashBack between 100-500");
		System.out.println("By using Paytm you get gift vouncher");
		paymentmethod();
	}
	void paymentmethod()
	{
		System.out.println("Select one option for Payment.");
		System.out.println("1.wallet");
		System.out.println("2.Phonepay");
		System.out.println("3.Gpay");
		System.out.println("4.Paytm");
		int h=sc.nextInt();
		paymenttype(h,amount1);
	}
	void paymenttype(int n,int f)
	{
		switch(n)
		{
			case 1:
			{
				Wallet obj=new Wallet();
				obj.finalpayment(f);
				break;
			}
			case 2:
			{
				Phonepay obj=new Phonepay();
				obj.finalpayment(f);
				break;
			}
			case 3:
			{
				Gpay obj=new Gpay();
				obj.finalpayment(f);
				break;
			}
			case 4:
			{
				Paytm obj=new Paytm();
				obj.finalpayment(f);
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input\nrestart the process again");
				paymentmethod();
				break;
			}
		}
	}
	void Goahotel()
	{
		System.out.println("1.The grand Leoney Resort");
		System.out.println("2.Hilton Goa Resort");
		System.out.println("3.Jolly Resort");
		System.out.println("4.Garden Resort");
		System.out.println("5.Back");
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println("Each person per head costs 2000/- Rs");
				System.out.println("Enter no of persons are going to visit.");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to continue payment method\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Goahotel();
				}
				break;

			}
			case 2:
			{
				System.out.println("Each person per head costs 1500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1500;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Goahotel();
				}
				break;

			}
			case 3:
			{
				System.out.println("Each person per head costs 3000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Goahotel();
				}
				break;

			}
			case 4:
			{
				System.out.println("Each person per head costs 2500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to continue payment method\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2500;
							payment(amount);
							break;
						}
						case 2:
						{
							Goahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Goahotel();
				}
				break;
			}
			case 5:
			{
				new Place().Goa();
			}

		}
	}
	void Arakuhotel()
	{
		System.out.println("1.Vana Resort");
		System.out.println("2.Ushodaya Resort");
		System.out.println("3.Prakruthi Resort");
		System.out.println("4.Vihara Resort");
		System.out.println("5.Back");
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println("Each person per head costs 1000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Arakuhotel();
				}
				break;

			}
			case 2:
			{
				System.out.println("Each person per head costs 500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*500;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Arakuhotel();
				}
				break;

			}
			case 3:
			{
				System.out.println("Each person per head costs 500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*500;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Arakuhotel();
				}
				break;

			}
			case 4:
			{
				System.out.println("Each person per head costs 800/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*800;
							payment(amount);
							break;
						}
						case 2:
						{
							Arakuhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Arakuhotel();
				}
				break;
			}
			case 5:
			{
				new Place().Araku();
			}

		}

	}
	void Keralahotel()
	{
		System.out.println("1.Taj Malabar Resort");
		System.out.println("2.Marari Beach Resort");
		System.out.println("3.Taj Green Cove Resort ");
		System.out.println("4.Rainforest Resort");
		System.out.println("5.Back");
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println("Each person per head costs 3000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Keralahotel();
				}
				break;

			}
			case 2:
			{
				System.out.println("Each person per head costs 2500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2500;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Keralahotel();
				}
				break;

			}
			case 3:
			{
				System.out.println("Each person per head costs 2000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Arakuhotel();
				}
				break;

			}
			case 4:
			{
				System.out.println("Each person per head costs 1000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Keralahotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Keralahotel();
				}
				break;
			}
			case 5:
			{
				new Place().Kerala();
			}

		}

	}
	void Hyderabadhotel()
	{
		System.out.println("1.Novotel Hyderabad Convention Centre");
		System.out.println("2.Hotel Park Continental");
		System.out.println("3.Taj Green Hotel ");
		System.out.println("4.Plaza Hotel ");
		System.out.println("5.Back");
		int k=sc.nextInt();
		switch(k)
		{
			case 1:
			{
				System.out.println("Each person per head costs 3000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*3000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Hyderabadhotel();
				}
				break;

			}
			case 2:
			{
				System.out.println("Each person per head costs 2000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*2000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Hyderabadhotel();
				}
				break;

			}
			case 3:
			{
				System.out.println("Each person per head costs 1000/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1000;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
					
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Hyderabadhotel();
				}
				break;

			}
			case 4:
			{
				System.out.println("Each person per head costs 1500/- Rs");
				System.out.println("Enter no of persons are going to visit");
				int f=sc.nextInt();
				person(f);
				System.out.println("For conformation choose an option. \n1 to conform\n2.for go back");
				int g=sc.nextInt();
				if(g==1||g==2)
				{
					switch(g)
					{
						case 1:
						{
							int amount=f*1500;
							payment(amount);
							break;
						}
						case 2:
						{
							Hyderabadhotel();
							break;
						}
					}
				}
				else
				{
					System.out.println("you have entered wrong input\nrestart the process again");
					Hyderabadhotel();
				}
				break;
			}
			case 5:
			{
				new Place().Hyderabad();
			}

		}

	}
	
}
class Place
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Scanner sc=new Scanner(System.in);
	void Goa()
	{
		System.out.println("Detail discription about Goa.");
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("1. By air");
				System.out.println("   *Goa’s Main Airport");
				System.out.println("   *Mopa Airport (New Goa Airport)");
				System.out.println("   *Post-Flight Transport");
				System.out.println();
				System.out.println("2. By Train");
				System.out.println("   *From Mumbai:Konkan Kanya Express, Mandovi Express");
				System.out.println("   *From Delhi:Goa Sampark Kranti Express and Rajdhani Express.");
				System.out.println("   *From Bangalore: The Vasco da Gama Express and Goa Express run between Bangalore and Goa.");
				System.out.println();
				System.out.println("3. By Road");
				System.out.println("   *Government and Private Buses: Buses operated by KSRTC, MSRTC, and private operators like VRL, SRS, and Neeta Travels provide regular services to Goa from nearby states.");
				System.out.println();
				System.out.println("1. By sea");
				System.out.println("   *Mumbai to Goa Cruise:Companies like Cordelia Cruises operate luxury cruises from Mumbai to Goa.");
				System.out.println();
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println("1.Baga Beach");
				System.out.println("     One of Goa's most popular beaches, known for water sports like parasailing, jet skiing, and banana boat rides.");
				System.out.println("     Lively nightlife with beach shacks, bars, and clubs like Tito’s and Mambo’s.");
				System.out.println("2.Dudhsagar Waterfalls");
				System.out.println("     One of India’s tallest waterfalls, located on the Goa-Karnataka border.");
				System.out.println("     The name Dudhsagar means Sea of Milk, referring to the waterfall's white, milky appearance.");
				System.out.println("     Trekking through lush forests or taking a jeep safari to the falls.");
				System.out.println("3.Chapora Fort");
				System.out.println("     Known for its panoramic views over Vagator Beach, Chapora Fort is a historic site that gained fame from the movie Dil Chahta Hai.");
				System.out.println("     Visit for sunset, but also explore the fort's history—it was once a defense outpost for the Portuguese against Maratha invasions.");
				System.out.println("4.Palolem Beach");
				System.out.println("     A crescent-shaped beach in South Goa, known for its tranquil atmosphere and palm-lined shores.");
				System.out.println("     Famous for its Silent Noise Parties, where party-goers wear headphones.");
				System.out.println("5.Basilica of Bom Jesus (UNESCO World Heritage Site)");
				System.out.println("     A historic church that holds the mortal remains of St. Francis Xavier.");
				System.out.println("     Known for its baroque architecture and religious significance.");
				System.out.println("     The church is over 400 years old and is one of the most important pilgrimage sites for Christians.");

				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Goahotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				Goa();
			}
		}
	}
	void Araku()
	{
		System.out.println("Detail discription about Araku.");
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("1. By Train");
				System.out.println("   *Kirandul Passenger (Train No: 58501) with a special Vistadome coach.");
				System.out.println("   *Visakhapatnam – Kirandul Express (Train No: 18514)");
				System.out.println();
				System.out.println("1. By Road");
				System.out.println("   *Route: NH16 and Araku Road.");
				System.out.println("   *By bus APSRTC (Andhra Pradesh State Road Transport Corporation) and private bus");
				System.out.println();
				System.out.println("1. By Air");
				System.out.println("   * Visakhapatnam Airport (VTZ)");
				System.out.println();
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels.");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Araku();
						break;
					}
					case 2:
					{
						new Hotel().Arakuhotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println("1.Borra Caves");
				System.out.println("     Ancient limestone caves, believed to be over a million years old.");
				System.out.println("     Unique stalactites and stalagmites formations.");
				System.out.println("     The natural Shivling inside the cave, making it a pilgrimage site.");
				System.out.println("2.Araku Tribal Museum");
				System.out.println("     A museum showcasing the culture, lifestyle, and handicrafts of the indigenous tribal communities of the region.");
				System.out.println("     Displays of tribal artifacts, traditional jewelry, tools, and art.");
				System.out.println("     The museum also has a small shopping area for souvenirs.");
				System.out.println("3.Katiki Waterfalls");
				System.out.println("     A stunning waterfall located about 4 km from Borra Caves.");
				System.out.println("     Requires a short trek through scenic landscapes.");
				System.out.println("     The 50-foot-high falls are fed by the Gosthani River.");
				System.out.println("4.Ananthagiri Hills");
				System.out.println("     A lush green hill station located en route to Araku.");
				System.out.println("     Known for its beautiful landscapes, waterfalls, and coffee plantations.");
				System.out.println("     The Musi River originates from this region.");
				System.out.println("5.Coffee Plantations");
				System.out.println("     Araku is famous for its coffee, especially the organic coffee grown by tribal farmers.");
				System.out.println("     You can visit the plantations, learn about coffee cultivation, and sample the locally brewed coffee.");
				System.out.println("     Coffee Museum, which showcases the history of coffee and offers coffee tasting.");
				
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels.");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Arakuhotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				Araku();
			}
		}

	}
	void Kerala()
	{
		System.out.println("Detail discription about Araku.");
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("1. By air");
				System.out.println("   Kerala has four international airports.");
				System.out.println("   * Cochin International Airport (COK) in Kochi.");
				System.out.println("   * Trivandrum International Airport (TRV) in Thiruvananthapuram.");
				System.out.println("   * Calicut International Airport (CCJ) in Kozhikode.");
				System.out.println("   * Kannur International Airport (KIAL) in Kannur.");
				System.out.println();
				System.out.println("2.By train");
				System.out.println("   Major railway stations in Kerala include:");
				System.out.println("   * Thiruvananthapuram Central");
				System.out.println("   * Ernakulam Junction (Kochi)");
				System.out.println("   * Kozhikode");
				System.out.println("   * Alappuzha");
				System.out.println();
				System.out.println("3.By road");
				System.out.println("   Kerala using national highways like NH66, NH544, and NH183.");
				System.out.println("   * Kerala State Road Transport Corporation (KSRTC)");
				System.out.println();
				System.out.println("4.By Water");
				System.out.println("   Kerala has different sea bodies.");
				System.out.println("   * Kerala State Road Transport Corporation (KSRTC)");
				System.out.println();
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Kerala();
						break;
					}
					case 2:
					{
						new Hotel().Keralahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println("1.Histoical places");
				System.out.println("  ->Kochi (Cochin)");
				System.out.println("    Fort Kochi (colonial architecture, Chinese fishing nets)");
				System.out.println("    Mattancherry Palace");
				System.out.println("    Kerala Kathakali Centre (traditional dance performances)");
				System.out.println("  ->Thiruvananthapuram (Trivandrum)");
				System.out.println("    Sree Padmanabhaswamy Temple (richest temple in the world)");
				System.out.println("    Kovalam Beach (nearby)");
				System.out.println("    Napier Museum");
				System.out.println("2.Backwaters");
				System.out.println("  ->Kumarakom");
				System.out.println("    Houseboats on Vembanad Lake");
				System.out.println("    Aruvikkuzhi Waterfall");
				System.out.println("  ->Alleppey (Alappuzha)");
				System.out.println("    Alappuzha Beach");
				System.out.println("    Vembanad Lake");
				System.out.println("3.Hill stations");
				System.out.println("  ->Munnar");
				System.out.println("    Attukal Waterfalls");
				System.out.println("    Anamudi Peak (highest in South India)");
				System.out.println("  ->Wayanad");
				System.out.println("    Edakkal Caves (prehistoric carvings)");
				System.out.println("    Banasura Sagar Dam");
				System.out.println("4.Beach town");
				System.out.println("  ->Varkala");
				System.out.println("    Varkala Beach (Papanasam Beach)");
				System.out.println("    Sivagiri Mutt (spiritual site)");
				System.out.println("  ->Kovalam");
				System.out.println("    Lighthouse Beach");
				System.out.println("    Hawah Beach");
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Keralahotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				Kerala();
			}
		}
		System.out.println("goa");
	}
	void Hyderabad()
	{
		System.out.println("Detail discription about Hyderabad.");
		System.out.println("1.possible ways");
		System.out.println("2.places to explore");
		System.out.println("3.hotels to stay");
		System.out.println("4.Back");
		System.out.println("Choose an option 1-for possible ways 2-for places to explore 3-for hotels to stay 4-Back.");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
			{
				System.out.println("1. By air");
				System.out.println("   Hyderabad has one international airports.");
				System.out.println("   * Rajiv Gandhi International Airport (HYD), Shamshabad.");
				System.out.println();
				System.out.println("2.By train");
				System.out.println("   Major railway stations in Hyderabad:");
				System.out.println("   * Secunderabad Junction");
				System.out.println("   * Lingampalli Railway Station");
				System.out.println();
				System.out.println("3.By road");
				System.out.println("   Hyderabad using national highways like NH44, NH65, and NH163.");
				System.out.println("   * Telagana State Road Transport Corporation (TSRTC)");
				System.out.println();
				System.out.println();
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Hyderabad();
						break;
					}
					case 2:
					{
						new Hotel().Hyderabadhotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			
			}
			case 2:
			{
				System.out.println("1.Histoical places");
				System.out.println("  ->Charminar");
				System.out.println("    The iconic symbol of Hyderabad is CharminarAn iconic symbol of Hyderabad.");
				System.out.println("    This 16th-century mosque features four grand arches and is surrounded by bustling markets..");
				System.out.println("  ->Golconda Fort");
				System.out.println("    A magnificent fort known for its impressive architecture and acoustics.");
				System.out.println("    A spectacular Sound and Light Show narrates the history of the fort.");
				System.out.println("2.Parks");
				System.out.println("  ->Lumbini Park");
				System.out.println("    A serene park near Hussain Sagar Lake,known for its beautiful landscapes and boating facilities..");
				System.out.println("  ->Nehru Zoological Park");
				System.out.println("    A vast zoo that is home to a wide variety of animals, perfect for a family outing..");
				System.out.println("3.Modern Attractions");
				System.out.println("  ->Ramoji Film City");
				System.out.println("    One of the largest film cities in the world, offering guided tours, film sets, and various entertainment options.");
				System.out.println("  ->Shilparamam");
				System.out.println("    An arts and crafts village that showcases traditional Indian handicrafts and hosts cultural events.");
				System.out.println("4.Temples");
				System.out.println("  ->Birla Mandir");
				System.out.println("    Perched atop Naubat Pahad, this marble temple dedicated to Lord Venkateswara is a peaceful place of worship offering stunning views of the city.");
				System.out.println("  ->Iskon Temple");
				System.out.println("    Sri Radha Madanmohan Mandir, is a beautiful temple dedicated to Lord Krishna");
				System.out.println("To Know more about the place.\n1.Back to the options\n2.To Book the hotels");
				int f=sc.nextInt();
				switch(f)
				{
					case 1:
					{
						Goa();
						break;
					}
					case 2:
					{
						new Hotel().Goahotel();
						break;
					}
					default:
					{
						System.out.println("you have entered wrong input");
						System.out.println("select correct input");
						new Explore().location();
					}
				}
				break;
			}
			case 3:
			{
				new Hotel().Hyderabadhotel();
				break;
			}
			case 4:
			{
				new Explore().location();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input");
				System.out.println("select correct input");
				Hyderabad();
			}
		}

	}
}
class Explore extends Login
{
	static final String def = "\u001b[0;1m";
    static final String blink = "\u001b[5m";
    static final String red =  "\u001b[31;1m";
    static final String green = "\u001b[32;1m";
    static final String yellow = "\u001b[33;1m";
    static final String blue = "\u001b[34;1m";
    static final String purpe = "\u001b[35;1m";
    static final String skblue = "\u001b[36;1m";
    static final String bgred =  "\u001b[101;1m";
    static final String bggreen = "\u001b[102;1m";
    static final String bgyellow = "\u001b[103;1m";
    static final String bgblue = "\u001b[104;1m";
    static final String bgpurpe = "\u001b[105;1m";
    static final String bgskblue = "\u001b[106;1m";

	static Login obj=new Login();
	static Place obj2=new Place();
	void place(int a)
	{
		switch(a)
		{
			case 1:
			{
				obj2.Goa();
				break;
			}
			case 2:
			{
				obj2.Araku();
				break;
			}
			case 3:
			{
				obj2.Kerala();
				break;
			}
			case 4:
			{
				obj2.Hyderabad();
				break;
			}
			case 5:
			{
				placeorhotel();
				break;

			}
			default:
			{
				System.out.println("you have entered wrong input\nplease select correct input");
				location();
			}
		}
	}
	void location()
	{
		
		System.out.println("1.Goa");
	   	System.out.println("2.Araku");
	    	System.out.println("3.Kerala");
	    	System.out.println("4.Hyderabad");
		System.out.println("5.Back");
		System.out.println("Choose a location to visit.");
		int c=sc.nextInt();
		place(c);
	}
	void hotelplace()
	{
		System.out.println("1.Goa Hotels");
		System.out.println("2.Araku Hotels");
		System.out.println("3.Kerala Hotels");
		System.out.println("4.Hyderabad");
		System.out.println("5.Back");
		int s=sc.nextInt();
		switch(s)
		{
			case 1:
			{
				new Hotel().Goahotel();
				break;
			}
			case 2:
			{
				new Hotel().Arakuhotel();
				break;
			}
			case 3:
			{
				new Hotel().Keralahotel();
				break;
			}
			case 4:
			{
				new Hotel().Hyderabadhotel();
				break;
			}
			case 5:
			{
				placeorhotel();
				break;
			}
			default:
			{
				System.out.println("you have entered wrong input.\nplease select correct input");
				hotelplace();
				break;
			}
		}
	}
	void placeorhotel()
	{
		System.out.println("1.To explore the places.\n2.To Explore the Hotels.");
		int s=sc.nextInt();
		switch(s)
		{
			case 1:
			{
				location();
				break;	
			}
			case 2:
			{
				hotelplace();
				break;
			}
			default:
			{
				System.out.println("You have Entered wrong input.\nplease select correct input");
				placeorhotel();
			}
		}
	}
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        Explore obj=new Explore();
		obj.start();
		obj.placeorhotel();		
	}
}
