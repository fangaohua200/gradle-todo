import com.TodoItem;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    TodoReporsitory reporsitory=new TodoReporsitory();

    @Test
    public void testReporsitory() {
        TodoItem todoItem=new TodoItem("test",false);
        reporsitory.save(todoItem);
        Assert.assertNotNull(reporsitory.getItem("test"));
        Assert.assertNotNull(reporsitory.getItem("test1"));
    }
}
