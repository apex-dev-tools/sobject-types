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
public class TimeSheetEntryChangeEvent extends SObject {
	public static SObjectType$<TimeSheetEntryChangeEvent> SObjectType;
	public static SObjectFields$<TimeSheetEntryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Integer DurationInMinutes;
	public Datetime EndTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LocationTimeZone;
	public String ReplayId;
	public Datetime StartTime;
	public String Status;
	public String Subject;
	public String TimeSheetEntryNumber;
	public Id TimeSheetId;
	public TimeSheet TimeSheet;
	public String Type;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;
	public Id WorkOrderLineItemId;
	public WorkOrderLineItem WorkOrderLineItem;

	public TimeSheetEntryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetEntryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TimeSheetEntryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
