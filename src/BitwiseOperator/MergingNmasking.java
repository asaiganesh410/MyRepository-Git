package BitwiseOperator;

public class MergingNmasking
{
    public static void main(String[] args)
    {
        byte a = 9, b = 12;
        byte c;
        //Merging of a, b
        c = (byte)(a<<4);
        c = (byte)(c|b);
        System.out.println((c&0b11110000)>>4);//c&0b11110000)>>4(Masking)
        System.out.println((c&0b00001111));//c&0b00001111 Masking
    }
}
