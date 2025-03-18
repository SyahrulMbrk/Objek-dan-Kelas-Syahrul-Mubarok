package syahrul2309066.objekdankelasgenap;

public class ObjekdanKelasGenap {

    public static class PersegiPanjang { 
        private int panjang, lebar;

        // Konstruktor default
        public PersegiPanjang() {
            this.panjang = 0;
            this.lebar = 0;
        }

        // Konstruktor dengan parameter
        public PersegiPanjang(int panjangBaru, int lebarBaru) {
            this.panjang = panjangBaru;
            this.lebar = lebarBaru;
        }

        // Getter dan Setter
        public int getPanjang() {
            return panjang;
        }

        public void setPanjang(int panjang) {
            this.panjang = panjang;
        }

        public int getLebar() {
            return lebar;
        }

        public void setLebar(int lebar) {
            this.lebar = lebar;
        }

        // Metode untuk menghitung luas
        public int getLuas() {
            return panjang * lebar;
        }

        // Metode untuk menghitung keliling
        public int getKeliling() {
            return 2 * (panjang + lebar);
        }
    }

    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang perpan1 = new PersegiPanjang(1, 1);
        PersegiPanjang perpan2 = new PersegiPanjang(30, 40);
        PersegiPanjang perpan3 = new PersegiPanjang(25, 35);
        
        // Menampilkan hasil
        tampilkanDetail(perpan1, "Persegi Panjang 1");
        tampilkanDetail(perpan2, "Persegi Panjang 2");
        tampilkanDetail(perpan3, "Persegi Panjang 3");
    }

    public static void tampilkanDetail(PersegiPanjang pp, String nama) {
        System.out.println(nama + ":");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
        System.out.println();
    }
}