package org.idol.movetext;

import android.accounts.Account;
import android.accounts.AccountManager;

/**
 * Created by ljeff on 9/22/13.
 */
public class GooglePlay
{

    private String[] getAccountNames() {
        AccountManager mAccountManager = AccountManager.get(this);
        Account[] accounts = mAccountManager.getAccountsByType(
                GoogleAuthUtil.GOOGLE_ACCOUNT_TYPE);
        String[] names = new String[accounts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = accounts[i].name;
        }
        return names;
    }
}
