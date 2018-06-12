package com.stifler.binderpool.aidl;

import android.os.RemoteException;

public class SecurityCenterImpl extends ISecurityCenter.Stub {
    @Override
    public String encrypy(String content) throws RemoteException {
        return content + "-encrypt";
    }

    @Override
    public String decrypt(String password) throws RemoteException {
        return password + "-decrypt";
    }
}
