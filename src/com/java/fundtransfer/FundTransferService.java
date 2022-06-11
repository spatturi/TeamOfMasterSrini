package com.java.fundtransfer;

public class FundTransferService {
    public static void main(String[] args) {

        ServiceMenu serviceMenu = new ServiceMenu();
        serviceMenu.serviceMethod();
        //System.out.println(serviceMenu.frAccNumber);
        if (serviceMenu.serviceOption ==1){
            AccountDetails accountDetails = new AccountDetails(serviceMenu.accNumber);
            boolean acFnd =accountDetails.validateAccount();

            if (acFnd) {
                System.out.println("for the Account number: " + accountDetails.acNumber +
                        ", Available Balance is:" + accountDetails.acBalance);
            }
            else {
                System.out.println("Account number "+accountDetails.acNumber +" not found");
            }
        }

        if (serviceMenu.serviceOption ==2){

            AccountDetails accountDetails = new AccountDetails(serviceMenu.frAccNumber,serviceMenu.transferAmt);
            boolean frAcValidation = accountDetails.validateFrAccount();
            if ( frAcValidation){
                System.out.println("Account found and TransferAmount eligible");
                AccountDetails accountDetails1 = new AccountDetails(serviceMenu.toAccNumber);
                boolean toAcValidation = accountDetails1.validateAccount();
                if (toAcValidation){
                    AccountDetails accountDetails2 =
                            new AccountDetails(serviceMenu.frAccNumber, serviceMenu.transferAmt,serviceMenu.toAccNumber);
                    if (accountDetails2.debitMethod()){
                        if (accountDetails2.creditMethod()){
                            System.out.println("Fund transfer Success, from Account:" + serviceMenu.frAccNumber+
                                    ", new available balance is:"+accountDetails2.acFrBalance);
                            System.out.println("To Account:"+ accountDetails2.toAcNumber+
                                    ",new available balance:"+accountDetails2.acToBalance);
                        }
                        else {
                            System.out.println("Credit failed to ToAccount.. need to handle reversal");
                        }
                    }
                    else {
                        System.out.println("Debit failed from FromAccount");
                    }

                }
                else {
                    System.out.println("to account not found");
                }
            }
            else {
                System.out.println("from Account not found");
            }
        }
    }
}
