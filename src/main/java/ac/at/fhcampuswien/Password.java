package ac.at.fhcampuswien;

public class Password {
    private String password;

    public Password(String password){
        this.password = password;
    }
    public boolean lengthOfPassword(){
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean passwordWithUpAndLow(){
        boolean isUp = false;
        boolean isLow = false;

        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                isUp = true;
            }
            if(Character.isLowerCase(password.charAt(i))){
                isLow = true;
            }
            if(isLow && isUp){
                return true;                                // if true -> no need to go to loop again
            }
        }
        return false;
    }



}
