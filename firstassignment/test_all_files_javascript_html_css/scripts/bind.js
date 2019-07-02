window.addEventListener("load", init, false);
function init() {


	function flexible( ) {
		console.log(this.name);
	}

	// binding allows scope to be attached
	// without invoking the method
	// as opposed to .call or .apply
	
	var flex1 = flexible.bind({
		name: "Claude"
	}), 
	flex2 = flexible.bind({
		name: "Schnookums"
	}),
	flex3 = flexible.bind({
		name: "Lulu"
	});
	
	flex1();
	flex2();
	flex3();
	
}
