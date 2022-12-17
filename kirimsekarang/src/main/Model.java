package main;

import java.util.ArrayList;
import java.util.List;

public class Model {

	public static List<List> listData = new ArrayList<>();

	public static List<List> getListData() {
		return listData;
	}

	public static void setListData(List<List> listData) {
		Model.listData = listData;
	}

}
