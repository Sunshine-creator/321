package cww321;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class TestCollection {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList <>(); //泛型类，让
        // 这个方法和类同时支持多种不通类型的数据。创建Collection
            System.out.println(collection.size());
            System.out.println(collection.isEmpty());
            //插入元素。尾插
            collection.add("加");
            collection.add("油");
            collection.add("武");
            collection.add("汉");
          System.out.println(collection.size());
          System.out.println(collection.isEmpty());
                //转换成数组
         Object [] array = collection.toArray();//
         System.out.println(Arrays.toString(array));
         //for循环
         for(String s : collection){
             System.out.println(s);
         }
        System.out.println(collection.contains("汉"));
         //remove
        collection.remove("汉");
        System.out.println("*******************");
        for(String s : collection){
            System.out.println(s);
        }
        //removeAll
        //clear
        collection.clear();
        System.out.println("清空以后：");
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
    }
}
