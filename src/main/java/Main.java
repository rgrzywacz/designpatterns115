import structural.facade.AccountBalanceService;
import structural.facade.AccountDetailsService;
import structural.facade.MoneySpendService;
import structural.facade.MoneyTransferService;
import structural.facade.facade.BankServiceFacade;

public class Main {
    public static void main(String[] args) {
        /**
         * Facade demo
         */
        AccountBalanceService accountBalanceService = new AccountBalanceService();
        AccountDetailsService accountDetailsService = new AccountDetailsService();
        MoneySpendService moneySpendService = new MoneySpendService();
        MoneyTransferService moneyTransferService = new MoneyTransferService();

        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        bankServiceFacade.moneySpendInLastMonth();
        bankServiceFacade.makeMoneyTransfer();



    }
}
