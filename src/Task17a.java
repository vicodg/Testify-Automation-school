public abstract class Task17a {
    public static void main(String[] args) {
    }
    // You are required to build the blueprint for your company's login page. From the discussions with the product team,
    // all login pages will have a username field, password field, forgot password field, and sign-in button while other
    // elements like remember me checkbox, continue to homePage, OAuth button will not be applicable to all login pages.
    // with your knowledge of Abstract classes, Create a class that others developers will have to inherit from.

    // Abstract class for login page
        private String username;
        private String password;

        // Method to handle sign-in action
        public abstract void signIn();

        // Method to handle forgot password action
        public void forgotPassword() {
            System.out.println("Forgot password? Click here to reset.");
        }

        // Getters and setters for username and password fields
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


}
