package model;
public class  Stasiun extends Akun{
    private String idStasiun;
    private String NamaStasiun;


    public Stasiun setidStasiun(String idStasiun){
        this.idStasiun = idStasiun;
        return this;
    }
    public String getidStasiun(){
        return this.idStasiun;
    }
    public Stasiun setNamaStasiun(String NamaStasiun) {
        this.NamaStasiun = NamaStasiun;
        return this;
    }
    public String getNamaStasiun(){
        return this.NamaStasiun;
    }
    
    
}