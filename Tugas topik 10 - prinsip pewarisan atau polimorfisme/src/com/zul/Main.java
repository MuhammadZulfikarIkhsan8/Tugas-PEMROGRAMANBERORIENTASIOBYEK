package com.zul;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main().main();
    }

    // Menu
    private void main() {
        int menu;
        do {
            System.out.println(" ============================\n" +
                    "\t\t Pilihan Menu\n " +
                    "============================\n" +
                    " 1. Input member customer\n " +
                    "2. Input member driver\n " +
                    "3. Tampilkan semua member\n " +
                    "4. Tampilkan member customer\n " +
                    "5. Tampilkan member driver\n " +
                    "6. Top up\n " +
                    "7. Antar\n " +
                    "8. Keluar\n" +
                    " ============================");
            System.out.print(" Pilih Menu : ");
            menu = scannerNumeral.nextInt();
            switch (menu) {
                case 1:
                    inputCustomer();
                    break;
                case 2:
                    inputDriver();
                    break;
                case 3:
                    displayAll(); // Menampilkan Semua Member
                    break;
                case 4:
                    displayMember("customer"); // Menampilkan Member Customer
                    break;
                case 5:
                    displayMember("driver"); // Menampilkan Member Driver
                    break;
                case 6:
                    transaksi(0); // Top Up
                    break;
                case 7:
                    transaksi(1); // Antar
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
        while (menu != 8);
    }

    private ArrayList<Member> members = new ArrayList<>();
    private Scanner scannerString = new Scanner(System.in); // tipe data String
    private Scanner scannerNumeral = new Scanner(System.in); // tipe data Angka/Numeral

    private void inputCustomer() {
        System.out.println("\n ============================");
        System.out.println("\t Input Member Customer");
        System.out.println(" ============================");
        System.out.print(" NIK          : ");
        String nik = scannerString.nextLine();
        System.out.print(" Nama         : ");
        String nama = scannerString.nextLine();
        System.out.print(" Number Phone : ");
        String phoneNumber = scannerString.nextLine();
        System.out.print(" Saldo        : ");
        double cash = scannerNumeral.nextDouble();
        System.out.println(" ============================\n");

        Member customer = new Customer(nik, nama, phoneNumber, cash); // Objek
        members.add(customer);
    }

    private void inputDriver() {
        System.out.println("\n ============================");
        System.out.println("\t Input Member Driver");
        System.out.println(" ============================");
        System.out.print(" NIK             : ");
        String nik = scannerString.nextLine();
        System.out.print(" Nama            : ");
        String nama = scannerString.nextLine();
        System.out.print(" Number Phone    : ");
        String phoneNumber = scannerString.nextLine();
        System.out.print(" Saldo           : ");
        double cash = scannerNumeral.nextDouble();
        System.out.print(" Number Plate    : ");
        String numberPlate = scannerString.nextLine();
        System.out.print(" Jenis Kendaraan : ");
        String type = scannerString.nextLine();
        System.out.println(" ============================\n");

        Member driver = new Driver(nik, nama, phoneNumber, cash, numberPlate, type); // Objek
        members.add(driver);
    }


    private Member searchById(String idMember) {
        Member member = null;
        for (Member idSearch : members) {
            if (idSearch.getNik().equals(idMember)) {
                member = idSearch;
                break;
            }
        }
        return member;
    }

    private void displayAll() {
        for (int i = 0; i < members.size(); i++) {
            Member memberView = members.get(i);
            memberView.display();
        }
    }

    private void displayMember(String member) {
        if (member == "customer") {
            for (Member memberCustomer : members) {
                if (memberCustomer instanceof Customer) {
                    memberCustomer.display();
                }
            }
        } else {
            for (Member memberDriver : members) {
                if (memberDriver instanceof Driver) {
                    memberDriver.display();
                }
            }
        }
    }

    private void transaksi(int type) {
        System.out.println("\n ============================");
        System.out.println("\t       Transaksi");
        System.out.println(" ============================");
        System.out.print(" Id Customer : ");
        String idCustomer = scannerString.nextLine();
        System.out.print(" Id Driver   : ");
        String idDriver = scannerString.nextLine();
        System.out.print(" Biaya       : ");
        double payment = scannerNumeral.nextDouble();

        Member customer = searchById(idCustomer);
        Member driver = searchById(idDriver);

        // instanceof : untuk mengetahui kaitan antara obyek sebuah kelas dalam hierarki turunan dengan kelas lainnya
        if ((customer != null) && (driver != null) && (customer instanceof Customer) && (driver instanceof Driver)) {
            if (type == 0) {
                customer.transaction(driver, payment);
                System.out.println(" ============================");
                System.out.println("Transaksi Top Up Berhasil !");
                System.out.println(" ============================\n");
            } else {
                driver.transaction(customer, payment);
                System.out.println(" ============================");
                System.out.println(" Transaksi Antar Selesai !\n");
                System.out.println(" ============================\n");
                driver.display();
                System.out.println(" Saldo Anda Saat Ini :");
            }
            customer.display();
        }
    }
}
