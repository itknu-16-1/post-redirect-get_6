package redirect;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
	
	private static List<String> items = new ArrayList();
	

	public static List<String> getAll() {
		return items;
	}

	public static void add(String parameter) {
		items.add(parameter);
	}
}
