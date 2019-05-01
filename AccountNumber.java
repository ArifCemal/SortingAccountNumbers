public class AccountNumber {  // Account number object

	private String controlDigit;  // It has three properties.
	private String bankCode;
	private String ownerCode;

	public AccountNumber() {
		
	}

	public String getControlDigit() {
		return controlDigit;
	}

	public void setControlDigit(String controlDigit) {
		this.controlDigit = controlDigit;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	@Override
	public String toString() {  //Overriding toString Method
		return this.controlDigit + " " + this.bankCode + " " + splittedOwnerCode();
	}

	private String splittedOwnerCode() { // Generating a string with blanks from 4-digit parts of the owner codes.
		String splittedOwnerCode = "";

		String[] parts = ownerCodeParts();

		for (int i = 0; i < parts.length; i++) {
			splittedOwnerCode += parts[i] + " ";
		}
		return splittedOwnerCode;
	}

	public static int controlDigitToInt(AccountNumber number) { // Converting control digits to integer.
		return Integer.parseInt(number.controlDigit);
	}

	public int[] ownerCodePartsToInt() { // Converting 4-digit parts of the owner code into integer.
		String[] parts = ownerCodeParts();
		int[] numParts = new int[4];
		for (int i = 0; i < parts.length; i++) {
			numParts[i] = Integer.parseInt(parts[i]);
		}

		return numParts;
	}

	private String[] ownerCodeParts() { // Splitting 16-digit owner code string into 4-digit strings.
		String[] parts = new String[4];
		int j = 0;
		for (int i = 1; i <= this.ownerCode.length(); i++) {
			if ((i % 4 == 1)) {
				char[] temp = { this.ownerCode.charAt(i - 1) };
				parts[j] = String.copyValueOf(temp);
			} else {
				parts[j] += this.ownerCode.charAt(i - 1);
			}

			if (i % 4 == 0) {
				j++;
			}
		}
		return parts;
	}

}
