public class Magic {
	public static void main(String[] args) {
        //Set original number
        int myNumber = 15;
        //Magic math steps
        int magicNumber = myNumber * myNumber;
        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;
        System.out.println(magicNumber);
	}
}