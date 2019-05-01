import java.util.List;

public class Account { // Account class for sorting process.

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void sortAccounts(List<AccountNumber> list) { // Sorting method

		AccountNumber temp = new AccountNumber();

		AccountNumber max = list.get(0); // I say that the first element of the list is maybe the biggest one.

		// Comparing the owner codes last 4-digits
		for (int i = 0; i < list.size(); i++) { // Comparing my maximum number with the others.
			if (list.get(i).ownerCodePartsToInt()[3] > max.ownerCodePartsToInt()[3]) {
				temp = max;                    // If another number is bigger than my maximum number, I replace with them.
				max = list.get(i);
				list.set(i, temp);
			}
		}

		// Comparing the control digits.
		for (int i = 0; i < list.size(); i++) { // Comparing my maximum number with the others.
			if (AccountNumber.controlDigitToInt(list.get(i)) > Integer.parseInt(max.getControlDigit())) {
				temp = max;                    // If another number is bigger than my maximum number, I replace with them
				max = list.get(i);
				list.set(i, temp);
			}
		}

		for (int i = 0; i < list.size(); i++) { // Printing the sorted list.
			System.out.println(list.get(i));
		}
		System.out.println();
	}

}
