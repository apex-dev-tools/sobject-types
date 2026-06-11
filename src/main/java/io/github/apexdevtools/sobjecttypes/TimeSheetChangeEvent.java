/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class TimeSheetChangeEvent extends SObject {
	public static SObjectType$<TimeSheetChangeEvent> SObjectType;
	public static SObjectFields$<TimeSheetChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Date StartDate;
	public String Status;
	public Integer TimeSheetEntryCount;
	public String TimeSheetNumber;
	public Integer TotalDurationInMinutes;

	public TimeSheetChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
