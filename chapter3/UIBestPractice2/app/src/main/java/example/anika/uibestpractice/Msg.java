package example.anika.uibestpractice;

/**
 * Created by Anika on 2018/1/27.
 */

public class Msg {
    public static final int Type_received = 0;
    public static  final int Sent = 1;
    private String content;
    private int type;
    public Msg(String content, int type){
        this.content = content;
        this.type = type;
    }
    public String getContent(){
        return content;
    }
    public int getType(){
        return type;
    }
}
