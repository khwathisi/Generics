import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        try
        {
            Generics gen = new Generics();
            Scanner in = new Scanner(System.in);

            System.out.println("Generics");
            System.out.println("--please enter s to run default strings, \n i for integers or " +
                    "cs for custom string and ci for custom integer--");
            String response = in.nextLine();
            response.toLowerCase();

            //Array of strings
            String[] strings =  {"Second", "array", "is", "of", "type", "String"};
            //Array of integers
            Integer[] integers = {12, 324, 6, 7900};

            //run for strings
            if(response.equals("s"))
            {
                try
                {
                    gen.printArrayContent(strings);
                }catch (Exception E){System.out.println("Error with printArrayContent(strings)");}
            }

            //run for integers
            else if(response.equals("i"))
            {
                try
                {
                    gen.printArrayContent(integers);
                }catch (Exception E){System.out.println("Error printArrayContent(integers)");}
            }

            //run custom string
            else if(response.equals("cs"))
            {
                try
                {
                    System.out.println("Enter custom string");
                    String test = in.nextLine();
                    GenericClass genClass = new GenericClass(test);

                    System.out.println();
                    System.out.println("--You entered--");
                    System.out.println(genClass.getInput());
                }catch (Exception E){System.out.println("Error running custom string");}
            }

            //run custom integer
            else if(response.equals("ci"))
            {
                try
                {
                    System.out.println("Enter custom Integer");
                    int test = in.nextInt();
                    GenericClass genClass = new GenericClass(test);

                    System.out.println();
                    System.out.println("--You entered--");
                    System.out.println(genClass.getInput());
                }catch (Exception E){System.out.println("Error running custom integer");}
            }

            else
            {
                System.out.println("Invalid input");
            }

        }catch (Exception E){System.out.println("All that could go wrong, has...");}
    }
}
