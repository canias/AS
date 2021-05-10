package junit.com;

public class ReceiptImlp implements Receipt{
	int receipt_value;
	public ReceiptImlp(int v)
	{
		receipt_value = v;
	}
	
	public int value() 
	{
		return receipt_value;
	}
}
