function formValidator() {
    var firstname = document.getElementById('firstname');
    var lastname = document.getElementById('lastname');
    var email = document.getElementById('email');
    var pass = document.getElementById('pass');
    var addr = document.getElementById('addr');
    var mobileno = document.getElementById('mobileno');
    var gender = document.querySelector('input[name="gender"]:checked');

    if (notEmpty(firstname, "First name cannot be empty") &&
        isAlphabet(firstname, "Please enter only letters for your Firstname") &&
        lengthRestriction(firstname, 6) &&
        isAlphabet(lastname, "Please enter only letters for your Lastname") &&
        emailValidator(email, "Please enter a valid email address") &&
        lengthRestriction(pass, 6) &&
        isAlphanumeric(pass, "Please enter Numbers and Letters Only for password") &&
        notEmpty(addr, "Please enter the address") &&
        isNumeric(mobileno, "Please enter a valid mobile number") &&
        lengthRestriction1(mobileno, 10, 10) &&
        genderSelected(gender, "Please select your gender")) {
        alert("Registration done successfully");
        return true;
    }
    return false;
}

function notEmpty(elem, helperMsg) {
    if (elem.value.trim().length == 0) {
        alert(helperMsg);
        elem.focus();
        return false;
    }
    return true;
}

function isNumeric(elem, helperMsg) {
    var numericExpression = /^[0-9]+$/;
    if (elem.value.match(numericExpression)) {
        return true;
    } else {
        alert(helperMsg);
        elem.focus();
        return false;
    }
}

function isAlphabet(elem, helperMsg) {
    var alphaExp = /^[a-zA-Z]+$/;
    if (elem.value.match(alphaExp)) {
    }}
