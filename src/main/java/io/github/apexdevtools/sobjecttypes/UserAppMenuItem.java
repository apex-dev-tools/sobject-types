/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
