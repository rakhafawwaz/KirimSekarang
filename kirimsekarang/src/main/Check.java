package main;

import java.util.List;
import java.util.Scanner;

public class Check {

	public Check() {
		List<List> listdata = Model.listData;
		Scanner hold = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukan Nomor Resi Pengiriman: ");
		String nomorResi = scan.nextLine();
		String nomorResiData = null;
		
		for (int i=0; i < listdata.size(); i++) {
			nomorResiData = (String) listdata.get(i).get(0);
			if (nomorResi.equals(nomorResiData)) {
				System.out.println("Nama Pengirim: " + listdata.get(i).get(1));
				System.out.println("Nomor Telepon Pengirim: " + listdata.get(i).get(2));
				System.out.println("Nama Penerima: " + listdata.get(i).get(4));
				System.out.println("Nomor Telepon Penerima: " + listdata.get(i).get(5));
				System.out.println("Alamat Tujuan: " + listdata.get(i).get(3));
				System.out.println("Nama Barang: " + listdata.get(i).get(6));
				System.out.println("Tipe Barang: " + listdata.get(i).get(7));
				System.out.println("Ukuran Barang: " + listdata.get(i).get(8));
				System.out.println("Status Pengiriman: " + listdata.get(i).get(9));
			}
			
		}
		
		if (nomorResiData == null) {
			System.out.println("Nomor Resi Tidak Terinput!");
		}
		
		System.out.println("Tekan Enter untuk melanjutkan...");
		hold.nextLine();
	}

}
