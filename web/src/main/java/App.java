import com.TodoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App{
    public static Logger log= LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        int i=0;
        Scanner sanner= new Scanner(System.in);
        while(++i>0){
            log.info(i+". please intpu todo item name");
            TodoItem item =new TodoItem(sanner.nextLine());
            System.out.println("item = [" + item + "]");
        }

    }
}