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
public class AppointmentScheduleLog extends SObject {
	public static SObjectType$<AppointmentScheduleLog> SObjectType;
	public static SObjectFields$<AppointmentScheduleLog> Fields;

	public Date AppointmentDate;
	public Id AppointmentScheduleAggrId;
	public AppointmentScheduleAggr AppointmentScheduleAggr;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsUsedForResourceUtilization;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public Decimal ResourceUtilization;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Datetime SystemModstamp;
	public String UsageType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public AppointmentScheduleLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
