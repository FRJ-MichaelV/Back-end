package com.example.userbackend.Entity;

import jakarta.persistence.*;

enum District{
    Colombo, Gampaha, Kalutara, kandy, Matale, NumwaraEliya,
    Galle, Matara, Hambantota, Jaffna, Kilinochchi, Mannar,
    Vavuniya, Mullaitivu, Batticaloa, Ampara, Trincomalee,
    Kurunagela, Puttalam, Anuradhapura, Polonnaruwa, Badulla,
    Moneragala, Ratnapura, Kegalle
}

@Entity
@Table(name="records")
public class User {
    @Id
    @Column(name = "nic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nic;
    @Column(name = "name")
    private String name;
    @Column(name = "district")
    private District district;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;

    public User(){

    }

    public User(String name, District district, String email, String phone) {
        super();
        this.name = name;
        this.district = district;
        this.email = email;
        this.phone = phone;
    }

    public Long getNic() {

        return nic;
    }

    public void setNic(Long nic) {

        this.nic = nic;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public District getDistrict() {

        return district;
    }

    public void setDistrict(District district) {

        this.district = district;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }
}
