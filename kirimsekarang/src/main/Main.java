package main;

import java.util.Scanner;

public class Main {

	public Main() {
		int number = 4;
		do {
			System.out.println("    Kirim Sekarang   ");
			System.out.println("=====================");
			System.out.println("1. Input Pengiriman");
			System.out.println("2. Cek Resi Pengiriman");
			System.out.println("3. Batalkan Pengiriman");
			System.out.println("4. Melihat Semua Data Pengiriman Anda");
			System.out.println("5. Keluar");
			System.out.print("Pilih : ");
			Scanner scan = new Scanner(System.in);
			String menuKirim = scan.nextLine();
			System.out.print("\n");
			number = Integer.parseInt(menuKirim);
			switch (number) {
			case 1:
				new Input();
				break;
			case 2:
				new Check();
				break;
			case 3:
				new Cancel();
				break;
			case 4:
				new ViewAll();
			default:
				break;
			}
			
		} while (number == 1 || number == 2 || number == 3 || number == 4);		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}