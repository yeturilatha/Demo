package PracticalThings;

import java.util.List;

import collectionInterface.ArrayList;

class Bank{
    private List<Account> accounts;

    public Bank() {
        accounts = (List<Account>) new ArrayList();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
