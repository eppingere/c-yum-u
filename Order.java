import java.util.Set;

public class Order {
	private Set<Item> items;
	private static int totalOrders = 0;
	private int orderNumber;
	private Restaurant r;

	public Order(Set<Item> items) {
		this.items = items;
		orderNumber = totalOrders;
		totalOrders++;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public static int getTotalOrders() {
		return totalOrders;
	}

	public Restaurant getR() {
		return r;
	}

	public void setR(Restaurant r) {
		this.r = r;
	}

}
