package password_generator;

import java.util.Scanner;

public class Main {
    public  void display(){
        Scanner input = new Scanner(System.in);

        int digit = input.nextInt();

        String lower_cases="qwertyuiopasdfghjklzxcvbnm";
        String upper_cases="QWERTYUIOPASDFGHJKLZXCVBNM";

        String password="";
        for(int i=0;i<digit;i++)
        {
            int rand=(int)(3 * Math.random());

            switch (rand) 
            {
                case 0:
                    password +=String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand=(int)(lower_cases.length() * Math.random());
                    password +=String.valueOf(lower_cases.charAt(rand));
                    break;
                case 2:
                    rand=(int)(upper_cases.length() * Math.random());
                    password +=String.valueOf(upper_cases.charAt(rand));
                    break;
            }
        }
        System.out.println(password);
        input.close();
    }
    
}