public class Generics {
    //The generic method
    public static <K> void printArrayContent(K[] array)
    {
        //Display elements in array passed to the method
        try
        {
            System.out.println();
            System.out.println("--Array elements--");
            for(int k=0; k < array.length; k++)
            {
                System.out.println(array[k]);
            }
        }catch (Exception e){System.out.println("Error displaying array elements");}
    }
}


