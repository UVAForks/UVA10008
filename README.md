# UVA10008

解題技巧:字母統計


```
import java.util.*;

class Letter implements Comparable<Letter>//實作Arrays.sort方法
{                                         //建立一個class名稱叫做Letter
    char chars;                          //Letter包含了 chars與count有如衣服的顏色與尺寸
    int count;
    public int compareTo(Letter t)//compareTo() 方法用于两种方式的比较：(Letter t)則是你的物件Letter與你要比較的的物件t
    {                             //字符串与对象进行比较// 。按字典顺序比较两个字符串。
        if(count > t.count)       //ex.int compareTo(Object o) or int compareTo(String anotherString)
        {                         // 比較字母與次數 -1表示不交換1反之
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
        Letter arr[] = new Letter[26];//建立26個字母利用for迴圈產生空白的具有26陣列
        for(int i = 0;i < 26;i++)
        {
            arr[i] = new Letter();
        }
        for(int i = 0;i < 26;i++)
        {
            arr[i].chars = (char)('A'+i);//加上i用於找到正確的ASCii位子
            arr[i].count = 0;
        }
        int cases = sc.nextInt();//開始輸入
        sc.hasNextLine();//遇到換行讀入而不管他
        while(cases-- >= 0)//讀入次數
        {
            String str = sc.nextLine().toUpperCase();//預處理 先讀入後轉成大寫
            for(int i = 0;i < str.length();i++)//計算次數
            {
                if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                {
                    arr[str.charAt(i)-'A'].count++;
                }
            }
        }
        Arrays.sort(arr);//排序大的先輸出
        for(int i = 0;i < arr.length;i++)//輸出
        {
            if(arr[i].count > 0)
            {
                System.out.println(arr[i].chars+" "+arr[i].count);
            }
        }
    }
 }

```
