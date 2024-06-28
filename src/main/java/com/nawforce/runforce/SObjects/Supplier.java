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
public class Supplier extends SObject {
	public static SObjectType$<Supplier> SObjectType;
	public static SObjectFields$<Supplier> Fields;

	public Id AccountId;
	public Account Account;
	public String CompanyRelationshipType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AirTravelEnrgyUse[] AirTravelEnergyUseSupplier;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CrbnCreditProject[] CarbonCreditProjects;
	public CleanEnergyProject[] CleanEnergyProjects;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public ElectricityEmssnFctrSet[] ElectricityEmssnFctrSets;
	public EmailMessage[] Emails;
	public EnergyAttrCertCredit[] EnergyAttributeCertificateCredits;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public SupplierFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public FrgtHaulingEnrgyUse[] FreightHaulingEnergyUseSupplier;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedWaste[] GWSupplier;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public GroundTravelEnrgyUse[] GroundTravelEnergyUses;
	public SupplierHistory[] Histories;
	public HotelStayEnrgyUse[] HotelStayEnrgyUseSupplier;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Scope3PcmtItem[] ProcurementItems;
	public ProductEmissionsFactor[] ProductEmissionsFactorSupplier;
	public RentalCarEnrgyUse[] RentalCarEnergyUseSupplier;
	public SustainabilityScorecard[] SScorecards;
	public StnryAssetEnrgyUse[] StationaryAssetAccounts;
	public StnryAssetWaterActvty[] StationaryAssetWaterActivities;
	public SupplierProduct[] SupplierProductSuppliers;
	public SustainabilityCredit[] SustainabilityCredits;
	public SustainabilityPurchase[] SustainabilityPurchases;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public VehicleAssetEnrgyUse[] VehicleAssetEnrgyUseSupplier;

	public Supplier clone$() {throw new java.lang.UnsupportedOperationException();}
	public Supplier clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Supplier clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Supplier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Supplier clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
