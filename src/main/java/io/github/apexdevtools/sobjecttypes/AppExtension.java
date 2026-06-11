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
