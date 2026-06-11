/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class CustomPermission extends SObject {
	public static SObjectType$<CustomPermission> SObjectType;
	public static SObjectFields$<CustomPermission> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id ExternalClientApplicationId;
	public ExternalClientApplication ExternalClientApplication;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsLicensed;
	public Boolean IsProtected;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public CustomPermissionDependency[] CustomPermissionDependencyItem;
	public CustomPermissionDependency[] CustomPermissionItem;
	public GrantedByLicense[] GrantedByLicenses;
	public LicenseDefinitionCustomPermission[] LicenseAllowsCustomPermissions;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public CustomPermission clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
