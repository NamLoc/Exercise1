package ac.at.fhcampuswien;

public class Password {
    private String password;

    public Password(String password){
        this.password = password;
    }
    public boolean lengthOfPassword(){
        return password.length() >= 8 && password.length() <= 25;
    }

}
