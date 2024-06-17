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
public class ActivityTiming extends SObject {
	public static SObjectType$<ActivityTiming> SObjectType;
	public static SObjectFields$<ActivityTiming> Fields;

	public Decimal ActivityCountPerRepetition;
	public Decimal ActivityDuration;
	public Id ActivityDurationUnitId;
	public UnitOfMeasure ActivityDurationUnit;
	public String ActivityTime;
	public Integer ActivityTimeOffset;
	public Integer CountInPeriod;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Integer MaxActivityCountPerRepetition;
	public Decimal MaxActivityDuration;
	public Integer MaxCountInPeriod;
	public Decimal MaxRepetitionCycleLength;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime PeriodEndDateTime;
	public Integer PeriodLength;
	public Decimal PeriodLengthLowerLimit;
	public Id PeriodLengthUnitId;
	public UnitOfMeasure PeriodLengthUnit;
	public Decimal PeriodLengthUpperLimit;
	public Datetime PeriodStartDateTime;
	public Decimal RepetitionCycleLength;
	public Id RepetitionCycleUnitId;
	public UnitOfMeasure RepetitionCycleUnit;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public Datetime SystemModstamp;
	public Id TimingCodeId;
	public CodeSet TimingCode;
	public String UsageType;
	public Id WeeklyActivityTimeId;
	public OperatingHours WeeklyActivityTime;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ActivityTimingFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ActivityTimingHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ActivityTimingShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ActivityTiming clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivityTiming clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTiming clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTiming clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivityTiming clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
