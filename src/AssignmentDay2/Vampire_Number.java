package AssignmentDay2;
import java.util.*;

public class Vampire_Number {

    public Set<Integer> sampleSET = new TreeSet<Integer>();

    public void isVampire(int vampire){
        String Str = Integer.toString(vampire);
        if(Str.length()%2 == 0){
            permute(Str, 0, Str.length()-1, vampire);
        }
    }

    public void permute(String str, int l, int r, int vampire)
    {
        if (l == r){
            String s1 = str.substring(0, str.length()/2);
            String s2 = str.substring(str.length()/2, str.length());
            int number1 = Integer.parseInt(s1);
            int number2 = Integer.parseInt(s2);
            if(number1*number2 == vampire){
                sampleSET.add(vampire);
            }
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, vampire);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String str, int i, int j)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = str.charAt(i) ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args){
        System.out.println("First 100 Vampire Numbers are :");
        int number = 1000;
        Vampire_Number sampleObj = new Vampire_Number();
        while (sampleObj.sampleSET.size() < 100){
            sampleObj.isVampire(number);
            number++;
        }
        System.out.println(sampleObj.sampleSET);
    }
}
