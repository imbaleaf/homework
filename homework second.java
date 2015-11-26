package red;

class A {
    public static void main(String args[]) {
        int a=1,b,c;
        while(a<=3)
        {b=8-a;c=1;
            while(b>0)
            {System.out.print(" ");b--;}
            while(c<2*a)
            {System.out.print("*");c++;}
            a++;System.out.print("\n");
        }
        while(a>3&&a<=8)
        {b=1;c=1;
            while(b<6)
            {System.out.print(" ");b++;}
            while(c<6)
            {System.out.print("*");c++;}
            a++;System.out.print("\n");
        }
        while(a>8&&a<=10)
        {b=12-a;c=1;
            while(b>0)
            {System.out.print(" ");b--;}
            while(c<2*a-8)
            {System.out.print("*");c++;}
            a++;System.out.print("\n");
        }
        while(a>10&&a<=14)
        {b=1;c=1;
            while(b<7)
            {System.out.print(" ");b++;}
            while(c<4)
            {System.out.print("*");c++;}
            System.out.print("\n");a++;
        }
    }
}