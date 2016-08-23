package com.notrace.install;

import android.content.Intent;

import android.content.pm.IPackageInstallObserver;
import android.content.pm.IPackageInstallObserver2;
import android.content.pm.IPackageManager;
import android.content.pm.VerificationParams;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Created by root on 16-8-6. 实现IInstaller接口，进行反射静默安装
 */
public class PM implements IInstaller {

	private static PM pm = new PM();

	private PM() {
	};

	public static PM getInstance() {
		return pm;
	}

	/**
	 * @param path
	 * @param iInstallerCallback
	 * 
	 *            Android 5.1.1 public void installPackage( java.lang.String
	 *            originPath, android.content.pm.IPackageInstallObserver2
	 *            observer, int flags, java.lang.String installerPackageName,
	 *            android.content.pm.VerificationParams verificationParams,
	 *            java.lang.String packageAbiOverride) throws
	 *            android.os.RemoteException;
	 *            <p/>
	 *            <p/>
	 *            Android 5.0.0 public void installPackage( java.lang.String
	 *            originPath, android.content.pm.IPackageInstallObserver2
	 *            observer, int flags, java.lang.String installerPackageName,
	 *            android.content.pm.VerificationParams verificationParams,
	 *            java.lang.String packageAbiOverride) throws
	 *            android.os.RemoteException;
	 *            <p/>
	 *            <p/>
	 *            Android 4.4.4 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException;
	 *            <p/>
	 *            <p/>
	 *            Android 4.3.1 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException;
	 *            <p/>
	 *            <p/>
	 *            Android 4.2.2 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException;
	 *            <p/>
	 *            Android 4.1.1 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException
	 *            <p/>
	 *            <p/>
	 *            Android 4.0.4 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException
	 *            <p/>
	 *            <p/>
	 *            Android 4.0.1 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException
	 *            <p/>
	 *            <p/>
	 *            Android 2.3.7 public void installPackage( android.net.Uri
	 *            packageURI, android.content.pm.IPackageInstallObserver
	 *            observer, int flags, java.lang.String installerPackageName)
	 *            throws android.os.RemoteException
	 */
	@Override
	public void installPackage(String path, IInstallerCallback iInstallerCallback) {
		try {
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
				installPackageHighApi(path, iInstallerCallback);
			} else {
				installPackageLowApi(path, iInstallerCallback);
			}
		} catch (Exception e) {

			// 反射过程中出错直接IInstallerCallback回调失败，运行老版静默方法
			iInstallerCallback.finishInstall(-1);
		}
	}

	/**
	 * 适配5.0及以上系统
	 * 
	 * @param path
	 * @param iInstallerCallback
	 * @throws Exception
	 */
	private void installPackageHighApi(final String path, final IInstallerCallback iInstallerCallback) throws Exception {
		final VerificationParams verificationParams = new VerificationParams(null, null, null, VerificationParams.NO_UID, null);
		final int flags = PMFlags.INSTALL_REPLACE_EXISTING;
		final PackageInstallObserver2 observer = new PackageInstallObserver2(iInstallerCallback);
		getIPackageManager().installPackage(path, observer, flags, null, verificationParams, null);
	
	}

	/**
	 * 适配 5.0以下系统
	 * 
	 * @param path
	 * @param iInstallerCallback
	 * @throws Exception
	 */
	private void installPackageLowApi(String path, final IInstallerCallback iInstallerCallback) throws Exception {
		final Uri uri = Uri.parse(path);
		final int flags = PMFlags.INSTALL_REPLACE_EXISTING;
		final PackageInstallObserver observer = new PackageInstallObserver(iInstallerCallback);
		final IPackageManager ipm = getIPackageManager();
		RefInvoke.invokeMethodWithException(ipm.getClass(), "installPackage", ipm, new Class[] { Uri.class, IPackageInstallObserver.class, int.class, String.class }, new Object[] { uri, observer, flags, null });
	}

	/**
	 * 反射系统IPackageManager
	 * 
	 * @return
	 */
	private IPackageManager getIPackageManager() {
		IBinder iBinder = (IBinder) RefInvoke.invokeStaticMethod("android.os.ServiceManager", "getService", new Class[] { String.class }, new Object[] { "package" });
		IPackageManager ipm = IPackageManager.Stub.asInterface(iBinder);
		return ipm;
	}

	/**
	 * 5.0及以上版本系统 软件安装状态回调 同时回调IInstallerCallback
	 */
	class PackageInstallObserver2 extends IPackageInstallObserver2.Stub {

		IInstallerCallback callback;

		public PackageInstallObserver2(IInstallerCallback iInstallerCallback) {
			callback = iInstallerCallback;
		}

		@Override
		public void onUserActionRequired(Intent intent) throws RemoteException {
		}

		@Override
		public void onPackageInstalled(String basePackageName, int returnCode, String msg, Bundle extras) throws RemoteException {
			if (callback != null)
				callback.finishInstall(returnCode);
		}
	}

	/**
	 * 5.0以下版本系统 软件安装状态回调 同时回调IInstallerCallback
	 */
	class PackageInstallObserver extends IPackageInstallObserver.Stub {

		IInstallerCallback callback;

		public PackageInstallObserver(IInstallerCallback iInstallerCallback) {
			callback = iInstallerCallback;
		}

		@Override
		public void packageInstalled(String packageName, int returnCode) throws RemoteException {
			if (callback != null)
				callback.finishInstall(returnCode);
		}
	}
}
