import java.util.Arrays;

public class Practice {
    //Chapter 1 : Arrays and Strings
    public static void main(String[] args) {
        int val = 'a';
        System.out.println(val);
        System.out.println(permutation2("hhhyyy","yyyhhh"));;

        String s = "aadddcccbb";
        char[] charA = s.toCharArray();
        Arrays.sort(charA);
        System.out.println(charA);
    }

    String joinWords(String[] words){
        String s = "";
        for(String a: words){
            s = s + a;
        }
        return s;
    } // O(n^2)

    String joinWords2(String[] words){

        StringBuilder sb = new StringBuilder();
        for(String b : words){
            sb.append(b);
        }

        return sb.toString();//O(n)
    }

    boolean isUnique(String example){
        if(example.length()> 128){
            return false;
        }
        boolean[] flag = new boolean[128]; //128 flags
        for (int i = 0; i < example.length(); i++) {
            int val2 = example.charAt(i);
            if(flag[val2]){
                return false;
            }


            flag[val2] = true;
        }
        return true;
    }//O(1)

     boolean isPermutation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        return sort(a).equals(sort(b));
    }

    String sort(String x){
        char[] ch = x.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static boolean permutation2(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int[] letters = new int[128];
        char[] chArray = a.toCharArray();

        for(char c : chArray){
            int num = c;
            letters[num] ++;
        }
        char[] bArray = b.toCharArray();
        for(char c : bArray){
            int num2 = c;
            if(letters[num2]<0){
                return false;
            }
            letters[num2] --;
        }
        return true;


    }




}
