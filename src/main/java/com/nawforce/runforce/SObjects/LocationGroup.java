/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class LocationGroup extends SObject {
	public static SObjectType$<LocationGroup> SObjectType;
	public static SObjectFields$<LocationGroup> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalReference;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String LocationGroupName;
	public Id OwnerId;
	public Name Owner;
	public Boolean ShouldSyncWithOci;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LocationGroupFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public LocationGroupHistory[] Histories;
	public InventoryItemReservation[] InventoryItemReservations;
	public LocationGroupAssignment[] LocationGroups;
	public NetworkActivityAudit[] ParentEntities;
	public LocationShippingCarrierMethod[] LocationShippingCarrierMethods;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public LocationGroupShare[] Shares;
	public WebStoreInventorySource[] WebStoreInventorySources;

	public LocationGroup clone$() {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LocationGroup clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
