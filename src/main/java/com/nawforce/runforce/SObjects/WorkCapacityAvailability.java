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
public class WorkCapacityAvailability extends SObject {
	public static SObjectType$<WorkCapacityAvailability> SObjectType;
	public static SObjectFields$<WorkCapacityAvailability> Fields;

	public Decimal AvailCapacityHours;
	public Decimal AvailCapacityMinutes;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Date StartDate;
	public Datetime SystemModstamp;
	public String TimePeriod;
	public String WcaUniqueField1;
	public String WcaUniqueField2;
	public String WorkCapacityAvailNumber;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DocumentEnvelope[] DocEnvelopeRefObjects;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WorkCapacityAvailabilityFeed[] Feeds;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public GeneratedDocument[] GeneratedDocRefObjects;
	public WorkCapacityAvailabilityShare[] Shares;
	public TopicAssignment[] TopicAssignments;

	public WorkCapacityAvailability clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityAvailability clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityAvailability clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityAvailability clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkCapacityAvailability clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
