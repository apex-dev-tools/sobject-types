/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GroupClass extends SObject {
	public static SObjectType$<GroupClass> SObjectType;
	public static SObjectFields$<GroupClass> Fields;

	public Id AccountId;
	public Account Account;
	public String Category;
	public String Code;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Date EffectiveEndDate;
	public Date EffectiveStartDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id ParentGroupClassId;
	public GroupClass ParentGroupClass;
	public Datetime SystemModstamp;
	public String UsageType;

	public ActivityHistory[] ActivityHistories;
	public GroupClass[] ChildGroupClasses;
	public ContractGroupPlanGroupClass[] ContractGroupPlanGroupClasses;
	public EmailMessage[] Emails;
	public Event[] Events;
	public GroupCensusMember[] GroupCensusMembers;
	public GroupClassContribution[] GroupClassContributions;
	public GroupClassHistory[] Histories;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public Task[] Tasks;

	public GroupClass clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupClass clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupClass clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupClass clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
