public class Koran extends Rak {
    private String JenisTerbit;
    
    public Koran(int noRak, String Nama, String Penerbit, String TanggalTerbit, String JenisTerbit) {
        super(noRak, Nama, Penerbit, TanggalTerbit);
        this.JenisTerbit = JenisTerbit;
    }

    public String getJenisTerbit() {
        return JenisTerbit;
    }

    public void display() {
        System.out.println("-------------------------------------------------------");
        System.out.println("   Judul          : "+getNama());
        System.out.println("   Penerbit       : "+getPenerbit());
        System.out.println("   Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("   Jenis Terbit   : "+getJenisTerbit());
        System.out.println("-------------------------------------------------------");
    }

    public void display(String Nama) {
        System.out.println("=="+getnoRak()+". "+getNama());
    }
}
