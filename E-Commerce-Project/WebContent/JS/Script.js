function add_to_cart(pId, pName, pPrice){

	let cart = localStorage.getItem("cart");
	
	if(cart == null){
		let products = [];
		let product  = {productId : pId, productName : pName, productQty : 1, productPrice : pPrice};
		products.push(product);
		localStorage.setItem("cart", JSON.stringify(products));
		console.log("Product added for first time!");
		
		
	}
	else{
		let pCart = JSON.parse(cart);
		let oldProduct = pCart.find((item) => item.productId == pId);
		console.log(oldProduct);
		if(oldProduct){
			// we have to increase the quantity
			oldProduct.productQty = oldProduct.productQty + 1;
			pCart.map((item) => {
				if(item.productId == oldProduct.productId){
					item.productQty = oldProduct.productQty;
				}
			})
			
			localStorage.setItem("cart", JSON.stringify(pCart));
			console.log("Product quantity is increased!");

			
		}
		else{
			// we have to add the product
			let product  = {productId : pId, productName : pName, productQty : 1, productPrice : pPrice};
			pCart.push(product);
			localStorage.setItem("cart", JSON.stringify(pCart));
			console.log("Product added!");

		}
	}
}

alert("Testing!");