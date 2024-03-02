package Conditional;


class BMI
{

    public static double BMI(double height, double weight)
    {
        return weight / Math.pow(height, 2);
    }
    // Driver code
    public static void main(String[] args)
    {
        double height = 1.79832;
        double weight = 70;

        // Function call
        double bmi = BMI(height, weight);
        System.out.print("The BMI is " + bmi + " so ");

        if (bmi < 18.5)
            System.out.print("underweight");

        else if (bmi >= 18.5 && bmi < 24.9)
            System.out.print("Healthy");

        else if (bmi >= 24.9 && bmi < 30)
            System.out.print("overweight");

        else if (bmi >= 30)
            System.out.print("Suffering from Obesity");
    }
}

