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
public class StnryAssetEnvrSrc extends SObject {
	public static SObjectType$<StnryAssetEnvrSrc> SObjectType;
	public static SObjectFields$<StnryAssetEnvrSrc> Fields;

	public String BusinessRegion;
	public String City;
	public String Country;
	public Id CrbnEmssnScopeAllocId;
	public CrbnEmssnScopeAlloc CrbnEmssnScopeAlloc;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id ElectricityEmssnFctrId;
	public ElectricityEmssnFctrSet ElectricityEmssnFctr;
	public Id EnvironmentalRiskId;
	public EnvironmentalRisk EnvironmentalRisk;
	public Id Id;
	public Boolean IsCompanyOwnedAsset;
	public Boolean IsDeleted;
	public Boolean IsLeedCertified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Date LeaseExpirationDate;
	public String LeaseIdentifier;
	public Id MktBsdElectriEmssnFctrId;
	public ElectricityEmssnFctrSet MktBsdElectriEmssnFctr;
	public String Name;
	public Decimal OccupiedFloorArea;
	public String OccupiedFloorAreaUnit;
	public Id OtherEmssnFctrId;
	public OtherEmssnFctrSet OtherEmssnFctr;
	public Id OwnerId;
	public Name Owner;
	public Id ParentEnvironmentalSourceId;
	public StnryAssetEnvrSrc ParentEnvironmentalSource;
	public String PostalCode;
	public String PremiseIdentifier;
	public Id RefrigerantEmssnFctrId;
	public RefrigerantEmssnFctr RefrigerantEmssnFctr;
	public Id RegionalBldgEnergyIntensityId;
	public BldgEnrgyIntensity RegionalBldgEnergyIntensity;
	public String State;
	public String StationaryAssetIdentifier;
	public String StationaryAssetType;
	public String StreetAddress;
	public String StreetAddress2;
	public Datetime SystemModstamp;
	public Decimal TotalFloorArea;
	public String TotalFloorAreaUnit;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public StnryAssetCrbnFtprnt[] CarbonFootprints;
	public StnryAssetEnvrSrc[] ChildAssets;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public StnryAssetEnvrSrcFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedWaste[] GWStnryAssetEnvrSrc;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public StnryAssetEnvrSrcHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3CrbnFtprnt[] Scope3CrbnFtprntStnryAssetEnvrSrc;
	public Scope3PcmtSummary[] Scope3PcmtSummaryStnryAssetEnvrSrc;
	public StnryAssetEnvrSrcShare[] Shares;
	public StnryAssetEnrgyUse[] StationaryAssetEnergyUses;
	public StnryAssetWaterActvty[] StationaryAssetWaterActivities;
	public StnryAssetAnnualFact[] StnryAssetAnnualFacts;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public WasteFootprint[] WasteFootprints;
	public StnryAssetWaterFtprnt[] WaterFootprints;

	public StnryAssetEnvrSrc clone$() {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public StnryAssetEnvrSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
