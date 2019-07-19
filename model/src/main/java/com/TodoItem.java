package  com;
public class TodoItem {

   public String name;
   public  boolean hasDone;


    public TodoItem(String s) {
        this.name=s;
    }

    public TodoItem(String s,boolean f) {
        this.name=s;
        this.hasDone=f;
    }
}
