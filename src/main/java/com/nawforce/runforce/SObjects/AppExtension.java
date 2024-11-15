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
public class AppExtension extends SObject {
	public static SObjectType$<AppExtension> SObjectType;
	public static SObjectFields$<AppExtension> Fields;

	public String AppExtensionLabel;
	public String AppExtensionName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FieldServiceMobileSettingsId;
	public FieldServiceMobileSettings FieldServiceMobileSettings;
	public Id Id;
	public String InstallationUrl;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LaunchValue;
	public String ScopedToObjectTypes;
	public Datetime SystemModstamp;
	public String Type;

	public AppExtension clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppExtension clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppExtension clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppExtension clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppExtension clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
