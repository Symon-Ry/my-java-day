package cn.ry.exer;

public class StringDemo {
    public static void main(String[] args) {
        /*String mainStr="abkkcadkabkebfkaabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);*/

        String str1="abcwerthelloyuiodefabcdef";
        String str2="cvhellobnm";
        System.out.println(getMaxSameString(str1,str2));

    }


    /*获取subStr在mainStr中出现的次数*/
    public static int getCount(String mainStr,String SubStr){
        int count=0;
        int index=0;
        if(mainStr.length()>SubStr.length()){
            while ((index=mainStr.indexOf(SubStr,index))!=-1){
                count++;
                index+=SubStr.length();
            }
            return count;
        }
        return 0;
    }

    /*
    获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodefabcdef";str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。

     */
    //前提：两个字符串中只有一个最大相同子串
    public static String getMaxSameString(String str1, String str2) {
        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length())? str1 : str2;
            String minStr = (str1.length() < str2.length())? str1 : str2;
            int length = minStr.length();

            for (int i = 0; i < length; i++) {
                for(int x=0,y=length-i;y<=length;x++,y++){
                    String subStr=minStr.substring(x,y);
                    if(maxStr.contains(subStr))
                        return subStr;
                }
            }

        }
        return null;

    }
}
