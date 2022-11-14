public class Mobil2 {
    private String nama ;
    private String jeniskelamin;
    private int umur;
    // setter
    public void setnama(String nama) {
        this.nama = nama;
    }
    public void setjeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public void setumur(int umur) {
        this.umur = umur;
    }
    // getter
    public String getnama() {
        return this.nama;
    }
    public String getjeniskelamin(){
        return this.jeniskelamin;
    }
    public int getumur() {
        return this.umur;
    }
}
