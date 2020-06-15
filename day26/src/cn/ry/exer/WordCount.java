package cn.ry.exer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        FileReader fr= null;
        BufferedWriter bw= null;
        try {
            //1、造流;創建map集合
            fr = new FileReader(new File("dbcp.txt"));
            bw = new BufferedWriter(new FileWriter("WordCount.txt"));
            Map<Character,Integer> map=new HashMap<>();

            //2、往map读数据
            int ch;
            while ((ch=fr.read())!=-1){

                char key=(char)ch;
                if((map.get(key))==null){
                    map.put(key,1);
                }else {
                    map.put(key,map.get(key)+1);
                }
            }

            //3、遍历map，写入目标文件
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry:
                 entrySet) {
                switch (entry.getKey()){

                    case ' ':
                        bw.write("空格="+entry.getValue());
                        break;
                    case '\t'://\t表示tab 键字符
                        bw.write("tab="+entry.getValue());
                        break;
                    case '\r':
                        bw.write("回车="+entry.getValue());
                        break;
                    case '\n':
                        bw.write("换行="+entry.getValue());
                        break;
                    default:
                        bw.write(entry.getKey()+"="+entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流

            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
