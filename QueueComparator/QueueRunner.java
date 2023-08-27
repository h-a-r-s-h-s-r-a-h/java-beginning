package QueueComparator;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.List;
public class QueueRunner{
    public static void main(String[] args){
        Queue<String> harsh = new PriorityQueue<String>(new StringLengthComparator());
        harsh.addAll(List.of("Zebra","Monkey","Cat"));
        System.out.println(harsh.poll());
        System.out.println(harsh.poll());
        System.out.println(harsh.poll());
        System.out.println(harsh.poll());
    }
}
class StringLengthComparator implements Comparator<String>{
    public int compare(String value1,String value2){
        return Integer.compare(value1.length(),value2.length());
    }
}
