function add_to_cart(pId, pName, pPrice){
	let cart = localStorage.getItem("cart");
	if(cart == null){
		let products = [];
		let prodcut  = {prodcutId : pId, productName : pName, productQty : 1, productPrice : pPrice};
		products.push(product);
		localStorage.setItem("cart", JSON.stringify(products));
		
		
	}
	else{
		
	}
}