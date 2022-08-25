// BMI Calculator Advanced (IF/ELSE)
function bmiCalculator (weight, height) {
    var interpretation;
    var bmi;

    bmi = weight / (height * height);
    if(bmi < 18.5)
    {
        interpretation = "Your BMI is "+bmi+", so you are underweight.";
    }
    else if(bmi <= 24.9)
    {
        interpretation = "Your BMI is "+bmi+", so you have a normal weight.";
    }
    else
    {
        interpretation = "Your BMI is "+bmi+", so you are overweight.";
    }
    
    return interpretation;
}
//Leap Year Challenge Exercise
function isLeap(year) {
    
    if (year % 400 === 0) 
    {
        return ("Leap year.");
    } 
    else 
    {
        if(year % 4 === 0 && year % 100 !== 0)
        {
            return ("Leap year.")
        }
        else
        {
            return ("Not leap year.");
        }
    }
}