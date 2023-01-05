package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character


        if(this.password.equals(oldPassword)) {

            //check the length
            if (newPassword.length() >= 8) {

                //const regex pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*.,?]).+$");

                // loop string newpassword wali me
                // character nikalne honge
                // uppercase ki range dekhne ka || lowercase ki range dekhne ka || digit ki range
                boolean check = false;

                for (int i = 0; i < newPassword.length(); i++) {
                    char ch = newPassword.charAt(i);
                    if ((ch >= 'A' || ch <= 'Z') && (ch >= 'a' || ch <= 'z') && (ch >= 0 || ch <= 9) && ((ch >= 32 || ch <= 47) && (ch >= 58 || ch <= 64)
                            && (ch >= 91 || ch <= 96) && (ch >= 123 || ch <= 126))) {
                        check = true;
                        break;
                    }

                }

                if (check) { // check toh kr liya pr aage kya krna he
                    System.out.println("Password changed successfully!");
                    this.password = newPassword;
                }

                else {
                    System.out.println("The new password is not valid!");
                }
            }


        }

        else {
            System.out.println("The given password does not match current password!");
        }

    }
}
