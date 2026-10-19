/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkforceCapacityUnit extends SObject {
	public static SObjectType$<WorkforceCapacityUnit> SObjectType;
	public static SObjectFields$<WorkforceCapacityUnit> Fields;

	public Decimal AssignedMaxCount;
	public Decimal AssignedTotalCount;
	public Decimal AvailableMaxCount;
	public Decimal AvailableTotalCount;
	public Decimal Capacity;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime DateTime;
	public String FeatureType;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOmni;
	public Boolean IsShiftTemplateNonStandard;
	public String JobProfileName;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MaxCount;
	public String MeasureUnit;
	public Integer OriginalTotalCount;
	public Integer ResourceGap;
	public String ServiceTerritoryName;
	public Decimal ShiftTemplateDuration;
	public String ShiftTemplateDurationType;
	public Id ShiftTemplateId;
	public ShiftTemplate ShiftTemplate;
	public String ShiftTemplateJobProfile;
	public String ShiftTemplateName;
	public Time ShiftTemplateStartTime;
	public Datetime SystemModstamp;
	public Integer TotalCount;
	public Id WorkDemographicId;
	public WorkDemographic WorkDemographic;
	public Id WorkforceCapacityId;
	public WorkforceCapacity WorkforceCapacity;

	public WorkforceCapacityUnit clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacityUnit clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacityUnit clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacityUnit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkforceCapacityUnit clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
