/**
 * http://usejsdoc.org/
 */

(function() {

	$(document).ready(onPageLoad);

	function checkPasswordMatch() {
		var password = $('#password').val();
		var confirmPassword = $('#confirmPassword').val();

		if (password.length < 3 || confirmPassword.length < 3) {
			return;
		}

		if (password === confirmPassword) {
			// output the match confirm message on the form.
			$('#matchPass').text(
					"<fmt:message key='MatchedPasswords.user.password'/>")
					.removeClass('error').addClass("valid");
		}

		else {
			// password don't match
			$('#matchPass').text(
					"<fmt:message key='MatchedPasswords.user.password'/>")
					.removeClass('valid').addClass('valid');
		}

	}

	function canSubmit() {
		if (checkPasswordMatch()) {
			return true;
		} else {
			return false;
		}

	}

	function onPageLoad() {
		$('#password').keyup(checkPasswordMatch);
		$('#confirmPassword').keyup(checkPasswordMatch);
		$('#details').submit(canSubmit);
	}

})(jQuery);