/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkCapacityLimitChangeEvent extends SObject {
	public static SObjectType$<WorkCapacityLimitChangeEvent> SObjectType;
	public static SObjectFields$<WorkCapacityLimitChangeEvent> Fields;

	public String CapacityLimitRelaxation;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsFriday;
	public Boolean IsMonday;
	public Boolean IsSaturday;
	public Boolean IsSunday;
	public Boolean IsSvcTerrOnlyLimit;
	public Boolean IsThursday;
	public Boolean IsTuesday;
	public Boolean IsWednesday;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LimitationUnits;
	public Decimal LimitationValue;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Date StartDate;
	public String SvcApptField;
	public String SvcApptFieldValDplyNm;
	public String SvcApptFieldValue;
	public String TimePeriod;
	public String WorkCapacityLimitNumber;

	public WorkCapacityLimitChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimitChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityLimitChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
