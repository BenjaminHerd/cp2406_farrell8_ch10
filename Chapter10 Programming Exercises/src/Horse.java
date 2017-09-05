//Class with data fields

public class Horse
{
    //variable declaration
    private String name;
    private String color;
    private int birthYear;

    //Methods for each variable instead of using a much simpler overloaded display method and setting the each values
    // as a 'new' variable like what it does in the debugging exercises...

    //Better for larger sets of data I suppose

    //You should set your variables before getting them
    public void setName(String n)
    {
        name = n;
    }
    public void setColour(String c)
    {
        color = c;
    }
    public void setBirthYear(int y)
    {
        birthYear = y;
    }

    public String getName()
    {
        return name;
    }
    public String getColour()
    {
        return color;
    }
    public int getBirthYear()
    {
        return birthYear;
    }

}