/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Asset extends SObject {
	public static SObjectType$<Asset> SObjectType;
	public static SObjectFields$<Asset> Fields;

	public Id AccountId;
	public Account Account;
	public com.nawforce.runforce.System.Integer AssetLevel;
	public Id AssetProvidedById;
	public Account AssetProvidedBy;
	public Id AssetServicedById;
	public Account AssetServicedBy;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Decimal CurrentAmount;
	public Datetime CurrentLifecycleEndDate;
	public Decimal CurrentMrr;
	public Decimal CurrentQuantity;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.Boolean HasLifecycleManagement;
	public Id Id;
	public Date InstallDate;
	public com.nawforce.runforce.System.Boolean IsCompetitorProduct;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsInternal;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Datetime LifecycleEndDate;
	public Datetime LifecycleStartDate;
	public Id LocationId;
	public Location Location;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public Asset Parent;
	public Decimal Price;
	public Id Product2Id;
	public Product2 Product2;
	public com.nawforce.runforce.System.String ProductCode;
	public Date PurchaseDate;
	public Decimal Quantity;
	public Id RootAssetId;
	public Asset RootAsset;
	public com.nawforce.runforce.System.String SerialNumber;
	public com.nawforce.runforce.System.String Status;
	public com.nawforce.runforce.System.String StockKeepingUnit;
	public Datetime SystemModstamp;
	public Decimal TotalLifecycleAmount;
	public Date UsageEndDate;

	public ActivityHistory[] ActivityHistories;
	public AssetAction[] AssetActions;
	public AssetDowntimePeriod[] AssetDowntimePeriods;
	public AssetStatePeriod[] AssetStatePeriods;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public Case[] Cases;
	public Asset[] ChildAssets;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public AssetFeed[] Feeds;
	public AssetHistory[] Histories;
	public MaintenanceAsset[] MaintenanceAssets;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public AssetRelationship[] PrimaryAssets;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductServiceCampaignItem[] ProductServiceCampaignItems;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public AssetRelationship[] RelatedAssets;
	public ResourcePreference[] ResourcePreferences;
	public ReturnOrderLineItem[] ReturnOrderLineItems;
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
	public Asset clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Asset clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
