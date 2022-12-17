package main;

import java.util.List;
import java.util.Scanner;

public class Cancel {

	public Cancel() {
		List<List> listdata = Model.listData;
		Scanner hold = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan Nomor Resi Pengiriman yang ingin dibatalkan: ");
		String input = scan.nextLine();
		
		for (int i=0; i < listdata.size(); i++) {
			if (listdata.get(i).get(0).equals(input)) {
				listdata.remove(i);
			}
		}
		
		System.out.println("Nomor Resi: " + input + ", telah berhasil dibatalkan!");
		System.out.println("Tekan Enter untuk melanjutkan...");
		hold.nextLine();
	}

}
