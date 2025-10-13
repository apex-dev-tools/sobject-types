/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ActionPlanChangeEvent extends SObject {
	public static SObjectType$<ActionPlanChangeEvent> SObjectType;
	public static SObjectFields$<ActionPlanChangeEvent> Fields;

	public String ActionPlanState;
	public Id ActionPlanTemplateVersionId;
	public ActionPlanTemplateVersion ActionPlanTemplateVersion;
	public String ActionPlanType;
	public Date ActualEndDate;
	public Date ActualStartDate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsUsingHolidayHours;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String RecordCreationType;
	public Id RecurringScheduleId;
	public RecurrenceSchedule RecurringSchedule;
	public String ReplayId;
	public String ScheduleFrequency;
	public Boolean ShouldAllowOverride;
	public Date StartDate;
	public String StatusCode;
	public Id TargetId;
	public SObject Target;

	public ActionPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
