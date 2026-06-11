/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SlaProcess extends SObject {
	public static SObjectFields$<SlaProcess> Fields;

	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String NameNorm;
	public String SobjectType;
	public String StartDateField;
	public Datetime SystemModstamp;

	public EntityMilestone[] EntityMilestones;

	public SlaProcess clone$() {throw new java.lang.UnsupportedOperationException();}
	public SlaProcess clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SlaProcess clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SlaProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SlaProcess clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
