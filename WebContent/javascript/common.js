function toggleCategories(name)
{		
	var isDisplay = document.getElementById(name).style.display;
	if(isDisplay == "none")
		document.getElementById(name).style.display = "";
	else 
		document.getElementById(name).style.display = "none";
	return false;
}
function moveEvent(ele, changeVal){
	ele.style.border = changeVal;
}