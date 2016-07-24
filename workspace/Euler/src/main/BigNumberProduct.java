package main;

public class BigNumberProduct {
	public static void main(String[] args) {
		String num = "73167176531330624919225119674426574742355349194934969835203127745063262395783180169848018694788518438586156078911294949545950173795833195285320880551112540698747158523863050715693290963295227443043557668966489504452445231617318564030987111217223831136222989342338030813533627661428280644448664523874930358907296290491560440772390713810515859307960866701724271218839987979087922749219016997208880937766572733300105533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		long bignum = 0;
		int amount = 13;
		long product = 0;
		product = Character.getNumericValue(num.charAt(0));
		for(int i3 = 0;i3<amount-1;i3++){
			product *=  Character.getNumericValue(num.charAt(i3+1));
		}
		bignum = product;
		for(int i = amount;i<1000;i++){
			if(Character.getNumericValue(num.charAt(i)) == 0){
				if(Character.getNumericValue(num.charAt(i+1)) != 0){
					i += amount;
					System.out.print("Multi: ");
					product = Character.getNumericValue(num.charAt(i-amount+1));
					System.out.print(Character.getNumericValue(num.charAt(i-amount+1)) + " * ");
					for(int i3 = i-amount+1;i3<i;i3++){
						if(Character.getNumericValue(num.charAt(i3+1)) == 0){
							i = i3;
							break;
						}
						else{
							product *=  Character.getNumericValue(num.charAt(i3+1));
							System.out.print(Character.getNumericValue(num.charAt(i3+1))+ " * ");
						}
					}
				}
				else System.out.println("Double");
			}
			else{
				product /= Character.getNumericValue(num.charAt(i-amount));
				product *= Character.getNumericValue(num.charAt(i));
				
			}
			if(product > bignum){
				bignum = product;
			}
			System.out.println("Product: " + product);
			System.out.println(Character.getNumericValue(num.charAt(i)));

		}
		System.out.println("Bignum " + bignum);

	}
}