package model;
public class Kereta {
    private String idKereta;
    private String namaKereta;
    private int hargaKereta;
    private boolean isAvailable;

    public Kereta setIdKereta(String idKereta){
        this.idKereta = idKereta;
        return this;
    }
    public Kereta setNamKereta(String namaKereta){
        this.namaKereta = namaKereta;
        return this;
    }
    public Kereta setHargaKereta(int hargaKereta){
        this.hargaKereta = hargaKereta;
        return this;
    }
    public Kereta setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
        return this;
    }


    /**
     * @return String return the idKereta
     */
    public String getIdKereta() {
        return idKereta;
    }

    /**
     * @return String return the namaKereta
     */
    public String getNamaKereta() {
        return namaKereta;
    }

    /**
     * @return int return the hargaKereta
     */
    public int getHargaKereta() {
        return hargaKereta;
    }

    /**
     * @return boolean return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

}