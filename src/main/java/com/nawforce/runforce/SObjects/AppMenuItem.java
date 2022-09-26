/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AppMenuItem extends SObject {
	public static SObjectType$<AppMenuItem> SObjectType;
	public static SObjectFields$<AppMenuItem> Fields;

	public Id ApplicationId;
	public SObject Application;
	public String CanvasAccessMethod;
	public Boolean CanvasEnabled;
	public String CanvasOptions;
	public String CanvasReferenceId;
	public String CanvasSelectedLocations;
	public String CanvasUrl;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String IconUrl;
	public Id Id;
	public String InfoUrl;
	public Boolean IsAccessible;
	public Boolean IsDeleted;
	public Boolean IsRegisteredDeviceOnly;
	public Boolean IsUsingAdminAuthorization;
	public Boolean IsVisible;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LogoUrl;
	public String MobileAppBinaryId;
	public String MobileAppInstallUrl;
	public Datetime MobileAppInstalledDate;
	public String MobileAppInstalledVersion;
	public String MobileAppVer;
	public String MobileDeviceType;
	public String MobileMinOsVer;
	public String MobilePlatform;
	public String MobileStartUrl;
	public String Name;
	public String NamespacePrefix;
	public Integer SortOrder;
	public String StartUrl;
	public Datetime SystemModstamp;
	public String Type;
	public Integer UserSortOrder;

	public AppMenuItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppMenuItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppMenuItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
