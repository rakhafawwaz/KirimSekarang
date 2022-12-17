package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

	public Input() {
		List<String> data = new ArrayList<>();		
		Scanner hold = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String status = null;
		
		int minresi = 0;
		int maxresi = 999;
		int random = (int) Math.floor(Math.random() * (maxresi - minresi + 1) + minresi);
		String noResi = "KS" + random;
		data.add(0, noResi);
		
		System.out.print("Nama Pengirim: ");
	    String namaPengirim = scan.nextLine();
	    data.add(1, namaPengirim);
	    
	    System.out.print("No. Telefon Pengirim: ");
	    String noTelpPengirim = scan.nextLine();
	    data.add(2, noTelpPengirim);
	        
	    System.out.print("Alamat Tujuan: ");
	    String alamatTujuan = scan.nextLine();
	    data.add(3, alamatTujuan);
	    
		System.out.print("Nama Penerima: ");
	    String namaPenerima = scan.nextLine();
	    data.add(4, namaPenerima);
	    
	    System.out.print("No. Telefon Penerima: ");
	    String noTelpPenerima = scan.nextLine();
	    data.add(5, noTelpPenerima);
	    
	    System.out.print("Nama Barang: ");
	    String namaBarang = scan.nextLine();
	    data.add(6, namaBarang);
	    
	    System.out.print("Tipe Barang [Keras / Lunak]: ");
	    String tipeBarang = scan.nextLine();
	    while (!("Keras".equals(tipeBarang)) && !("Lunak".equals(tipeBarang))){
	    	System.out.print("Tipe Barang [Keras / Lunak]: ");
		    tipeBarang = scan.nextLine();
	    }
	    data.add(7, tipeBarang);
	    
	    System.out.print("Ukuran Barang [Kecil / Sedang / Besar]: ");
	    String ukuranBarang = scan.nextLine();
	    while (!("Kecil".equals(ukuranBarang)) && !("Sedang".equals(ukuranBarang)) && !("Besar".equals(ukuranBarang))){
	    	System.out.print("Ukuran Barang [Kecil / Sedang / Besar]: ");
		    ukuranBarang = scan.nextLine();
	    }
	    data.add(8, ukuranBarang);
	    
		int min = 1;
		int max = 3;
		int randm = (int) Math.floor(Math.random() * (max - min + 1) + min);
		switch (randm) {
		case 1:
			status = "Proses";
			break;
		case 2:
			status = "Dalam Pengiriman";
			break;
		case 3:
			status = "Sudah Sampai Tujuan";
			break;
		default:
			break;
		}
		data.add(9, status);
	   
	    Model.listData.add(data);
	    System.out.print("\n");
	    System.out.println("Barang berhasil ter-input, Barang akan segera diproses!");
	    System.out.println("Nomor Resi Pengiriman anda: " + noResi);
	    System.out.println("Untuk melihat detail pengiriman, dapat dilihat melalui menu 2. Cek Resi Pengiriman");
	    System.out.println("Tekan Enter untuk melanjutkan...");
	    hold.nextLine();
		
	}
}