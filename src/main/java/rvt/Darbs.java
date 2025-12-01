package rvt;

import java.util.ArrayList;

public class Darbs {
    class Skolens {
        String vards;
        int vecums;
        ArrayList<Integer> atzimes;

        Skolens(String vards, int vecums, ArrayList<Integer> atzimes) {
            this.vards = vards;
            this.vecums = vecums;
            this.atzimes = atzimes;
        }
        void pievienotAtzimi(int atzime) {
            atzimes.add(atzime);
        }
        String videjaAtzime() {
            int summa = 0;
            if (atzimes.size() == 0) {
                return "Nav atzimju";
            } else {
                for (int atzime : atzimes) {
                    summa += atzime;
                }
                return String.valueOf((double) summa / atzimes.size());
            }
        }
    }

    class Kurss{
        String nosaukums;
        ArrayList<Skolens> skoleni;
        Kurss(String nosaukums, ArrayList<Skolens> skolēni) {
            this.nosaukums = nosaukums;
            this.skoleni = skolēni;
        }
        void pievienotSkolēnu(Skolens skolens) {
            skoleni.add(skolens);
        }
        void paraditSkolenus() {
            for (Skolens skolens : skoleni) {
                System.out.println("Vards: " + skolens.vards + ", Vecums: " + skolens.vecums + ", Videja atzime: " + skolens.videjaAtzime());
            }
        }
    }
    public static void main(String[] args) {
        Darbs darbs = new Darbs();

        ArrayList<Skolens> skoleni = new ArrayList<>();
        Skolens skolens1 = darbs.new Skolens("Janis", 16, new ArrayList<>());
        Skolens skolens2 = darbs.new Skolens("Anna", 17, new ArrayList<>());
        Skolens skolens3 = darbs.new Skolens("Peteris", 16, new ArrayList<>());
        skoleni.add(skolens1);
        skoleni.add(skolens2);
        skoleni.add(skolens3);
        Kurss kurss = darbs.new Kurss("Matematika", skoleni);
        skolens1.pievienotAtzimi(8);
        skolens1.pievienotAtzimi(9);
        skolens2.pievienotAtzimi(10);
        skolens2.pievienotAtzimi(7);
        kurss.paraditSkolenus();
    }
}


