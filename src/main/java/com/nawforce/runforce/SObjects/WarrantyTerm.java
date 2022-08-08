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
public class WarrantyTerm extends SObject {
	public static SObjectType$<WarrantyTerm> SObjectType;
	public static SObjectFields$<WarrantyTerm> Fields;

	public com.nawforce.runforce.System.String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String EffectiveStartDate;
	public com.nawforce.runforce.System.String ExchangeType;
	public com.nawforce.runforce.System.String Exclusions;
	public Decimal ExpensesCovered;
	public com.nawforce.runforce.System.Integer ExpensesCoveredDuration;
	public com.nawforce.runforce.System.String ExpensesCoveredUnitOfTime;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.Boolean IsTransferable;
	public Decimal LaborCovered;
	public com.nawforce.runforce.System.Integer LaborCoveredDuration;
	public com.nawforce.runforce.System.String LaborCoveredUnitOfTime;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Decimal PartsCovered;
	public com.nawforce.runforce.System.Integer PartsCoveredDuration;
	public com.nawforce.runforce.System.String PartsCoveredUnitOfTime;
	public Id Pricebook2Id;
	public Pricebook2 Pricebook2;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer WarrantyDuration;
	public com.nawforce.runforce.System.String WarrantyTermName;
	public com.nawforce.runforce.System.String WarrantyType;
	public com.nawforce.runforce.System.String WarrantyUnitOfTime;

	public ActivityHistory[] ActivityHistories;
	public AssetWarranty[] AssetWarrantyTerms;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public WarrantyTermFeed[] Feeds;
	public WarrantyTermHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductWarrantyTerm[] ProductWarrantyTerms;
	public WarrantyTermShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public WarrantyTerm clone$() {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WarrantyTerm clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
