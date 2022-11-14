public class MobilBeraksi2 {
    public static void main(String[] args){
    // Membuat object
    Mobil2 anton = new Mobil2();
    Mobil2 riko = new Mobil2();
    /* memanggil atribut dan memberi nilai */
    anton.setnama("anton");
    anton.setjeniskelamin("laki-laki");
    anton.setumur(21);
    System.out.println("nama         : " + anton.getnama());
    System.out.println("jenis kelamin:"+ anton.getjeniskelamin());
    System.out.println("umur         : " + anton.getumur());
    riko.setnama("raka");
    riko.setjeniskelamin("laki");
    riko.setumur(22);
    System.out.println("nama         : " + riko.getnama());
    System.out.println("jenis kelamin:"+ riko.getjeniskelamin());
    System.out.println("umur         : " + riko.getumur());
    }
}
