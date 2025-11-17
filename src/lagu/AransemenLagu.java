package lagu;

import java.util.ArrayList;

// Interface Instrumen
interface Instrumen {
    void mainkan(String judulLagu);
}

// Class Utama
public class AransemenLagu {
    private String judulLagu;
    private ArrayList<Instrumen> daftarInstrumen = new ArrayList<>();

    public AransemenLagu(String judulLagu) {
        this.judulLagu = judulLagu;
    }

    // Instrumen dengan Anonymous Class
    public void aturAransemen() {

        Instrumen piano = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Piano memainkan melodi lembut dengan tempo 80 BPM untuk lagu \"" 
                                   + judulLagu + "\"");
            }
        };

        Instrumen gitar = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Gitar memainkan ritme cepat dengan tempo 120 BPM untuk lagu \"" 
                                   + judulLagu + "\"");
            }
        };

        Instrumen drum = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Drum memainkan ketukan dinamis dengan tempo 100 BPM untuk lagu \"" 
                                   + judulLagu + "\"");
            }
        };

        // Masukkan ke ArrayList
        daftarInstrumen.add(piano);
        daftarInstrumen.add(gitar);
        daftarInstrumen.add(drum);
    }

    // Improvisasi dengan anonymous class lain
    public void improvisasi(Instrumen instrumenImprovisasi) {
        System.out.println("\n=== Bagian Improvisasi ===");
        instrumenImprovisasi.mainkan(judulLagu);
    }

    // Menampilkan semua instrumen
    public void tampilkanAransemen() {
        System.out.println("=== Aransemen Lagu: " + judulLagu + " ===");
        for (Instrumen i : daftarInstrumen) {
            i.mainkan(judulLagu);
        }
    }

    // Main
    public static void main(String[] args) {
        AransemenLagu lagu = new AransemenLagu("Harmoni Senja");

        lagu.aturAransemen();
        lagu.tampilkanAransemen();

        // Anonymous class improvisasi (contoh: Biola)
        Instrumen improvisasiBiola = new Instrumen() {
            @Override
            public void mainkan(String judulLagu) {
                System.out.println("Biola memainkan improvisasi dengan nada tinggi dan tempo 90 BPM untuk lagu \"" 
                                   + judulLagu + "\"");
            }
        };

        lagu.improvisasi(improvisasiBiola);
    }
}
