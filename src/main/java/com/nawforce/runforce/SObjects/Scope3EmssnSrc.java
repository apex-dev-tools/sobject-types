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
public class Scope3EmssnSrc extends SObject {
	public static SObjectType$<Scope3EmssnSrc> SObjectType;
	public static SObjectFields$<Scope3EmssnSrc> Fields;

	public Id AirTravelEmssnFctrId;
	public AirTravelEmssnFctr AirTravelEmssnFctr;
	public String BusinessRegion;
	public String City;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id FrgtHaulingEmssnFctrId;
	public FrgtHaulingEmssnFctr FrgtHaulingEmssnFctr;
	public Id GroundTravelEmssnFctrId;
	public GroundTravelEmssnFctr GroundTravelEmssnFctr;
	public Id HotelStayEmssnFctrId;
	public HotelStayEmssnFctr HotelStayEmssnFctr;
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
	public Id ParentEmissionSourceId;
	public Scope3EmssnSrc ParentEmissionSource;
	public String PostalCode;
	public Id RentalCarEmssnFctrId;
	public RentalCarEmssnFctr RentalCarEmssnFctr;
	public String Scope3EmissionSourceType;
	public String State;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AirTravelEnrgyUse[] AirTravelEnergyUses;
	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Scope3EmssnSrc[] ChildAssets;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EmailMessage[] Emails;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public Scope3EmssnSrcFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FrgtHaulingEnrgyUse[] FreighHaulingEnergyUses;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedWaste[] GWScope3EmssnSrc;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroundTravelEnrgyUse[] GroundTravelEnergyUses;
	public Scope3EmssnSrcHistory[] Histories;
	public HotelStayEnrgyUse[] HotelStayEnergyUses;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3PcmtSummary[] ProcurementSummaries;
	public RentalCarEnrgyUse[] RentalCarEnergyUses;
	public Scope3CrbnFtprnt[] Scope3CarbonFootprints;
	public Scope3EmssnSrcShare[] Shares;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public WasteFootprint[] WasteFootprints;

	public Scope3EmssnSrc clone$() {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrc clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrc clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Scope3EmssnSrc clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
