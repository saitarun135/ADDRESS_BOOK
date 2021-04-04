public class Contact {

        public final String firstName;
        public final String lastName;
        public final String address;
        public final String city;
        public final String state;
        public final int zip;
        public final long phoneNumber;
        public final String email;

        public Contact(String firstName, String lastName, String address, String city, String state, int zip,long phoneNumber, String email){
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public int getZip() {
            return zip;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public String toString(){
            return "First Name : " +this.firstName + ", Last Name : " +this.lastName + ", Address : " +this.address + ", City : " +city + ", State : " +this.state + ", Zip : " +this.zip + ", Phone Number : " +this.phoneNumber + ", Email : " +this.email;
        }
    }






/* PRAJA
public class Contact
{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    long mobileNo;
    int zip;

    public Contact(String firstName, String lastName, String address, String city, String state, String email, long mobileNo, int zip)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address= address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.mobileNo = mobileNo;
        this.zip = zip;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public long getMobileNo()
    {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo)
    {
        this.mobileNo = mobileNo;
    }
    public int getZip()
    {
        return zip;
    }
    public void setZip(int zip)
    {
        this.zip = zip;
    }
    public String toString()
    {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", Address="+address+", city=" + city
                + ", state=" + state + ", pincode=" + zip + ", MobileNo=" + mobileNo + "]" + "\n";
    }
}
*/