/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
	public SetupEntityAccess[] SetupEntityAccessItems;

	public CustomPermission clone$() {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CustomPermission clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
