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
	updateCart();
}

// Update Cart

function updateCart(){
	let cartString = localStorage .getItem("cart");
	let cart = JSON.parse(cartString);
	
	if(cart == null || cart.length == 0){
		console.log("Cart is empty!");
		$(".cart-items").html("(0)");
		$(".cart-body").html("<h3>Cart does not have any items</h3>");
		$(".checkout-btn").addClass('disabled');

	}
	else{
		// there is something in cart to show
		console.log(cart);
		$(".cart-items").html(`(${cart.length})`);
		
		let table = `
		
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th>Item Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total Price</th>
					<th>Action</th>
				</tr>
			</thead>
	
		`;
		
		let totalPrice = 0;
		cart.map((item) => {
			
			table+= `<tr>
						<td>${item.productName}</td>
						<td>${item.productPrice}</td>
						<td>${item.productQty}</td>
						<td>${item.productQty * item.productPrice}</td>
						<td><button class="btn btn-danger btn-sm">Remove</button></td>
					 </tr>
			`
			
			totalPrice += item.productPrice * item.productQty;
		})
		
		table = table + `
		<tr><td colspan='5' class="text-right font-weight-bold">Total Price : ${totalPrice}</td></tr>
		</table>`;
		$(".cart-body").html(table);


	}
	
}

