import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static Account account = new Account(); // Account class instance
	public Main() {

	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) { // I send data from main function with hard-coded.

		Map<String, Object> map = new HashMap<String, Object>(); // Using a Hashmap for the data format.

		ArrayList<AccountNumber> list1 = new ArrayList<>();     // Using Arraylists for number lists.
		ArrayList<AccountNumber> list2 = new ArrayList<>();

		AccountNumber number1 = new AccountNumber();            // Sending data
		number1.setControlDigit("03");
		number1.setBankCode("10103538");
		number1.setOwnerCode("2222123361600142");
		list1.add(number1);

		AccountNumber number2 = new AccountNumber();
		number2.setControlDigit("03");
		number2.setBankCode("10103538");
		number2.setOwnerCode("2222123361600141");
		list1.add(number2);

		AccountNumber number3 = new AccountNumber();
		number3.setControlDigit("30");
		number3.setBankCode("10103538");
		number3.setOwnerCode("2222123361600141");
		list1.add(number3);

		AccountNumber number4 = new AccountNumber();
		number4.setControlDigit("30");
		number4.setBankCode("10103538");
		number4.setOwnerCode("2222123361600142");
		list1.add(number4);

		AccountNumber number5 = new AccountNumber();
		number5.setControlDigit("30");
		number5.setBankCode("10103538");
		number5.setOwnerCode("2222123361600141");
		list1.add(number5);

		AccountNumber number6 = new AccountNumber();
		number6.setControlDigit("30");
		number6.setBankCode("10103538");
		number6.setOwnerCode("2222123361600142");
		list1.add(number6);

		AccountNumber number7 = new AccountNumber();
		number7.setControlDigit("30");
		number7.setBankCode("10103538");
		number7.setOwnerCode("2222123361600144");
		list2.add(number7);

		AccountNumber number8 = new AccountNumber();
		number8.setControlDigit("30");
		number8.setBankCode("10103538");
		number8.setOwnerCode("2222123361600142");
		list2.add(number8);

		AccountNumber number9 = new AccountNumber();
		number9.setControlDigit("30");
		number9.setBankCode("10103538");
		number9.setOwnerCode("2222123361600145");
		list2.add(number9);

		AccountNumber number10 = new AccountNumber();
		number10.setControlDigit("30");
		number10.setBankCode("10103538");
		number10.setOwnerCode("2222123361600146");
		list2.add(number10);

		AccountNumber number11 = new AccountNumber();
		number11.setControlDigit("30");
		number11.setBankCode("10103538");
		number11.setOwnerCode("2222123361600143");
		list2.add(number11);

		map.put("NumberOfTest", 2);   // I prepare indexs for the format.
		map.put("NumberOfAccount1", 6);
		map.put("NumberOfAccount2", 5);
		map.put("list1", list1);
		map.put("list2", list2);

		account.sortAccounts((List<AccountNumber>) (map.get("list1")));  // Sorting the list elements(Account Numbers)
		account.sortAccounts((List<AccountNumber>) (map.get("list2")));
	}

}
