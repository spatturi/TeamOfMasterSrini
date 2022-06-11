package com.java.fundtransfer;

public class AccountDetails {

    String[][] acDetails = {{"111", "500"}, {"222", "1000"}, {"333", "100"}};

    double MIN_BALANCE = 100.00;
    int acNumber = 0;
    int frAcNumber = 0;
    int toAcNumber;
    double acBalance = 0.0;
    double acFrBalance;
    double acToBalance;
    double transferAmt;
    int a = acDetails.length;
    int b = acDetails[0].length;

    //   System.out.println("Hi");

    public AccountDetails(int acNumber) {
        this.acNumber = acNumber;
    }

    public AccountDetails(int frAcNumber, double transferAmt) {
        this.frAcNumber = frAcNumber;
        this.transferAmt = transferAmt;
    }

    public AccountDetails(int frAcNumber, double transferAmt, int toAcNumber) {
        this.frAcNumber = frAcNumber;
        this.transferAmt = transferAmt;
        this.toAcNumber = toAcNumber;
    }

    public boolean validateAccount() {
        System.out.println("validateAccount method");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                //  System.out.println("acDetails[i][j]:"+i+","+j+","+acDetails[i][j]);
                if (Integer.parseInt(acDetails[i][j]) == this.acNumber) {
                    //   System.out.println("acDetails[i][j]:"+i+","+j+","+acDetails[i][j]);
                    //   System.out.println(acDetails[i][j+1]);
                    acBalance = Double.parseDouble(acDetails[i][j + 1]);
                    System.out.println(acBalance);
                    //  acBalance =acDetails[i][j+1];
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validateFrAccount() {
        System.out.println("validateFrAccount method");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (Integer.parseInt(acDetails[i][j]) == this.frAcNumber) {
                    acBalance = Double.parseDouble(acDetails[i][j + 1]);
                    System.out.println(acBalance);
                    System.out.println("MinBalance:" + MIN_BALANCE);
                    if ((acBalance > this.transferAmt) && ((acBalance - this.transferAmt) >= MIN_BALANCE)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean debitMethod() {
        System.out.println("debit method");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (Integer.parseInt(acDetails[i][j]) == this.frAcNumber) {
                    //            acDetails[i][j + 1] = (Double.parseDouble(acDetails[i][j + 1])) - this.transferAmt));
                    acFrBalance = Double.parseDouble(acDetails[i][j + 1]);
                    acFrBalance = acFrBalance - this.transferAmt;
                    acDetails[i][j + 1] = String.valueOf(acFrBalance);
                    System.out.println("New Balance:"+ acDetails[i][j + 1]);
                    return true;
                }
            }
        }
        return false;
    }
    public boolean creditMethod() {
        System.out.println("credit method, to account:" + this.toAcNumber + "transfer amount:"+ this.transferAmt);
        for (int i = 0; i < a; i++) {
            System.out.println("i="+i);
            for (int j = 0; j < b; j++) {
                System.out.println("j="+j);
          //      convertNumber(acDetails[i][j]);
                if (Integer.parseInt(convertNumber(acDetails[i][j])) == this.toAcNumber) {
                    System.out.println("to account found for credit");
                    acToBalance = Double.parseDouble(acDetails[i][j+1]);
                    acToBalance = acToBalance + this.transferAmt;
                    acDetails[i][j+1] = String.valueOf(acToBalance);
                    return true;
                }
            }
        }return false;
    }

    private String convertNumber(String x){
        if (x.contains("."))
            return x.substring(0,x.length()-2);
        else return x;

    }
}
