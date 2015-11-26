package red;

import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        for (int a = 1; a < z+1; a++)
        {   for(int b=y-a*(y-x)/(z-1)/2;b>0;b--)
        {System.out.print(" ");}
            for (int c = 1; c <1+x+(y-x)/(z-1)*(a-1); c++)
            {System.out.print("*");}
            System.out.print("\n");
        }

    }
}
