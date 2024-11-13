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
public class GnrcVstKeyPerformanceInd extends SObject {
	public static SObjectType$<GnrcVstKeyPerformanceInd> SObjectType;
	public static SObjectFields$<GnrcVstKeyPerformanceInd> Fields;

	public String ActualBooleanValue;
	public Datetime ActualDateTimeValue;
	public Decimal ActualDecimalValue;
	public Integer ActualIntegerValue;
	public String ActualStringValue;
	public Id AssessmentIndDefinitionId;
	public AssessmentIndicatorDefinition AssessmentIndDefinition;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DefinitionReferenceId;
	public GnrcVstKeyPerformanceInd DefinitionReference;
	public String ExpectedBooleanValue;
	public Datetime ExpectedDateTimeValue;
	public Decimal ExpectedDecimalValue;
	public Integer ExpectedIntegerValue;
	public String ExpectedStringValue;
	public Id Id;
	public Boolean IsDefinition;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Integer SequenceNumber;
	public Datetime SystemModstamp;
	public String UnitOfMeasure;
	public Id VisitTaskContextId;
	public GenericVisitTaskContext VisitTaskContext;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public GnrcVstKeyPerformanceIndFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GnrcVstKeyPerformanceIndHistory[] Histories;
	public GnrcVstKeyPerformanceInd[] KeyPerformanceIndicatorRuntimeRecords;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GnrcVstKeyPerformanceInd clone$() {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstKeyPerformanceInd clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GnrcVstKeyPerformanceInd clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
