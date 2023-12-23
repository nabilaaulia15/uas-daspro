package model;
public class Akun {

    private String name;
    private String NoKtp;
    private String email;


    public Akun setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setKtp(String NoKtp) {
        this.NoKtp = NoKtp;
        return this;
    }

    public String getKtp() {
        return this.NoKtp;
    }

}
