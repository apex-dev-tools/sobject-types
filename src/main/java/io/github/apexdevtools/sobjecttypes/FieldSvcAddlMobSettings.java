/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class FieldSvcAddlMobSettings extends SObject {
	public static SObjectType$<FieldSvcAddlMobSettings> SObjectType;
	public static SObjectFields$<FieldSvcAddlMobSettings> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FieldServiceMobileSettingsId;
	public FieldServiceMobileSettings FieldServiceMobileSettings;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsDummyChildField;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public FieldSvcAddlMobSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public FieldSvcAddlMobSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FieldSvcAddlMobSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FieldSvcAddlMobSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FieldSvcAddlMobSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
