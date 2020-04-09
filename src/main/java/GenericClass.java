public class GenericClass <K>{
    //declare the generic variable
    private K input;

    //get value for the generic variable
    public K getInput()
    {
        return input;
    }

    //set value for the generic variable
    public GenericClass(K input)
    {
        this.input = input;
    }
}
