/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class IndicatorPerformancePeriod extends SObject {
	public static SObjectType$<IndicatorPerformancePeriod> SObjectType;
	public static SObjectFields$<IndicatorPerformancePeriod> Fields;

	public String BaselineDescription;
	public Decimal BaselineValue;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id IndicatorAssignmentId;
	public IndicatorAssignment IndicatorAssignment;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Date LastResultMeasurementDate;
	public Decimal LastResultValue;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;
	public String TargetProgress;
	public Decimal TargetValue;
	public Id TimePeriodId;
	public TimePeriod TimePeriod;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public IndicatorPerformancePeriodFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public IndicatorPerformancePeriodHistory[] Histories;
	public IndicatorResult[] IndicatorResults;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public IndicatorPerformancePeriod clone$() {throw new java.lang.UnsupportedOperationException();}
	public IndicatorPerformancePeriod clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorPerformancePeriod clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorPerformancePeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IndicatorPerformancePeriod clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
