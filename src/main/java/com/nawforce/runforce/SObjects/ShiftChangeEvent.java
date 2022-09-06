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
public class ShiftChangeEvent extends SObject {
	public static SObjectType$<ShiftChangeEvent> SObjectType;
	public static SObjectFields$<ShiftChangeEvent> Fields;

	public String BackgroundColor;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Id Id;
	public Boolean IsHolidayShift;
	public Boolean IsNonStandard;
	public Id JobProfileId;
	public JobProfile JobProfile;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public Id RecordsetFilterCriteriaId;
	public RecordsetFilterCriteria RecordsetFilterCriteria;
	public String ReplayId;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String ShiftNumber;
	public Id ShiftTemplateId;
	public ShiftTemplate ShiftTemplate;
	public Datetime StartTime;
	public String Status;
	public String StatusCategory;
	public String TimeSlotType;

	public ShiftChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ShiftChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ShiftChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ShiftChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ShiftChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
