

document.onload = function(){
loadHomeForUser();
}();

function loadHomeForUser() {
    console.log("Loading Home Page for user");
	document.getElementById("moviedetails").style.display="block";
	document.getElementById("purchaseddetails").style.display="none";
	document.getElementById("pendingrejected").style.display="none";
}

function loadPuchased() {
	document.getElementById("moviedetails").style.display="none";
	document.getElementById("purchaseddetails").style.display="block";
	document.getElementById("pendingrejected").style.display="none";
	console.log("Loading purchased Page for user");
}


function loadPendingAndRejected() {
	document.getElementById("moviedetails").style.display="none";
	document.getElementById("purchaseddetails").style.display="none";
	document.getElementById("pendingrejected").style.display="block";
	console.log("Loading loadPendingAndRejected for user");
}

function loadMyProfile() {
	document.getElementById("moviedetails").style.display="none";
	document.getElementById("purchaseddetails").style.display="none";
	document.getElementById("pendingrejected").style.display="none";
	console.log("Loading MyProfile for user");
}
