import java.util.*;
import java.text.DecimalFormat;
class CurrencyConverter
{
    public static void main(String[] args) 
        {
            double USD,GBP,JPY,EUR,AED;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the currency code 1:USD\n2:GBP\n3:JPY\n4:EUR\n5:AED"); 
            code=sc.nextInt();
            if(code == 1)
            {
                System.out.println("Enter rate in USD");
                USD = sc.nextFloat();
                GBP = USD / 94.5;
                System.out.println("GBP : "+f.format(GBP));
                JPY = USD / 0.67;
                System.out.println("JPY : "+f.format(JPY));
                EUR = USD / 85.37;
                System.out.println("EUR : "+f.format(EUR));
                AED = USD / 20.25;
                System.out.println("AED : "+f.format(AED));
            }
			else if (code == 2)
            {
                System.out.println("Enter rate in GBP");
                GBP = sc.nextFloat();
                USD = GBP * 74.3;
                System.out.println("USD : "+f.format(USD));
                JPY = GBP * 0.67;
                System.out.println("JPY : "+f.format(JPY));
                EUR = GBP * 85.37;
                System.out.println("EUR : "+f.format(EUR));
                AED = GBP * 2025;
                System.out.println("AED : "+f.format(AED));
            }
			 else if(code == 3)
            {
                System.out.println("Enter rate in JPY");
                JPY = sc.nextFloat();
                USD = JPY * 74.3;
                System.out.println("USD : "+f.format(USD));
                GBP = JPY * 94.5;
                System.out.println("GBP : "+f.format(GBP));
                EUR = JPY * 85.37;
                System.out.println("EUR : "+f.format(EUR));
                AED = JPY * 20.25;
                System.out.println("AED : "+f.format(AED));
            }
			 else if(code == 4)
            {
                System.out.println("Enter amount in EUR");
                EUR = sc.nextFloat();
                USD = EUR * 74.3;
                System.out.println("USD : "+f.format(USD));
                GBP = EUR * 94.5;
                System.out.println("GBP : "+f.format(GBP));
                JPY = EUR * 0.67;
                System.out.println("Pound : "+f.format(pound));
                AED = EUR * 20.25;
                System.out.println("AED : "+f.format(AED));
            }
			 else if(code == 5)
            {
                System.out.println("Enter rate in AED");
                AED = sc.nextFloat();
                USD = AED * 74.3;
                System.out.println("USD : "+f.format(USD));
                GBP = AED * 94.5;
                System.out.println("GBP : "+f.format(GBP));
                JPY = AED * 0.67;
                System.out.println("JPY : "+f.format(JPY));
                EUR = AED * 85.37;
                System.out.println("EUR : "+f.format(EUR));
            }
            else
                System.out.println("Invalid Code");
    }
}
			
