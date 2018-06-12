// ISecurityCenter.aidl
package com.stifler.binderpool.aidl;

// Declare any non-default types here with import statements

interface ISecurityCenter {
    String encrypy(String content);
    String decrypt(String password);
}
