package AssignmentDay2;
import java.util.*;

/**
 * @author Manish Goyal
 * VampireNumber class to print vampire numbers for given count
 */
public class VampireNumber {
    /**
     * Instance ArrayList member variable created to contain the vampire numbers
     */
    ArrayList<Integer> vampireNumbers;

    /**
     * <p>Method to find vampire numbers and return ArrayList containing vampire numbers</p>
     * @param count A int argument for declaring total vampire numbers
     * @return ArrayList containing vampire numbers of size count
     */
    public ArrayList<Integer> isVampire(int count, ArrayList<Integer> vampireNumbers){
        int pwr = 1;

        //While Loop to continue finding vampire numbers until arrayList contain count vampire numbers
        while(vampireNumbers.size() < count){

            // Two 'For loop' to take two numbers containing same number of digits
            for(int part1 = (int)Math.pow(10, pwr); part1 < Math.pow(10,pwr+1); part1++){

                for(int part2 = part1; part2 < Math.pow(10,pwr+1); part2++){

                    // Considering the condition when both number have trailing zeros.
                    if((part1 % 10 == 0 && part2 % 10 == 0) || vampireNumbers.size() >= count){
                        continue;
                    }
                    int vampire = part1*part2;

                    // Converting integer to string and than sorting them individually
                    String TotalString = Integer.toString(part1) + Integer.toString(part2);
                    String vampireString = Integer.toString(vampire);
                    char[] totalStringChar = TotalString.toCharArray();
                    char[] vampireStringChar = vampireString.toCharArray();
                    Arrays.sort(totalStringChar);
                    Arrays.sort(vampireStringChar);

                    // Equating both string and checking whether arrayList contains that number.
                    if(Arrays.equals(totalStringChar,vampireStringChar)){
                        if(!vampireNumbers.contains(vampire)){
                            vampireNumbers.add(vampire);
                        }
                    }
                }
            }
            pwr++;
        }
        return vampireNumbers;
    }

    public static void main(String[] args) {
        VampireNumber obj = new VampireNumber();

        //Declaring arrayList of object of class VampireNumber
        obj.vampireNumbers = new ArrayList<Integer>();
        obj.isVampire(100, obj.vampireNumbers);

        //Sorting ArrayList
        Collections.sort(obj.vampireNumbers);
        System.out.println(obj.vampireNumbers);
    }
}