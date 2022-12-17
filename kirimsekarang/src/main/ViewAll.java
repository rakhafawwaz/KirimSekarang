package main;

import java.util.List;
import java.util.Scanner;

public class ViewAll {

	public ViewAll() {
		List<List> listdata = Model.listData;
		Scanner hold = new Scanner(System.in);
		
		System.out.println("Data Pengiriman Anda");
		System.out.println("====================");
		for (int i = 0; i < listdata.size(); i++) {
			System.out.println("Nama Pengirim: " + listdata.get(i).get(1));
			System.out.println("Nomor Telepon Pengirim: " + listdata.get(i).get(2));
			System.out.println("Nama Penerima: " + listdata.get(i).get(4));
			System.out.println("Nomor Telepon Penerima: " + listdata.get(i).get(5));
			System.out.println("Alamat Tujuan: " + listdata.get(i).get(3));
			System.out.println("Nama Barang: " + listdata.get(i).get(6));
			System.out.println("Tipe Barang: " + listdata.get(i).get(7));
			System.out.println("Ukuran Barang: " + listdata.get(i).get(8));
			System.out.println("Status Pengiriman: " + listdata.get(i).get(9));
			System.out.print("--------------------------------------\n");
		}
		
		if (listdata.size() == 0) {
			System.out.println("Data Pengiriman Kosong!");
		}

		System.out.println("Tekan Enter untuk melanjutkan...");
		hold.nextLine();
	}

}
