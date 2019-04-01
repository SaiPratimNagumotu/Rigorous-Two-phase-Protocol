import java.util.ArrayList;
import java.util.List;

// Lock Class for which a hashmap with key Item_Name,and values are Lock_Mode, list Locking_Transactions, list Waiting_Transactions
public class Lock {
	public String Item_Name;
	public String Lock_Mode="UL";
	public List<String> Locking_Transactions=new ArrayList();
	public List<String> Waiting_Transactions=new ArrayList();


}
