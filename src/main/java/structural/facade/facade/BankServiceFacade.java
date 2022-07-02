package structural.facade.facade;

import structural.facade.AccountBalanceService;
import structural.facade.AccountDetailsService;
import structural.facade.MoneySpendService;
import structural.facade.MoneyTransferService;

public class BankServiceFacade {
    private AccountBalanceService accountBalanceService = new AccountBalanceService();
    private MoneyTransferService moneyTransferService = new MoneyTransferService();
    private AccountDetailsService accountDetailsService = new AccountDetailsService();
    private MoneySpendService moneySpendService = new MoneySpendService();

    public void displayStateAccount() {
        accountBalanceService.displayStateAccount();
    }

    public void makeMoneyTransfer() {
        moneyTransferService.makeMoneyTransfer();
    }

    public String getAccountDetails() {
        return accountDetailsService.getAccountDetails();
    }

    public void moneySpendInLastMonth() {
        moneySpendService.moneySpendInLastMonth();
    }




}
