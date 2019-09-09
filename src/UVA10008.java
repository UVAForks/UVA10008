import java.util.*;

class Letter implements Comparable<Letter>
{
    char chars;
    int count;
    public int compareTo(Letter t)
    {
        if(count > t.count)
        {
            return -1;//NO
        }
        else if(count < t.count)
        {
            return 1;//Yes
        }
        else if(chars < t.chars)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }


}

public class UVA10008
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Letter ans = new Letter();
        ans.chars = 'a';
        ans.count = 2;
        Letter arr[] = new Letter[26];
        for(int i = 0;i < 26;i++)
        {
            arr[i] = new Letter();
        }
        for(int i = 0;i < 26;i++)
        {
            arr[i].chars = (char)('A'+i);
            arr[i].count = 0;
            //.out.println(arr[i].chars+" "+arr[i].count);
        }
        int cases = sc.nextInt();
        sc.hasNextLine();
        while(cases-- >= 0)
        {
            String str = sc.nextLine().toUpperCase();
            for(int i = 0;i < str.length();i++)
            {
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    arr[str.charAt(i)-'A'].count++;
                }
            }
        }
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i].count > 0)
            {
                System.out.println(arr[i].chars+" "+arr[i].count);
            }
        }
    }
 }

