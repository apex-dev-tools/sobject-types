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
public class CareObservationComponent extends SObject {
	public static SObjectType$<CareObservationComponent> SObjectType;
	public static SObjectFields$<CareObservationComponent> Fields;

	public Id BaselineUnitId;
	public UnitOfMeasure BaselineUnit;
	public String BaselineValueText;
	public Id CareObservationId;
	public CareObservation CareObservation;
	public Id ComponentTypeCodeId;
	public CodeSetBundle ComponentTypeCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsObserved;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal LowerBaselineValue;
	public String MissingDataReason;
	public String Name;
	public Decimal NumericValue;
	public Datetime ObservationEndDateTime;
	public Datetime ObservationStartDateTime;
	public Id ObservedValueCodeId;
	public CodeSetBundle ObservedValueCode;
	public Decimal ObservedValueDenominator;
	public Decimal ObservedValueNumerator;
	public String ObservedValueText;
	public Id ObservedValueUnitId;
	public UnitOfMeasure ObservedValueUnit;
	public Datetime SystemModstamp;
	public Decimal UpperBaselineValue;
	public String ValueInterpretation;
	public String ValueType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
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
	public CareObservationComponentFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public CareObservationComponentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public CareObservationComponent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareObservationComponent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
