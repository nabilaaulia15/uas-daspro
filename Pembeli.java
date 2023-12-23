package model;
public class Pembeli extends Akun{
    private String userName;
    private String NamaPembeli;


    public Pembeli setuserName(String userName){
        this.userName = userName;
        return this;
    }
    public String getuserName(){
        return this.userName;
    }

    public Pembeli setNamaPembeli(String NamaPembeli){
        this.NamaPembeli = NamaPembeli;
        return this;
    }
    public String getNamaPembeli(){
        return this.NamaPembeli;
    }
}