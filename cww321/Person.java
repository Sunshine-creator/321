package cww321;

import java.util.Scanner;

public class Person {
//    private  String name;
//        private  int age;
//    public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//        public void show(){
//            System.out.println("name : " + name + " " + " age : " + age);
//        }
//
//        @Override
//        public String toString() {      //重写一个toString方法
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    '}';
//    }
public static void main(String[] args) {
//    int sum =0;
//    for (int i = 0; i <=5 ; i++) {
//        sum+=factor(i);
//    }
//    System.out.println("sum = " + sum);
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入您要计算的数：");
    int num =scanner.nextInt();
    System.out.println(sum(num));
}
public  static  int sum ( int x){
    int sum  =0;
    for (int i = 0; i <=x ; i++) {
        sum+=i;
    }
    return sum;
}
  public static int factor(int n){
    int result =1;
      for (int i = 0; i <=n ; i++) {
          result*=i;
      }
      return result;
  }
}
