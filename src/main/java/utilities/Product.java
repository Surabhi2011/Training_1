package utilities;

/**
 * This class is to get and set product specification. It has not been used in
 * any scenario and can be ignored
 * 
 * @author surabhi.srivastava
 *
 */
public class Product {
	private String ProductName;
	private float StartRating;
	private int Rating;

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public float getStartRating() {
		return StartRating;
	}

	public void setStartRating(float startRating) {
		StartRating = startRating;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

}
