/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Asset extends SObject {
	public static SObjectType$<Asset> SObjectType;
	public static SObjectFields$<Asset> Fields;

	public Id AccountId;
	public Account Account;
	public Address Address;
	public Integer AssetLevel;
	public Id AssetProvidedById;
	public Account AssetProvidedBy;
	public Id AssetServicedById;
	public Account AssetServicedBy;
	public Decimal Availability;
	public Decimal AverageUptimePerDay;
	public String City;
	public String ConsequenceOfFailure;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrentAmount;
	public Datetime CurrentLifecycleEndDate;
	public Decimal CurrentMrr;
	public Decimal CurrentQuantity;
	public String Description;
	public String DigitalAssetStatus;
	public String ExternalIdentifier;
	public String Division;
	public String GeocodeAccuracy;
	public Boolean HasLifecycleManagement;
	public Id Id;
	public Date InstallDate;
	public Boolean IsCompetitorProduct;
	public Boolean IsDeleted;
	public Boolean IsInternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Datetime LifecycleEndDate;
	public Datetime LifecycleStartDate;
	public Id LocationId;
	public Location Location;
	public Decimal Longitude;
	public Date ManufactureDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Asset Parent;
	public String PostalCode;
	public Decimal Price;
	public Id Product2Id;
	public Product2 Product2;
	public String ProductCode;
	public String ProductDescription;
	public String ProductFamily;
	public Date PurchaseDate;
	public Decimal Quantity;
	public Decimal Reliability;
	public Id RootAssetId;
	public Asset RootAsset;
	public String SerialNumber;
	public String State;
	public String StateCode;
	public String Status;
	public String StatusReason;
	public String StockKeepingUnit;
	public String Street;
	public Decimal SumDowntime;
	public Decimal SumUnplannedDowntime;
	public Datetime SystemModstamp;
	public Decimal TotalLifecycleAmount;
	public Datetime UptimeRecordEnd;
	public Datetime UptimeRecordStart;
	public Date UsageEndDate;
	public String Uuid;

	public ActivityHistory[] ActivityHistories;
	public AdvAcctForecastSetUse[] AdvAcctForecastSetUseForecastContext;
	public AppUsageAssignment[] AppUsageAssignments;
	public AssetAccountParticipant[] AssetAccountParticipantsAsset;
	public AssetAction[] AssetActions;
	public AssetAttribute[] AssetAttributes;
	public AssetContactParticipant[] AssetContactParticipantAsset;
	public AssetDowntimePeriod[] AssetDowntimePeriods;
	public AssetStatePeriod[] AssetStatePeriods;
	public CustomerProperty[] Assets;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public AuthApplicationAsset[] AuthRegApplicationAsset;
	public CareObservation[] CareObservations;
	public CareRegisteredDevice[] Care_Registered_Devices;
	public Case[] Cases;
	public ChangeRequestRelatedItem[] ChangeRequestRelatedItems;
	public Asset[] ChildAssets;
	public ClinicalServiceRequest[] ClinicalServRequestPerformer;
	public ClinicalServiceRequest[] ClinicalServRequestRequester;
	public CombinedAttachment[] CombinedAttachments;
	public AssessmentTaskContentDocument[] ContentDocumentContext;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public DataUsePurpose[] DataUsePurposes;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public DocumentChecklistItem[] DocumentChecklistItemPR;
	public EmailMessage[] Emails;
	public EngagementTopic[] EngagementInitiatedTopic;
	public Entitlement[] Entitlements;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssetFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GenericVisitTaskContext[] GVTaskContexts;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public AssetHistory[] Histories;
	public IncidentRelatedItem[] IncidentRelatedItems;
	public MaintenanceAsset[] MaintenanceAssets;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public PartyFinancialAsset[] PartyFinancialAssets;
	public AssetRelationship[] PrimaryAssets;
	public RevenueTransactionErrorLog[] PrimaryRevenueTransactionErrorLogs;
	public ProblemRelatedItem[] ProblemRelatedItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductServiceCampaignItem[] ProductServiceCampaignItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordAlert[] RecordAlertParent;
	public RecordAlert[] RecordAlertWhat;
	public RecordsetFltrCritMonitor[] RecordsetFltrCritMonitors;
	public AssetRelationship[] RelatedAssets;
	public RevenueTransactionErrorLog[] RelatedRevenueTransactionErrorLogs;
	public ResourcePreference[] ResourcePreferences;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public SerializedProduct[] SerializedProducts;
	public ServiceAppointment[] ServiceAppointments;
	public ServiceResource[] ServiceResources;
	public AssetShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public TaskRelation[] TaskRelations;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public AssetWarranty[] WarrantyAssets;
	public WorkOrderLineItem[] WorkOrderLineItems;
	public WorkOrder[] WorkOrders;
	public WorkPlanSelectionRule[] WorkPlanSelectionRules;

	public Asset clone$() {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
