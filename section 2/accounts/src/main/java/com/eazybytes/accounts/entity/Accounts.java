package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column(name="customer_id") //used to assign name to column(not necessary because variable name is same in db and here)
    private Long customerId;
    @Id
    @Column(name="account_number")
    private Long accountNumber;
    private String accountType;
    @Column(name="branch_address")
    private String branchAddress;
}
