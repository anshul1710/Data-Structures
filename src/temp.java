
public class temp
{
    @Deprecated
    int aa;

    {
        aa = 10;
    }

    public Integer calculateInteger()
    {

        return 10;
    }

    public Integer calculateIntegerNext()
    {
        return 20;
    }
    public static void main(String[] args)
    {
        temp a=new temp();
        a.calculateIntegerNext();
    }
}