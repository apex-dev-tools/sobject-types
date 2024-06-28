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
public class CareMetricTarget extends SObject {
	public static SObjectType$<CareMetricTarget> SObjectType;
	public static SObjectFields$<CareMetricTarget> Fields;

	public Id CodeId;
	public CodeSet Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal DetailRatioDenominator;
	public Decimal DetailRatioNumerator;
	public Id DetailRatioUnitId;
	public UnitOfMeasure DetailRatioUnit;
	public String DetailString;
	public Decimal DueDuration;
	public Id DueDurationUnitId;
	public UnitOfMeasure DueDurationUnit;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOutcomePositive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LowerLimit;
	public Id MeasureCodeId;
	public Name MeasureCode;
	public String Name;
	public Decimal NumericValue;
	public Id OwnerId;
	public Name Owner;
	public Id PatientId;
	public Account Patient;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String TargetedOutcome;
	public String Type;
	public Id UnitOfMeasureId;
	public UnitOfMeasure UnitOfMeasure;
	public Decimal UpperLimit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CareObservation[] CareMetricTargets;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public CareMetricTargetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareMetricTargetHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CareMetricTargetShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareMetricTarget clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTarget clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTarget clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareMetricTarget clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
