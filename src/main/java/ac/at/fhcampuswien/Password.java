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
    public boolean passwordWithNumbers(){
        boolean passWithNumbers = false;

        for(int i = 0; i < password.length(); i++){
            if(password.matches(".\\d+.")){
                passWithNumbers = true;
            }
            if(passWithNumbers){
                return true;
            }
        }
        return false;
    }

    public boolean passwordWithSymbol(){
        return (password.matches(".*[()#$?!%/@].*"));
    }

    public boolean notMoreThan2Num(){
        int count = 0;
        char previous = password.charAt(0);

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                if (previous + 1 == c) {
                    count++;
                }
                if (count >= 3) {                           //for example 123 -> false
                    return false;
                }
                previous = c;
            }
        }
        return true;
    }



}
