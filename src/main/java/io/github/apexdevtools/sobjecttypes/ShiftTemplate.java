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
public class ShiftTemplate extends SObject {
	public static SObjectType$<ShiftTemplate> SObjectType;
	public static SObjectFields$<ShiftTemplate> Fields;

	public String BackgroundColor;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Decimal Duration;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsNonStandard;
	public Id JobProfileId;
	public JobProfile JobProfile;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String ShiftTemplateDurationType;
	public Time StartTime;
	public Datetime SystemModstamp;
	public String TimeSlotType;

	public ShiftTemplateShare[] Shares;
	public ShiftPatternEntry[] ShiftPatternEntries;
	public Shift[] Shifts;

	public ShiftTemplate clone$() {throw new java.lang.UnsupportedOperationException();}
	public ShiftTemplate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ShiftTemplate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ShiftTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ShiftTemplate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
