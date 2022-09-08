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
public class ConsumptionSchedule extends SObject {
	public static SObjectType$<ConsumptionSchedule> SObjectType;
	public static SObjectFields$<ConsumptionSchedule> Fields;

	public Integer BillingTerm;
	public String BillingTermUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String MatchingAttribute;
	public String Name;
	public Integer NumberOfRates;
	public Id OwnerId;
	public Name Owner;
	public String RatingMethod;
	public Datetime SystemModstamp;
	public String Type;
	public String UnitOfMeasure;

	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ConsumptionRate[] ConsumptionRates;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ConsumptionScheduleFeed[] Feeds;
	public ConsumptionScheduleHistory[] Histories;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ProductConsumptionSchedule[] ProductConsumptionSchedules;
	public ConsumptionScheduleShare[] Shares;

	public ConsumptionSchedule clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConsumptionSchedule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConsumptionSchedule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
