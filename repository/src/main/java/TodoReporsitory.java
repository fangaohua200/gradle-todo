import com.TodoItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TodoReporsitory {
    public  Logger log= LoggerFactory.getLogger(TodoReporsitory.class);
    static Map<String, TodoItem> map=new HashMap<String,TodoItem>();

    public void  save(TodoItem item){
log.info("save a todo item"+ item);
map.put(item.name,item);
    }

    public TodoItem getItem(String key){
        return map.get(key);
    }
}
