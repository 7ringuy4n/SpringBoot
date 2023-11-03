// Toggle password
document.addEventListener('DOMContentLoaded', function () {
    const passwordField = document.querySelector('#password');
    const togglePassword = document.querySelector('.toggle-password');

    togglePassword.addEventListener('click', function () {
        if (passwordField.type === 'password') {
            passwordField.type = 'text';

        } else {
            passwordField.type = 'password';
        }
        this.classList.toggle('fa-eye-slash');
    });


    const passwordField2 = document.querySelector('#confirmPassword');
    const togglePassword2 = document.querySelector('.toggle-password2');

    togglePassword2.addEventListener('click', function () {
        if (passwordField2.type === 'password') {
            passwordField2.type = 'text';

        } else {
            passwordField2.type = 'password';
        }
        this.classList.toggle('fa-eye-slash');
    });
});
