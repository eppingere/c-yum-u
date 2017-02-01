import java.util.Map;

public class Restaurant {
	private String name;
	private String description;
	private Map<Item, Integer> items;

	public Restaurant(String name, String description, Map<Item, Integer> items) {
		this.name = name;
		this.description = description;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Map<Item, Integer> getItems() {
		return items;
	}

	public void setItems(Map<Item, Integer> items) {
		this.items = items;
	}

}
