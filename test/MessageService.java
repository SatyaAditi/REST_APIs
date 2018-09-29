package test;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    public List<Message> getAllMessages()
    {
    	Message m=new Message(1,"hello aditi","aditi");
    	Message m1=new Message(2,"sjdh","sindhi");
    	Message m2=new Message(3,"happy","rani");
    	
    	ArrayList<Message> list=new ArrayList<>();
    	list.add(m);
    	list.add(m1);
    	list.add(m2);
    	
    	return list;
    	
    	
    }
}
