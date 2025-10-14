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
public class VehicleAssetEmssnSrc extends SObject {
	public static SObjectType$<VehicleAssetEmssnSrc> SObjectType;
	public static SObjectFields$<VehicleAssetEmssnSrc> Fields;

	public String BusinessRegion;
	public String City;
	public String Country;
	public String CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String FleetVehicleType;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Date LeaseExpirationDate;
	public String LeaseIdentifier;
	public String Name;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public Name Owner;
	public Id ParentEmissionSourceId;
	public VehicleAssetEmssnSrc ParentEmissionSource;
	public String PostalCode;
	public String State;
	public String StreetAddress;
	public String StreetAddress2;
	public Datetime SystemModstamp;
	public String VehicleIdentifier;
	public String VehicleType;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public VehicleAssetCrbnFtprnt[] CarbonFootprints;
	public VehicleAssetEmssnSrc[] ChildVehicleAssets;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public SustainabilityStakeholder[] ESGReferenceObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public VehicleAssetEmssnSrcFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public VehicleAssetEmssnSrcHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public VehicleAssetEmssnSrcShare[] Shares;
	public YearlyUsageTrkgDataGap[] SourceObjectRelation;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public VehicleAssetEnrgyUse[] VehicleAssetEnergyUses;

	public VehicleAssetEmssnSrc clone$() {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VehicleAssetEmssnSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
