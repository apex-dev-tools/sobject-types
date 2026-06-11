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
public class SchedulingObjective extends SObject {
	public static SObjectType$<SchedulingObjective> SObjectType;
	public static SObjectFields$<SchedulingObjective> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String SchedulingCategory;
	public String SchedulingObjectiveType;
	public Datetime SystemModstamp;

	public SchedulingObjectiveParameter[] SchedulingObjectiveParameters;

	public SchedulingObjective clone$() {throw new java.lang.UnsupportedOperationException();}
	public SchedulingObjective clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingObjective clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingObjective clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SchedulingObjective clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
