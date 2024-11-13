/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RecurrenceSchedule extends SObject {
	public static SObjectType$<RecurrenceSchedule> SObjectType;
	public static SObjectFields$<RecurrenceSchedule> Fields;

	public Integer CompletedScheduleCount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Datetime NextScheduleDateTime;
	public Id OwnerId;
	public Name Owner;
	public String ProcessName;
	public Id ReferenceRecordId;
	public ActionPlan ReferenceRecord;
	public Integer ScheduleDayValue;
	public String ScheduleFrequency;
	public Datetime StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Integer TotalRecurrencesCount;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecurrenceScheduleShare[] Shares;

	public RecurrenceSchedule clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecurrenceSchedule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecurrenceSchedule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecurrenceSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecurrenceSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
