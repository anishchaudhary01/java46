public class UserDefinedException {
    public void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("NOT Eligible to vote age less than 18");
        }else{
            System.out.println("Eligible to vote");
        }
    }
}