package com.ZIM.Zipcode.Instant.Messager.User;


//@Entity
//@Table
public class User {

//     //@id
//    // @SequenceGenrator(
//                 name = "student_sequence",
//                 sequnceName = "student_sequence",
//                 allocationSize = 1
//     )
//     @GenerateValue(
//         strategy = GenerationType.SEQUENCE,
//         generater = "student_sequnce"
//     )
    
    private String UserName;

    private String Password;
   
    

    public User() {
    }

    public User(String Username, String password) {
        this.UserName = Username;
        this.Password = password;
    }
    //database will generate id for us//

    public String getName() {
        return this.UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    
    @Override
    public String toString() {
        return "{" +
            " UserName='" + getUserName() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

    private String getUserName() {
        return null;
    }

    private String getPassword() {
        return null;
    }

    }

    

