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
	public AssetAction[] AssetActions;
	public AssetAttribute[] AssetAttributes;
	public AssetDowntimePeriod[] AssetDowntimePeriods;
	public AssetStatePeriod[] AssetStatePeriods;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public Asset[] ChildAssets;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public ContractLineItem[] ContractLineItems;
	public EmailMessage[] Emails;
	public Entitlement[] Entitlements;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssetFeed[] Feeds;
	public AssetHistory[] Histories;
	public MaintenanceAsset[] MaintenanceAssets;
	public NetworkUserHistoryRecent[] NetworkUserHistoryRecentToRecord;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public AssetRelationship[] PrimaryAssets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductServiceCampaignItem[] ProductServiceCampaignItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public RecordsetFltrCritMonitor[] RecordsetFltrCritMonitors;
	public AssetRelationship[] RelatedAssets;
	public ResourcePreference[] ResourcePreferences;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
	public SerializedProduct[] SerializedProducts;
	public ServiceAppointment[] ServiceAppointments;
	public AssetShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
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
