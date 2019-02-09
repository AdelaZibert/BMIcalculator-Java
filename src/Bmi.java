public class Bmi {
	float height;
	float weight;
	
	float calculateBmi(){
		float bmi = weight/((height/100)*(height/100));
		return bmi;
	}
	
	void healthyWeight(float bmiResult){
		if(bmiResult>24.9){
			System.out.println("You're too heavy!");
		}
		else if(17.9 < bmiResult && bmiResult < 25){
			System.out.println("Your weight is healthy!");
		}
		else if(bmiResult < 18){
			System.out.println("You're too skinny!");
		}
	}
}
