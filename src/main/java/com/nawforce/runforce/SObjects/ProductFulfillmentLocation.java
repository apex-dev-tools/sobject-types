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
public class ProductFulfillmentLocation extends SObject {
	public static SObjectType$<ProductFulfillmentLocation> SObjectType;
	public static SObjectFields$<ProductFulfillmentLocation> Fields;

	public Id AccountId;
	public Account Account;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FulfillmentLocationId;
	public Location FulfillmentLocation;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ProductId;
	public Product2 Product;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ProductFulfillmentLocationFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public ProductFulfillmentLocationHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductFulfillmentLocationShare[] Shares;

	public ProductFulfillmentLocation clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProductFulfillmentLocation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProductFulfillmentLocation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProductFulfillmentLocation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProductFulfillmentLocation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
