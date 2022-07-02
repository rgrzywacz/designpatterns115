import java.time.LocalDateTime;

import creational.fluentbuilder.Priority;
import creational.fluentbuilderlombok.Task;
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

        /**
         * Lombok demo
         */
        Task task = Task.builder().id(1).dueDate(LocalDateTime.now().plusDays(2)).priority(Priority.HIGH).build();

        task.setDescription("Opis");
        System.out.println(task.toString());

    }
}
