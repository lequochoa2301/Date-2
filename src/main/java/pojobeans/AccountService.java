package pojobeans;

public interface AccountService {
    void transferMoney(long frommAccountId, long toAccountId, double amount);
    void depositMoney(long accountId, double amount) throws Exception;
    Account getAccount(long accountId);
}
