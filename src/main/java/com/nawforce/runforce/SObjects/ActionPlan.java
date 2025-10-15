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
public class ActionPlan extends SObject {
	public static SObjectType$<ActionPlan> SObjectType;
	public static SObjectFields$<ActionPlan> Fields;

	public String ActionPlanState;
	public Id ActionPlanTemplateVersionId;
	public ActionPlanTemplateVersion ActionPlanTemplateVersion;
	public String ActionPlanType;
	public Date ActualEndDate;
	public Date ActualStartDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsUsingHolidayHours;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String RecordCreationType;
	public Id RecurringScheduleId;
	public RecurrenceSchedule RecurringSchedule;
	public String ScheduleFrequency;
	public Boolean ShouldAllowOverride;
	public Date StartDate;
	public String StatusCode;
	public Datetime SystemModstamp;
	public Id TargetId;
	public Name Target;

	public ActionPlanItem[] ActionPlanItems;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AssessmentTask[] AssessmentTaskReferenceRecord;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ActionPlanFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordAlert[] RecordAlertWhat;
	public RecurrenceSchedule[] ReferenceRecord;
	public ActionPlanShare[] Shares;

	public ActionPlan clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlan clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlan clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlan clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
