import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {
        Main constructor = new Main();
        int n=constructor.numberToCheck();
        constructor.checkParity(n);

    }


    public int numberToCheck()
    {

        int number;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Wprowadź liczbę: ");
        number=Integer.parseInt(scanner.nextLine());

        return number;
    }

    public boolean checkParity(int numerToCheckPartity)
    {
        boolean parityStatatus;

        if(((numerToCheckPartity%=3)==0)&&((numerToCheckPartity%=5)==0))
        {
            parityStatatus=true;
            System.out.println("Liczba podzielna prze 3 i 5");
        }
        else
        {
            parityStatatus=false;
            System.out.println("Liczba podzielna przez 3, 5 lub żadną z tych wartości");
        }
        return parityStatatus;
    }
}
