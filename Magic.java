public class Magic {
	public static void main(String[] args) {
        //Set original number
        int myNumber = 15;
        //Magic math steps
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
	}
}