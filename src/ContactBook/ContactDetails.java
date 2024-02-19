package ContactBook;

/**
 * This class implements the data structure to contain each contact's 
 * information.  It can store their name, phone number, email address, 
 * street address, city, state, company, and role.  
 * 
 * Any white space left at the end of user input will be removed.
 */
public class ContactDetails implements Comparable<ContactDetails>{
    private String name;
    private String phone;
    private String email;
    private String address;
    private String city;
    private String state;
    private String company;
    private String role;

    public ContactDetails(String name, String phone, String email, 
                          String address, String city, String state, 
                          String company, String role) {
        //Use blank strings if any of the arguments are null
        if(name == null) {
            name = "";
        }
        if(phone == null) {
            phone = "";
        }
        if(email == null) {
            email = "";
        }
        if(address == null) {
            address = "";
        }
        if(city == null) {
            city = "";
        }
        if(state == null) {
            state = "";
        }
        if(company == null) {
            company = "";
        }
        if(role == null) {
            role = "";
        }

        this.name = name.trim();
        this.phone = phone.trim();
        this.email = email.trim();
        this.address = address.trim();
        this.city = city.trim();
        this.state = state.trim();
        this.company = company.trim();
        this.role = role.trim();

        if(this.name.isEmpty()) {
            throw new IllegalStateException(
                "You must enter a name.");
        }
    }

    /**
     * @return The name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The phone number.
     */
    public String getPhone()
    {
        return phone;
    }

    /**
     * @return The email address.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * @return The street address.
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @return The city.
     */
    public String getCity()
    {
        return city;
    }

    /**
     * @return The state.
     */
    public String getState()
    {
        return state;
    }

    /**
     * @return The company.
     */
    public String getCompany()
    {
        return company;
    }

    /**
     * @return The role.
     */
    public String getRole()
    {
        return role;
    }

    /**
     * Compare details against another contact which serves a purpose in 
     * sorting.  Sorting is done by name, phone number, and address.
     * 
     * @param otherDetails The details fot be compared against.
     * @return a negative integer if this contact comes before the parameter,
     * zero if they are equal and a positive integer if this contact comes
     * after the parameter.
     */
    public int compareTo(ContactDetails otherDetails) {
        int comparison = name.compareTo(otherDetails.getName());
        if(comparison != 0){
            return comparison;
        }
        comparison = phone.compareTo(otherDetails.getPhone());
        if(comparison != 0){
            return comparison;
        }
        return address.compareTo(otherDetails.getAddress());
    }

    /**
     * @return A multi-line string containing all available details.
     */
    public String toString()
    {
        return "Name: " + name + "\n" + "Phone: " + phone + "\n" + 
        "Email: " + email + "\n" + "Address: " + address + "\n" + 
        "City: " + city + "\n" + "State: " + state + "\n" + 
        "Company: " + company + "\n" + "Role: " + role;
    }
}
