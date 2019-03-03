package practice;

public class ATM {
	public static void insertCard(String cardType) throws InvalidCardException {
		if(!(cardType.equalsIgnoreCase("visa")||
		cardType.equalsIgnoreCase("mastercard")||
		cardType.equalsIgnoreCase("American Express"))){
			throw new InvalidCardException("Invalid Card type - "+cardType);
		}else {
				System.out.println("Card accepted - "+cardType );
			}
		}
	}


