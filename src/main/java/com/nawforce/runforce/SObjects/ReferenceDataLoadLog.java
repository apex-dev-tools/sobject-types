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
public class ReferenceDataLoadLog extends SObject {
	public static SObjectType$<ReferenceDataLoadLog> SObjectType;
	public static SObjectFields$<ReferenceDataLoadLog> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DatasetExternalIdentifier;
	public String DatasetName;
	public String DatasetType;
	public String Description;
	public String ErrorMessage;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime LoadDateTime;
	public String LoadStatus;
	public Id LoadedById;
	public User LoadedBy;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String Provider;
	public String Source;
	public Datetime SystemModstamp;
	public Integer TotalLoadedRecordCount;
	public Integer TotalSkippedRecordCount;
	public Decimal TotalTime;
	public String UsageType;
	public String VersionNameTag;
	public String VersionNumber;

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
	public ReferenceDataLoadLogFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ReferenceDataLoadLogHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public AirTravelEmssnFctr[] ReferenceAirTravelEmssnFctr;
	public BldgEnrgyIntensity[] ReferenceBldgEnrgyIntensity;
	public BldgEnrgyIntensityVal[] ReferenceBldgEnrgyIntensityVal;
	public ElectricityEmssnFctrSet[] ReferenceElectricityEmssnFctrSet;
	public FrgtHaulingEmssnFctr[] ReferenceFrgtHaulingEmssnFctr;
	public GroundTravelEmssnFctr[] ReferenceGroundTravelEmssnFctr;
	public HotelStayEmssnFctr[] ReferenceHotelStayEmssnFctr;
	public InflationRate[] ReferenceInflationRate;
	public OtherEmssnFctrSet[] ReferenceOtherEmssnFctrSet;
	public OtherEmssnFctrSetItem[] ReferenceOtherEmssnFctrSetItem;
	public PcmtEmssnFctrSet[] ReferencePcmtEmssnFctrSet;
	public PcmtEmssnFctrSetItem[] ReferencePcmtEmssnFctrSetItem;
	public ProductEmissionsFactor[] ReferenceProductEmissionsFactor;
	public RefrigerantEmssnFctr[] ReferenceRefrigerantEmssnFctr;
	public RentalCarEmssnFctr[] ReferenceRentalCarEmssnFctr;
	public WstDispoEmssnFctrSet[] ReferenceWstDispoEmssnFctrSet;
	public WstDispoEmssnFctrSetItm[] ReferenceWstDispoEmssnFctrSetItm;
	public ReferenceDataLoadLogShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;

	public ReferenceDataLoadLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
