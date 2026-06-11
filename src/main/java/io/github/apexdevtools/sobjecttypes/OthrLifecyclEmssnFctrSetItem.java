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
public class OthrLifecyclEmssnFctrSetItem extends SObject {
	public static SObjectType$<OthrLifecyclEmssnFctrSetItem> SObjectType;
	public static SObjectFields$<OthrLifecyclEmssnFctrSetItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ExternalIdentifier;
	public String FuelType;
	public Id FuelTypeRefId;
	public FuelType FuelTypeRef;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentEmissionFactorId;
	public OthrLifecyclEmssnFctrSet ParentEmissionFactor;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public Boolean ShouldLockDtastUpdtForRec;
	public Datetime SystemModstamp;
	public Decimal TrnsmDstrCh4EmssnFctr;
	public String TrnsmDstrCh4EmssnFctrUnit;
	public Decimal TrnsmDstrCo2EmssnFctr;
	public String TrnsmDstrCo2EmssnFctrUnit;
	public Decimal TrnsmDstrCo2eEmssnKl;
	public Decimal TrnsmDstrCo2eEmssnKm;
	public Decimal TrnsmDstrCo2eEmssnMwh;
	public Decimal TrnsmDstrN2oEmssnFctr;
	public String TrnsmDstrN2oEmssnFctrUnit;
	public Decimal TrnsmDstrSuplCo2eEmssn;
	public String TrnsmDstrSuplCo2eEmssnUnit;
	public Decimal Well2TkCh4EmssnFctr;
	public String Well2TkCh4EmssnFctrUnit;
	public Decimal Well2TkCo2EmssnFctr;
	public String Well2TkCo2EmssnFctrUnit;
	public Decimal Well2TkCo2eEmssnFctrKl;
	public Decimal Well2TkCo2eEmssnFctrKm;
	public Decimal Well2TkCo2eEmssnFctrMwh;
	public Decimal Well2TkN2oEmssnFctr;
	public String Well2TkN2oEmssnFctrUnit;
	public Decimal Well2TkSuplCo2eEmssn;
	public String Well2TkSuplCo2eEmssnUnit;
	public Decimal Well2TkTrnsmCh4Emssn;
	public String Well2TkTrnsmCh4EmssnUnit;
	public Decimal Well2TkTrnsmCo2Emssn;
	public String Well2TkTrnsmCo2EmssnUnit;
	public Decimal Well2TkTrnsmCo2eEmssnKl;
	public Decimal Well2TkTrnsmCo2eEmssnKm;
	public Decimal Well2TkTrnsmCo2eEmssnMwh;
	public Decimal Well2TkTrnsmN2oEmssn;
	public String Well2TkTrnsmN2oEmssnUnit;
	public Decimal Well2TkTrnsmSuplCo2e;
	public String Well2TkTrnsmSuplCo2eUnit;

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
	public OthrLifecyclEmssnFctrSetItemFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public OthrLifecyclEmssnFctrSetItemHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public OthrLifecyclEmssnFctrSetItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OthrLifecyclEmssnFctrSetItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
