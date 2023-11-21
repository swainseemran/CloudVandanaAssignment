function submitForm() {
	let firstName = document.getElementById("firstName").value;
	let lastName = document.getElementById("lastName").value;
	let dob = document.getElementById("dob").value;
	let country = document.getElementById("country").value;
	let gender = getSelectedCheckboxes("gender");
	let profession = document.getElementById("profession").value;
	let email = document.getElementById("email").value;
	let mobileNumber = document.getElementById("mobileNumber").value;

	alert(
		"First u have to fill all the details... " +"\n " +
		"First Name: " + firstName + "\n" +
		"Last Name: " + lastName + "\n" +
		"Date of Birth: " + dob + "\n" +
		"Country: " + country + "\n" +
		"Gender: " + gender + "\n" +
		"Profession: " + profession + "\n" +
		"Email: " + email + "\n" +
		"Mobile Number: " + mobileNumber
	);
	document.getElementById("surveyForm").reset();
}

function getSelectedCheckboxes(name) {
	let checkboxes = document.getElementsByName(name);
	let selectedValues = [];
	checkboxes.forEach(function (checkbox) {
		if (checkbox.checked)
			selectedValues.push(checkbox.value);
	});
	return selectedValues.join(", ");
}