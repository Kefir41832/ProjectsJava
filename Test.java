import Containers.Vector;

public class Test {
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<>(5, 8);
        System.out.println(vec.getElement(4));
        System.out.println(vec.size());
        vec.pushBack(3);
        System.out.println(vec.size());
        System.out.println(vec.getElement(5));
        vec.popBack();
        System.out.println(vec.size());
       // vec.pushBack(-1);
        System.out.println(vec.getElement(4));
        //vec.resize(2);
        //System.out.println(vec.size());
    }
}
