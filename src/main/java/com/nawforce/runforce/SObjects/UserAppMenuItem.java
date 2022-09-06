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
public class UserAppMenuItem extends SObject {
	public static SObjectType$<UserAppMenuItem> SObjectType;
	public static SObjectFields$<UserAppMenuItem> Fields;

	public String AppMenuItemId;
	public Id ApplicationId;
	public SObject Application;
	public String Description;
	public String IconUrl;
	public Id Id;
	public String InfoUrl;
	public Boolean IsUsingAdminAuthorization;
	public Boolean IsVisible;
	public String Label;
	public String LogoUrl;
	public String MobileStartUrl;
	public String Name;
	public Integer SortOrder;
	public String StartUrl;
	public String Type;
	public Integer UserSortOrder;

	public UserAppMenuItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
