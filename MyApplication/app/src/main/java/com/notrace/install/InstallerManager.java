package com.notrace.install;

import android.util.Log;


public class InstallerManager {
	
	private static IInstaller mInstaller;

    public InstallerManager() {
    }

    public static void addInstaller(IInstaller installer) {
        mInstaller = installer;
    }

    public static IInstaller getInstaller() {
        if(mInstaller == null) {
            mInstaller = new IInstaller() {
                public void installPackage(String fileName, IInstallerCallback callback) {
                    callback.finishInstall(-1);
                    Log.e("wyy", "IInstaller getInstaller()");
                }
            };
        }

        return mInstaller;
    }

}
