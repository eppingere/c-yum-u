import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {

	protected String name;
	protected String andrewId;
	protected List<Order> orders;
	protected Point2D.Double location;
	protected String locationDescription;
	protected Set<String> previousLocationDescriptions;

	public User(String name, String andrewId) {
		this.name = name;
		this.andrewId = andrewId;
		this.orders = new ArrayList<Order>();
		this.location = new Point2D.Double();
	}

	public Order makeOrder(Set<Item> items) {
		Order o = new Order(items);
		orders.add(o);
		return o;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAndrewId() {
		return andrewId;
	}

	public void setAndrewId(String andrewId) {
		this.andrewId = andrewId;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Point2D.Double getLocation() {
		return location;
	}

	public void setLocation(Point2D.Double location) {
		this.location = location;
	}

	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.previousLocationDescriptions.add(this.locationDescription);
		this.locationDescription = locationDescription;
	}

	public Set<String> getPreviousLocationDescriptions() {
		return previousLocationDescriptions;
	}

	public void setPreviousLocationDescriptions(Set<String> previousLocationDescriptions) {
		this.previousLocationDescriptions = previousLocationDescriptions;
	}

}
