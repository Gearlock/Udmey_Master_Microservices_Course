package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * javadoc comments
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto); //does not return anything so it is void
}
