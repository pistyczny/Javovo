class User {
    String firstName;
    String lastName;
    User(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    void setFirstname(String firstNamee){
        this.firstName = firstNamee;
    }

    void setLastName(String lastNamee){
        this.lastName = lastNamee;
    }


}
