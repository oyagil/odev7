package org.example;

public class Gezegen {
    private String isim;
    private int siralamaNumarasi;
    private double uzaklik; // milyon kilometre cinsinden
    private double yaricap; // kilometre cinsinden
    private double donmeSuresi; // saat cinsinden

    // Kurucu metod
    public Gezegen(String isim, int siralamaNumarasi, double uzaklik, double yaricap, double donmeSuresi) {
        this.isim = isim;
        this.siralamaNumarasi = siralamaNumarasi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    // Getter ve Setter metotları
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getSiralamaNumarasi() {
        return siralamaNumarasi;
    }

    public void setSiralamaNumarasi(int siralamaNumarasi) {
        this.siralamaNumarasi = siralamaNumarasi;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public void setUzaklik(double uzaklik) {
        this.uzaklik = uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

    public void setDonmeSuresi(double donmeSuresi) {
        this.donmeSuresi = donmeSuresi;
    }

    // toString metodu, nesnenin string temsilini döndürür
    @Override
    public String toString() {
        return "Gezegen{" +
                "isim='" + isim + '\'' +
                ", siralamaNumarasi=" + siralamaNumarasi +
                ", uzaklik=" + uzaklik +
                ", yaricap=" + yaricap +
                ", donmeSuresi=" + donmeSuresi +
                '}';
    }

    // Test
    public static void main(String[] args) {
        // Örnek gezegenler oluşturuluyor
        Gezegen merkur = new Gezegen("Merkür", 1, 57.9, 2439.7, 1407.6);
        Gezegen venus = new Gezegen("Venüs", 2, 108.2, 6051.8, -5832.5);
        Gezegen dunya = new Gezegen("Dünya", 3, 149.6, 6371, 24);
        Gezegen mars = new Gezegen("Mars", 4, 227.9, 3389.5, 24.7);
        Gezegen jupiter = new Gezegen("Jüpiter", 5, 778.6, 69911, 9.9);
        Gezegen saturn = new Gezegen("Satürn", 6, 1433.5, 58232, 10.7);
        Gezegen uranus = new Gezegen("Uranüs", 7, 2872.5, 25362, -17.2);
        Gezegen neptun = new Gezegen("Neptün", 8, 4495.1, 24622, 16.1);

        // Gezegen bilgilerini yazdırma
        System.out.println(merkur);
        System.out.println(venus);
        System.out.println(dunya);
        System.out.println(mars);
        System.out.println(jupiter);
        System.out.println(saturn);
        System.out.println(uranus);
        System.out.println(neptun);
    }
}
