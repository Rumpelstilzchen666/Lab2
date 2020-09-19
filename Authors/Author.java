package Authors;

public class Author {
    private final String name;
    private char gender = 'U';
    private String email = "NoEmail";

    public Author(String name) { this.name = name; }

    public Author(String name, char gender) {
        this.name = name;
        setGender(gender);
    }

    public Author(String name, char gender, String email) {
        this.name = name;
        setGender(gender);
        this.email = email;
    }

    private void setGender(char gender) {
        if (gender == 'm' || gender == 'M')
            this.gender = 'm';
        else
            if (gender == 'f' || gender == 'F')
                this.gender = 'f';
            else
                this.gender = 'u';
    }

    public String getName() { return name; }

    public char getGender() { return gender; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String toString(){
        return name + (gender != 'u' ? " (" + (gender == 'm' ? "male" : "female") + ")" : '\0') + (email != "NoEmail" ? " at " + email : " has no email");
    }
}
