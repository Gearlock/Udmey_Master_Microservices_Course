package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * javadoc comments
     * @param customerDto - CustomerDto object
     */
    void createAccount(CustomerDto customerDto); //does not return anything so it is void

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Accounts Details based on given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return boolean if account deleted or not
     */
    boolean deleteAccount(String mobileNumber);
}
