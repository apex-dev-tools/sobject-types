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
public class GroundTravelEmssnFctr extends SObject {
	public static SObjectType$<GroundTravelEmssnFctr> SObjectType;
	public static SObjectFields$<GroundTravelEmssnFctr> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyCode;
	public String CurrencyIsoCode;
	public String DistanceUnit;
	public String EmissionFactorDataSource;
	public String EmissionFactorUpdateYear;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Decimal PersCarEmssnInKgCh4DstnUnit;
	public Decimal PersCarEmssnInKgCo2DstnUnit;
	public Decimal PersCarEmssnInKgCo2eDstnUnit;
	public Decimal PersCarEmssnInKgN2oDstnUnit;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public Boolean ShouldLockDtastUpdtForRec;
	public Datetime SystemModstamp;
	public Decimal TaxiEmssnInKgCh4DstnUnit;
	public Decimal TaxiEmssnInKgCo2DstnUnit;
	public Decimal TaxiEmssnInKgCo2eDstnUnit;
	public Decimal TaxiEmssnInKgN2oDstnUnit;
	public Decimal TaxiRateForDstnUnit;
	public Decimal TrainEmssnInKgCh4DstnUnit;
	public Decimal TrainEmssnInKgCo2DstnUnit;
	public Decimal TrainEmssnInKgCo2eDstnUnit;
	public Decimal TrainEmssnInKgN2oDstnUnit;
	public Decimal TrainRateForDstnUnit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Scope3EmssnSrc[] ChildAssetsGroundTravelEmssnFctr;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public GroundTravelEmssnFctrFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroundTravelEnrgyUse[] GroundTravelEnergyUse;
	public GroundTravelEmssnFctrHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public GroundTravelEmssnFctrShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public GroundTravelEmssnFctr clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroundTravelEmssnFctr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
