package com.IndianCart.Model;

public class ProductBean {
	private String prodTitle, prodDescription, prodPic;
	private int prodId, prodQty, pCategoryID, prodPrice;

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdTitle() {
		return prodTitle;
	}

	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public String getProdPic() {
		return prodPic;
	}

	public int getpCategoryID() {
		return pCategoryID;
	}

	public void setpCategoryID(int pCategoryID) {
		this.pCategoryID = pCategoryID;
	}

	public void setProdPic(String prodPic) {
		this.prodPic = prodPic;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

}
