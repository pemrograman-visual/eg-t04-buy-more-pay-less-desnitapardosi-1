// 12S24043 - DESNITA PARDOSI
// 12S24018 - KELVIN YOHANES PUTRA
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] jumlah = new int[3];

        jumlah[0] = 0;
        jumlah[1] = 0;
        jumlah[2] = 0;
        double[] harga = new double[3];

        harga[0] = 0;
        harga[1] = 0;
        harga[2] = 0;
        double[] total = new double[3];

        total[0] = 0;
        total[1] = 0;
        total[2] = 0;
        double totalakhir;
        int i;
        int jumlah0;
        int jumlah1;
        int jumlah2;

        i = 0;
        jumlah0 = 0;
        jumlah1 = 0;
        jumlah2 = 0;
        String buku0;
        String buku1;
        String buku2;

        buku0 = "buku";
        buku1 = "buku";
        buku2 = "buku";
        int satu;
        int dua;
        int nol;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[i] = input.nextLine();
            if (iSBN[i].equals("---")) {
                i = 3;
            } else {
                if (iSBN[i].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[i];
                    }
                    if (iSBN[0].equals(buku0)) {
                        i = 0;
                        harga[i] = Double.parseDouble(input.nextLine());
                        jumlah[i] = Integer.parseInt(input.nextLine());
                        jumlah0 = jumlah0 + jumlah[i];
                        nol = 3;
                        i = i + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[0].equals(buku1)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlah[i] = Integer.parseInt(input.nextLine());
                            jumlah1 = jumlah1 + jumlah[i];
                            nol = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlah[i] = Integer.parseInt(input.nextLine());
                            jumlah2 = jumlah2 + jumlah[i];
                            nol = 3;
                            i = 0;
                        }
                    }
                } else {
                    if (iSBN[i].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[i];
                        }
                        if (iSBN[1].equals(buku1)) {
                            i = 1;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlah[i] = Integer.parseInt(input.nextLine());
                            jumlah1 = jumlah1 + jumlah[i];
                            satu = 3;
                            i = i + 1;
                        } else {
                            i = 2;
                            harga[i] = Double.parseDouble(input.nextLine());
                            jumlah[i] = Integer.parseInt(input.nextLine());
                            jumlah2 = jumlah2 + jumlah[i];
                            satu = 3;
                            i = 0;
                        }
                    } else {
                        if (iSBN[i].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[i];
                                i = 2;
                                harga[i] = Double.parseDouble(input.nextLine());
                                jumlah[i] = Integer.parseInt(input.nextLine());
                                jumlah2 = jumlah2 + jumlah[i];
                                dua = 3;
                                i = 0;
                            }
                        }
                    }
                }
            }
        } while (i < 3);
        if (jumlah0 >= 20) {
            harga[0] = harga[0] - harga[0] * 12 / 100;
        } else {
            if (jumlah0 >= 10) {
                harga[0] = harga[0] - harga[0] * 5 / 100;
            } else {
                if (jumlah0 >= 5) {
                    harga[0] = harga[0] - harga[0] * 2 / 100;
                }
            }
        }
        total[0] = harga[0] * jumlah0;
        if (jumlah1 >= 20) {
            harga[1] = harga[1] - harga[1] * 12 / 100;
        } else {
            if (jumlah1 >= 10) {
                harga[1] = harga[1] - harga[1] * 5 / 100;
            } else {
                if (jumlah1 >= 5) {
                    harga[1] = harga[1] - harga[1] * 2 / 100;
                }
            }
        }
        total[1] = harga[1] * jumlah1;
        if (jumlah2 >= 20) {
            harga[2] = harga[2] - harga[2] * 12 / 100;
        } else {
            if (jumlah2 >= 10) {
                harga[2] = harga[2] - harga[2] * 5 / 100;
            } else {
                if (jumlah2 >= 5) {
                    harga[2] = harga[2] - harga[2] * 2 / 100;
                }
            }
        }
        total[2] = harga[2] * jumlah2;
        totalakhir = total[0] + total[1] + total[2];
        System.out.println(toFixed(totalakhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

