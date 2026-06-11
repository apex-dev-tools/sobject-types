/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class MobileSettingsAssignment extends SObject {
	public static SObjectType$<MobileSettingsAssignment> SObjectType;
	public static SObjectFields$<MobileSettingsAssignment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id FieldServiceMobileSettingsId;
	public FieldServiceMobileSettings FieldServiceMobileSettings;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;

	public MobileSettingsAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public MobileSettingsAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MobileSettingsAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MobileSettingsAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MobileSettingsAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
