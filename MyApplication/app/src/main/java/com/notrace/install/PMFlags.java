package com.notrace.install;

/**
 * Created by root on 16-8-6.
 */
public class PMFlags {

    /**
     * {@link PackageInfo} flag: return information about
     * activities in the package in {@link PackageInfo#activities}.
     */
    public static final int GET_ACTIVITIES = 0x00000001;

    /**
     * {@link PackageInfo} flag: return information about
     * intent receivers in the package in
     * {@link PackageInfo#receivers}.
     */
    public static final int GET_RECEIVERS = 0x00000002;

    /**
     * {@link PackageInfo} flag: return information about
     * services in the package in {@link PackageInfo#services}.
     */
    public static final int GET_SERVICES = 0x00000004;

    /**
     * {@link PackageInfo} flag: return information about
     * content providers in the package in
     * {@link PackageInfo#providers}.
     */
    public static final int GET_PROVIDERS = 0x00000008;

    /**
     * {@link PackageInfo} flag: return information about
     * instrumentation in the package in
     * {@link PackageInfo#instrumentation}.
     */
    public static final int GET_INSTRUMENTATION = 0x00000010;

    /**
     * {@link PackageInfo} flag: return information about the
     * intent filters supported by the activity.
     */
    public static final int GET_INTENT_FILTERS = 0x00000020;

    /**
     * {@link PackageInfo} flag: return information about the
     * signatures included in the package.
     */
    public static final int GET_SIGNATURES = 0x00000040;

    /**
     * {@link ResolveInfo} flag: return the IntentFilter that
     * was matched for a particular ResolveInfo in
     * {@link ResolveInfo#filter}.
     */
    public static final int GET_RESOLVED_FILTER = 0x00000040;

    /**
     * {@link ComponentInfo} flag: return the {@link ComponentInfo#metaData}
     * data {@link android.os.Bundle}s that are associated with a component.
     * This applies for any API returning a ComponentInfo subclass.
     */
    public static final int GET_META_DATA = 0x00000080;

    /**
     * {@link PackageInfo} flag: return the
     * {@link PackageInfo#gids group ids} that are associated with an
     * application.
     * This applies for any API returning a PackageInfo class, either
     * directly or nested inside of another.
     */
    public static final int GET_GIDS = 0x00000100;

    /**
     * {@link PackageInfo} flag: include disabled components in the returned info.
     */
    public static final int GET_DISABLED_COMPONENTS = 0x00000200;

    /**
     * {@link ApplicationInfo} flag: return the
     * {@link ApplicationInfo#sharedLibraryFiles paths to the shared libraries}
     * that are associated with an application.
     * This applies for any API returning an ApplicationInfo class, either
     * directly or nested inside of another.
     */
    public static final int GET_SHARED_LIBRARY_FILES = 0x00000400;

    /**
     * {@link ProviderInfo} flag: return the
     * {@link ProviderInfo#uriPermissionPatterns URI permission patterns}
     * that are associated with a content provider.
     * This applies for any API returning a ProviderInfo class, either
     * directly or nested inside of another.
     */
    public static final int GET_URI_PERMISSION_PATTERNS = 0x00000800;
    /**
     * {@link PackageInfo} flag: return information about
     * permissions in the package in
     * {@link PackageInfo#permissions}.
     */
    public static final int GET_PERMISSIONS = 0x00001000;

    /**
     * Flag parameter to retrieve some information about all applications (even
     * uninstalled ones) which have data directories. This state could have
     * resulted if applications have been deleted with flag
     * {@code DONT_DELETE_DATA} with a possibility of being replaced or
     * reinstalled in future.
     * <p/>
     * Note: this flag may cause less information about currently installed
     * applications to be returned.
     */
    public static final int GET_UNINSTALLED_PACKAGES = 0x00002000;

    /**
     * {@link PackageInfo} flag: return information about
     * hardware preferences in
     * {@link PackageInfo#configPreferences PackageInfo.configPreferences},
     * and requested features in {@link PackageInfo#reqFeatures} and
     * {@link PackageInfo#featureGroups}.
     */
    public static final int GET_CONFIGURATIONS = 0x00004000;

    /**
     * {@link PackageInfo} flag: include disabled components which are in
     * that state only because of {@link #COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED}
     * in the returned info.  Note that if you set this flag, applications
     * that are in this disabled state will be reported as enabled.
     */
    public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 0x00008000;

    /**
     * Resolution and querying flag: if set, only filters that support the
     * {@link android.content.Intent#CATEGORY_DEFAULT} will be considered for
     * matching.  This is a synonym for including the CATEGORY_DEFAULT in your
     * supplied Intent.
     */
    public static final int MATCH_DEFAULT_ONLY = 0x00010000;

    /**
     * Resolution flag: If there is only 1 activity that the intent resolves too and if this
     * flag  is set perform pre launch check for the resolved activity.
     *
     * @hide
     */
    public static final int PERFORM_PRE_LAUNCH_CHECK = 0x00100000;

    /**
     * Flag for {@link addCrossProfileIntentFilter}: if this flag is set:
     * when resolving an intent that matches the {@link CrossProfileIntentFilter}, the current
     * profile will be skipped.
     * Only activities in the target user can respond to the intent.
     *
     * @hide
     */
    public static final int SKIP_CURRENT_PROFILE = 0x00000002;

    /**
     * Permission check result: this is returned by {@link #checkPermission}
     * if the permission has been granted to the given package.
     */
    public static final int PERMISSION_GRANTED = 0;

    /**
     * Permission check result: this is returned by {@link #checkPermission}
     * if the permission has not been granted to the given package.
     */
    public static final int PERMISSION_DENIED = -1;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if all signatures on the two packages match.
     */
    public static final int SIGNATURE_MATCH = 0;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if neither of the two packages is signed.
     */
    public static final int SIGNATURE_NEITHER_SIGNED = 1;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if the first package is not signed but the second is.
     */
    public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if the second package is not signed but the first is.
     */
    public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if not all signatures on both packages match.
     */
    public static final int SIGNATURE_NO_MATCH = -3;

    /**
     * Signature check result: this is returned by {@link #checkSignatures}
     * if either of the packages are not valid.
     */
    public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;

    /**
     * Flag for {@link #setApplicationEnabledSetting(String, int, int)}
     * and {@link #setComponentEnabledSetting(ComponentName, int, int)}: This
     * component or application is in its default enabled state (as specified
     * in its manifest).
     */
    public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;

    /**
     * Flag for {@link #setApplicationEnabledSetting(String, int, int)}
     * and {@link #setComponentEnabledSetting(ComponentName, int, int)}: This
     * component or application has been explictily enabled, regardless of
     * what it has specified in its manifest.
     */
    public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;

    /**
     * Flag for {@link #setApplicationEnabledSetting(String, int, int)}
     * and {@link #setComponentEnabledSetting(ComponentName, int, int)}: This
     * component or application has been explicitly disabled, regardless of
     * what it has specified in its manifest.
     */
    public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;

    /**
     * Flag for {@link #setApplicationEnabledSetting(String, int, int)} only: The
     * user has explicitly disabled the application, regardless of what it has
     * specified in its manifest.  Because this is due to the user's request,
     * they may re-enable it if desired through the appropriate system UI.  This
     * option currently <strong>cannot</strong> be used with
     * {@link #setComponentEnabledSetting(ComponentName, int, int)}.
     */
    public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;

    /**
     * Flag for {@link #setApplicationEnabledSetting(String, int, int)} only: This
     * application should be considered, until the point where the user actually
     * wants to use it.  This means that it will not normally show up to the user
     * (such as in the launcher), but various parts of the user interface can
     * use {@link #GET_DISABLED_UNTIL_USED_COMPONENTS} to still see it and allow
     * the user to select it (as for example an IME, device admin, etc).  Such code,
     * once the user has selected the app, should at that point also make it enabled.
     * This option currently <strong>can not</strong> be used with
     * {@link #setComponentEnabledSetting(ComponentName, int, int)}.
     */
    public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;

    /**
     * Flag parameter for {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} to
     * indicate that this package should be installed as forward locked, i.e. only the app itself
     * should have access to its code and non-resource assets.
     *
     * @hide
     */
    public static final int INSTALL_FORWARD_LOCK = 0x00000001;

    /**
     * Flag parameter for {@link #installPackage} to indicate that you want to replace an already
     * installed package, if one exists.
     *
     * @hide
     */
    public static final int INSTALL_REPLACE_EXISTING = 0x00000002;

    /**
     * Flag parameter for {@link #installPackage} to indicate that you want to
     * allow test packages (those that have set android:testOnly in their
     * manifest) to be installed.
     *
     * @hide
     */
    public static final int INSTALL_ALLOW_TEST = 0x00000004;

    /**
     * Flag parameter for {@link #installPackage} to indicate that this
     * package has to be installed on the sdcard.
     *
     * @hide
     */
    public static final int INSTALL_EXTERNAL = 0x00000008;

    /**
     * Flag parameter for {@link #installPackage} to indicate that this package
     * has to be installed on the sdcard.
     *
     * @hide
     */
    public static final int INSTALL_INTERNAL = 0x00000010;

    /**
     * Flag parameter for {@link #installPackage} to indicate that this install
     * was initiated via ADB.
     *
     * @hide
     */
    public static final int INSTALL_FROM_ADB = 0x00000020;

    /**
     * Flag parameter for {@link #installPackage} to indicate that this install
     * should immediately be visible to all users.
     *
     * @hide
     */
    public static final int INSTALL_ALL_USERS = 0x00000040;

    /**
     * Flag parameter for {@link #installPackage} to indicate that it is okay
     * to install an update to an app where the newly installed app has a lower
     * version code than the currently installed app.
     *
     * @hide
     */
    public static final int INSTALL_ALLOW_DOWNGRADE = 0x00000080;

    /**
     * Flag parameter for
     * {@link #setComponentEnabledSetting(android.content.ComponentName, int, int)} to indicate
     * that you don't want to kill the app containing the component.  Be careful when you set this
     * since changing component states can make the containing application's behavior unpredictable.
     */
    public static final int DONT_KILL_APP = 0x00000001;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} on success.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_SUCCEEDED = 1;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if the package is
     * already installed.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if the package archive
     * file is invalid.
     *
     * @SystemApi
     * @hide
     */
    public static final int INSTALL_FAILED_INVALID_APK = -2;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if the URI passed in
     * is invalid.
     *
     * @SystemApi
     * @hide
     */
    public static final int INSTALL_FAILED_INVALID_URI = -3;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if the package manager
     * service found that the device didn't have enough storage space to install the app.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if a
     * package is already installed with the same name.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the requested shared user does not exist.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_NO_SHARED_USER = -6;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * a previously installed package of the same name has a different signature
     * than the new package (and the old package's data was not removed).
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package is requested a shared user which is already installed on the
     * device and does not have matching signature.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package uses a shared library that is not available.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package uses a shared library that is not available.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package failed while optimizing and validating its dex files,
     * either because there was not enough storage or the validation failed.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_DEXOPT = -11;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package failed because the current SDK version is older than
     * that required by the package.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_OLDER_SDK = -12;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package failed because it contains a content provider with the
     * same authority as a provider already installed in the system.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package failed because the current SDK version is newer than
     * that required by the package.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_NEWER_SDK = -14;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package failed because it has specified that it is a test-only
     * package and the caller has not supplied the {@link #INSTALL_ALLOW_TEST}
     * flag.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_TEST_ONLY = -15;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the package being installed contains native code, but none that is
     * compatible with the device's CPU_ABI.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package uses a feature that is not available.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_MISSING_FEATURE = -17;

    // ------ Errors related to sdcard
    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * a secure container mount point couldn't be accessed on external media.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package couldn't be installed in the specified install
     * location.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package couldn't be installed in the specified install
     * location because the media is not available.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package couldn't be installed because the verification timed out.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package couldn't be installed because the verification did not succeed.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the package changed from what the calling program expected.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package is assigned a different UID than it previously held.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_UID_CHANGED = -24;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package has an older version code than the currently installed package.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_VERSION_DOWNGRADE = -25;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the package is from unknown sources but not trusted sources.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_UNKNOWN_SOURCES = -26;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser was given a path that is not a file, or does not end with the expected
     * '.apk' extension.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser was unable to retrieve the AndroidManifest.xml file.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser encountered an unexpected exception.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser did not find any certificates in the .apk.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser found inconsistent certificates on the files in the .apk.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser encountered a CertificateEncodingException in one of the
     * files in the .apk.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser encountered a bad or missing package name in the manifest.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser encountered a bad shared user id name in the manifest.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser encountered some structural problem in the manifest.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;

    /**
     * Installation parse return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the parser did not find any actionable tags (instrumentation or application)
     * in the manifest.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;

    /**
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the package because of system issues.
     *
     * @hide
     * @SystemApi
     */
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;

    /**
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the package because the user is restricted from installing
     * apps.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_USER_RESTRICTED = -111;

    /**
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the package because it is attempting to define a
     * permission that is already defined by some existing package.
     * <p/>
     * <p>The package name of the app which has already defined the permission is passed to
     * a {@link PackageInstallObserver}, if any, as the {@link #EXTRA_EXISTING_PACKAGE}
     * string extra; and the name of the permission being redefined is passed in the
     * {@link #EXTRA_EXISTING_PERMISSION} string extra.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_DUPLICATE_PERMISSION = -112;

    /**
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the package because its packaged native code did not
     * match any of the ABIs supported by the system.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_NO_MATCHING_ABIS = -113;

    /**
     * Internal return code for NativeLibraryHelper methods to indicate that the package
     * being processed did not contain any native code. This is placed here only so that
     * it can belong to the same value space as the other install failure codes.
     *
     * @hide
     */
    public static final int NO_NATIVE_LIBRARIES = -114;

    /**
     * {@hide}
     */
    public static final int INSTALL_FAILED_ABORTED = -115;

    /**
     * Used by themes
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the theme because aapt could not compile the app
     *
     * @hide
     */
    public static final int INSTALL_FAILED_THEME_AAPT_ERROR = -400;

    /**
     * Used by themes
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the theme because idmap failed
     * apps.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_THEME_IDMAP_ERROR = -401;

    /**
     * Used by themes
     * Installation failed return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)}
     * if the system failed to install the theme for an unknown reason
     * apps.
     *
     * @hide
     */
    public static final int INSTALL_FAILED_THEME_UNKNOWN_ERROR = -402;

    /**
     * Used for prebundles
     * Installation failed for a prebundled app because the user previously uninstalled it
     * and we don't want to bring it back
     *
     * @hide
     */
    public static final int INSTALL_FAILED_UNINSTALLED_PREBUNDLE = -403;

    /**
     * Used for prebundles
     * Installation failed for a prebundled app because it wasn't needed in the default
     * mobile country exported by the hardware
     *
     * @hide
     */
    public static final int INSTALL_FAILED_REGION_LOCKED_PREBUNDLE = -404; //bloat not found

    /**
     * Flag parameter for {@link #deletePackage} to indicate that you don't want to delete the
     * package's data directory.
     *
     * @hide
     */
    public static final int DELETE_KEEP_DATA = 0x00000001;

    /**
     * Flag parameter for {@link #deletePackage} to indicate that you want the
     * package deleted for all users.
     *
     * @hide
     */
    public static final int DELETE_ALL_USERS = 0x00000002;

    /**
     * Flag parameter for {@link #deletePackage} to indicate that, if you are calling
     * uninstall on a system that has been updated, then don't do the normal process
     * of uninstalling the update and rolling back to the older system version (which
     * needs to happen for all users); instead, just mark the app as uninstalled for
     * the current user.
     *
     * @hide
     */
    public static final int DELETE_SYSTEM_APP = 0x00000004;

    /**
     * Return code for when package deletion succeeds. This is passed to the
     * {@link IPackageDeleteObserver} by {@link #deletePackage()} if the system
     * succeeded in deleting the package.
     *
     * @hide
     */
    public static final int DELETE_SUCCEEDED = 1;

    /**
     * Deletion failed return code: this is passed to the
     * {@link IPackageDeleteObserver} by {@link #deletePackage()} if the system
     * failed to delete the package for an unspecified reason.
     *
     * @hide
     */
    public static final int DELETE_FAILED_INTERNAL_ERROR = -1;

    /**
     * Deletion failed return code: this is passed to the
     * {@link IPackageDeleteObserver} by {@link #deletePackage()} if the system
     * failed to delete the package because it is the active DevicePolicy
     * manager.
     *
     * @hide
     */
    public static final int DELETE_FAILED_DEVICE_POLICY_MANAGER = -2;

    /**
     * Deletion failed return code: this is passed to the
     * {@link IPackageDeleteObserver} by {@link #deletePackage()} if the system
     * failed to delete the package since the user is restricted.
     *
     * @hide
     */
    public static final int DELETE_FAILED_USER_RESTRICTED = -3;

    /**
     * Deletion failed return code: this is passed to the
     * {@link IPackageDeleteObserver} by {@link #deletePackage()} if the system
     * failed to delete the package because a profile
     * or device owner has marked the package as uninstallable.
     *
     * @hide
     */
    public static final int DELETE_FAILED_OWNER_BLOCKED = -4;

    /**
     * {@hide}
     */
    public static final int DELETE_FAILED_ABORTED = -5;

    /**
     * Return code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)} when the
     * package has been successfully moved by the system.
     *
     * @hide
     */
    public static final int MOVE_SUCCEEDED = 1;
    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * when the package hasn't been successfully moved by the system
     * because of insufficient memory on specified media.
     *
     * @hide
     */
    public static final int MOVE_FAILED_INSUFFICIENT_STORAGE = -1;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * if the specified package doesn't exist.
     *
     * @hide
     */
    public static final int MOVE_FAILED_DOESNT_EXIST = -2;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * if the specified package cannot be moved since its a system package.
     *
     * @hide
     */
    public static final int MOVE_FAILED_SYSTEM_PACKAGE = -3;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * if the specified package cannot be moved since its forward locked.
     *
     * @hide
     */
    public static final int MOVE_FAILED_FORWARD_LOCKED = -4;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * if the specified package cannot be moved to the specified location.
     *
     * @hide
     */
    public static final int MOVE_FAILED_INVALID_LOCATION = -5;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)}
     * if the specified package cannot be moved to the specified location.
     *
     * @hide
     */
    public static final int MOVE_FAILED_INTERNAL_ERROR = -6;

    /**
     * Error code that is passed to the {@link IPackageMoveObserver} by
     * {@link #movePackage(android.net.Uri, IPackageMoveObserver)} if the
     * specified package already has an operation pending in the
     * {@link PackageHandler} queue.
     *
     * @hide
     */
    public static final int MOVE_FAILED_OPERATION_PENDING = -7;

    /**
     * Flag parameter for {@link #movePackage} to indicate that
     * the package should be moved to internal storage if its
     * been installed on external media.
     *
     * @hide
     */
    public static final int MOVE_INTERNAL = 0x00000001;

    /**
     * Flag parameter for {@link #movePackage} to indicate that
     * the package should be moved to external media.
     *
     * @hide
     */
    public static final int MOVE_EXTERNAL_MEDIA = 0x00000002;

    /**
     * Usable by the required verifier as the {@code verificationCode} argument
     * for {@link PackageManager#verifyPendingInstall} to indicate that it will
     * allow the installation to proceed without any of the optional verifiers
     * needing to vote.
     *
     * @hide
     */
    public static final int VERIFICATION_ALLOW_WITHOUT_SUFFICIENT = 2;

    /**
     * Used as the {@code verificationCode} argument for
     * {@link PackageManager#verifyPendingInstall} to indicate that the calling
     * package verifier allows the installation to proceed.
     */
    public static final int VERIFICATION_ALLOW = 1;

    /**
     * Used as the {@code verificationCode} argument for
     * {@link PackageManager#verifyPendingInstall} to indicate the calling
     * package verifier does not vote to allow the installation to proceed.
     */
    public static final int VERIFICATION_REJECT = -1;

}
