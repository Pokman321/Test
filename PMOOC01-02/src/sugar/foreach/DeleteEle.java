package sugar.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author gs
 * @date 2021/9/12 - 1:13
 */
public class DeleteEle {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for(Iterator<Integer> it=list.iterator(); it.hasNext();){
            if(it.next()==2){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
