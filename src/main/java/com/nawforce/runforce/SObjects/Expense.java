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
public class Expense extends SObject {
	public static SObjectType$<Expense> SObjectType;
	public static SObjectFields$<Expense> Fields;

	public Id AccountId;
	public Account Account;
	public Decimal Amount;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Decimal Discount;
	public Date ExpenseEndDate;
	public String ExpenseNumber;
	public Date ExpenseStartDate;
	public String ExpenseType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Decimal Quantity;
	public Decimal Subtotal;
	public Datetime SystemModstamp;
	public String Title;
	public Decimal TotalPrice;
	public Date TransactionDate;
	public Decimal UnitPrice;
	public Id WorkOrderId;
	public WorkOrder WorkOrder;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public ExpenseReportEntry[] ExpenseReportEntries;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ExpenseFeed[] Feeds;
	public ExpenseHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public NetworkActivityAudit[] ParentEntities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ExpenseShare[] Shares;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public Expense clone$() {throw new java.lang.UnsupportedOperationException();}
	public Expense clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Expense clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Expense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Expense clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
