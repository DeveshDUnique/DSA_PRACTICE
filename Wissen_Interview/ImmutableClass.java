 //immutable class, one is string and other is list of string

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class ImmutableClass
{

    private final String stringvalue;
    private final List<String> listOfStrings;


    public ImmutableClass(String stringvalue ,List<String> listOfString)
    {
        this.stringvalue = stringvalue;
        this.listOfStrings=  new ArrayList<>(listOfString);

    }

    public String getStringValue()
    {
        return stringvalue;
    }

   

    public List<String> getListStrings()
    {
        return new ArrayList<>(listOfStrings); 
    }



    public static void main(String[] args) 
    {
        List<String> lst = new ArrayList<>(Arrays.asList("one","two","three"));
        ImmutableClass dd = new ImmutableClass("Dev", lst);
        String str = dd.getStringValue();
        System.out.println(str);
        
        
    }
}











