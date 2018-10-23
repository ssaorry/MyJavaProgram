package adaptor.template;

/***
 * 一次性实现算法中不变的部分
 * 将可变的部分交给子类来实现
 */
public class MainClass {
   public static void main(String[] args){
       CookTemplate cookTemplate = new Cook();
       cookTemplate.cookProcess();
   }
}
