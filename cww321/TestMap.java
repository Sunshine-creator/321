package cww321;
import java.util.HashMap;
import java.util.Map;
public class TestMap {
    public static void main(String[] args) {
         Map<String,String> map = new HashMap <>();
         //size键值对个数
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        //键值对插入.put
        map.put("豹子头","林冲");
        map.put("智多星","吴用");
        map.put("黑旋风","李逵");
        map.put("玉麒麟","卢俊义");
        //get方法依据key来查找对应的vaule，不存在，返回null
        System.out.println(map.get("智多星"));
        System.out.println(map.get("行者孙"));
        System.out.println("*******************");
        System.out.println(map.getOrDefault("行者孙","查找错误"));
         //contains.key contains.vaule判断是否存在
        System.out.println(map.containsKey("智多星"));
        System.out.println(map.containsValue("李逵"));
        //foreach遍历数组
        //这里的元素顺序和插入顺序无关，和他的实现方式有关
        for(Map.Entry<String , String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
