package model;

public class DetilPenjualan {
    private String idDetilPenjualan;
    private Penjualan penjualan;
    private Stasiun penjual;
    private Pembeli pembeli;
    private Kereta Kereta;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;

    
    /**
     * @return String return the idDetilPenjualan
     */
    public String getIdDetilPenjualan() {
        return idDetilPenjualan;
    }

    /**
     * @param idDetilPenjualan the idDetilPenjualan to set
     */
    public void setIdDetilPenjualan(String idDetilPenjualan) {
        this.idDetilPenjualan = idDetilPenjualan;
    }

    /**
     * @return Penjualan return the penjualan
     */
    public Penjualan getPenjualan() {
        return penjualan;
    }

    /**
     * @param penjualan the penjualan to set
     */
    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    /**
     * @return Kereta return the Kereta
     */
    public Kereta getKereta() {
        return Kereta;
    }

    /**
     * @param Kereta the Kereta to set
     */
    public void setKereta(Kereta Kereta) {
        this.Kereta = Kereta;
    }

    /**
     * @return Kereta return the Kereta
     */
    public Pembeli getPembeli() {
        return pembeli;
    }

    /**
     * @param Kereta the Kereta to set
     */
    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

     /**
     * @return Kereta return the Kereta
     */
    public Stasiun getStasiun() {
        return penjual;
    }

    /**
     * @param Kereta the Kereta to set
     */
    public void setStasiun(Stasiun NamaStasiun) {
        this.penjual = NamaStasiun;
    }

    /**
     * @return int return the hargaJual
     */
    public int getHargaJual() {
        return hargaJual;
    }

    /**
     * @param hargaJual the hargaJual to set
     */
    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    /**
     * @return int return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    /**
     * @return int return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

}