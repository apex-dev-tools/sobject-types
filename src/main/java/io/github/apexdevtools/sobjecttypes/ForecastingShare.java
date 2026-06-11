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
public class ForecastingShare extends SObject {
	public static SObjectType$<ForecastingShare> SObjectType;
	public static SObjectFields$<ForecastingShare> Fields;

	public String AccessLevel;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String RoleType;
	public Id SharedForecastManagerRoleId;
	public Name SharedForecastManagerRole;
	public Datetime SystemModstamp;
	public Id UserOrGroupId;
	public User UserOrGroup;

	public ForecastingShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public ForecastingShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ForecastingShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
